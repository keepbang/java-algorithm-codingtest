package com.company.leetcode.strange_printer2;

import java.util.HashSet;
import java.util.Set;

/**
 * 1591. Strange Printer II
 * 각 색상별 min, max 범위로 사각형을 판단함.
 * 색상별 체크를 할 때 사각형 범위 내에서 다른 색상이 존재할 경우 false return
 */
public class StrangePrinter2 {

  public boolean isPrintable(int[][] targetGrid) {
    int[][] colorBound = new int[61][4];
    // 색상이 있을경우 추가
    Set<Integer> colors = new HashSet<>();
    // prepare colorBound with Max and Min integer for later compare
    for (int i = 0; i < colorBound.length; i++) {
      for (int j = 0; j < colorBound[0].length; j++) {
        if (j == 0 || j == 1) {
          colorBound[i][j] = Integer.MAX_VALUE;
        } else {
          colorBound[i][j] = Integer.MIN_VALUE;
        }
      }
    }
    // find the color range for each color
    // each color i has a colorBound[i] with {min_i, min_j, max_i, max_j}
    for (int i = 0; i < targetGrid.length; i++) {
      for (int j = 0; j < targetGrid[0].length; j++) {
        colorBound[targetGrid[i][j]][0] = Math.min(colorBound[targetGrid[i][j]][0], i);
        colorBound[targetGrid[i][j]][1] = Math.min(colorBound[targetGrid[i][j]][1], j);
        colorBound[targetGrid[i][j]][2] = Math.max(colorBound[targetGrid[i][j]][2], i);
        colorBound[targetGrid[i][j]][3] = Math.max(colorBound[targetGrid[i][j]][3], j);
        colors.add(targetGrid[i][j]);
      }
    }
    boolean[] printed = new boolean[61]; // init : false
    boolean[][] visited = new boolean[targetGrid.length][targetGrid[0].length];

    // DFS all the colors, skip the color already be printed
    for (Integer color : colors) {
      if (printed[color]) {
        continue;
      }
      if (!dfs(targetGrid, printed, colorBound, visited, color)) {
        return false;
      }
    }
    // if all color has been printed, then return true
    return true;
  }

  private boolean dfs(
      int[][] targetGrid,
      boolean[] printed,
      int[][] colorBound,
      boolean[][] visited,
      int color) {
    printed[color] = true; // 출력됨
    for (int i = colorBound[color][0]; i <= colorBound[color][2]; i++) {
      for (int j = colorBound[color][1]; j <= colorBound[color][3]; j++) {
        // 만약 방문한 장소라면 스킵한다.
        if (visited[i][j]) {
          continue;
        }

        if (targetGrid[i][j] != color) {
          if (printed[targetGrid[i][j]]) {
            return false;
          }
          // 현재 색상과 체크해야하는 색상이 같이 않았을 때 정상적인 사각형 범위라면 해당부분은 타면 안된다.
          if (!dfs(targetGrid, printed, colorBound, visited, targetGrid[i][j])) {
            return false;
          }
        }
        visited[i][j] = true;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    StrangePrinter2 strangePrinter = new StrangePrinter2();

//    strangePrinter.isPrintable(new int[][]{{1,1,1,1},{1,2,2,1},{1,2,2,1},{1,1,1,1}});
//    strangePrinter.isPrintable(new int[][]{{1,1,1,1},{1,1,3,3},{1,1,3,4},{5,5,1,4}});
    boolean printable = strangePrinter.isPrintable(new int[][]{{1, 2, 1}, {1, 2, 1}, {1, 1, 2}});
    System.out.println("printable = " + printable);
  }

  public void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
