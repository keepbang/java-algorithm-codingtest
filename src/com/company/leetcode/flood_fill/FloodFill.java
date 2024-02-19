package com.company.leetcode.flood_fill;

import java.util.Stack;

/**
 * create on 2024/02/19.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class FloodFill {

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int pixelColor = image[sr][sc];

    if (pixelColor == color) {
      return image;
    }

    Stack<Integer> stackRow = new Stack<>();
    Stack<Integer> stackCell = new Stack<>();

    stackRow.push(sr);
    stackCell.push(sc);

    while (!stackRow.empty() && !stackCell.empty()) {
      Integer row = stackRow.pop();
      Integer cell = stackCell.pop();

      if (image[row][cell] == pixelColor) {
        image[row][cell] = color;

        if ((row - 1) >= 0) {
          stackRow.push(row - 1);
          stackCell.push(cell);
        }

        if ((cell - 1) >= 0) {
          stackRow.push(row);
          stackCell.push(cell - 1);
        }

        if ((cell + 1) < image[0].length) {
          stackRow.push(row);
          stackCell.push(cell + 1);
        }

        if ((row + 1) < image.length) {
          stackRow.push(row + 1);
          stackCell.push(cell);
        }
      }
    }

    return image;
  }

  // 재귀 사용
  public int[][] floodFill1(int[][] image, int sr, int sc, int color) {
    int pixelColor = image[sr][sc];

    if (pixelColor == color) {
      return image;
    }

    dfs(image, sr, sc, pixelColor, color);

    return image;
  }

  public void dfs(int[][] image, int sr, int sc, int pixelColor, int color) {
    if (image[sr][sc] == pixelColor) {
      image[sr][sc] = color;

      if ((sr - 1) >= 0) {
        dfs(image, sr - 1, sc, pixelColor, color);
      }

      if ((sc - 1) >= 0) {
        dfs(image, sr, sc - 1, pixelColor, color);
      }

      if ((sc + 1) < image[0].length) {
        dfs(image, sr, sc + 1, pixelColor, color);
      }

      if ((sr + 1) < image.length) {
        dfs(image, sr + 1, sc, pixelColor, color);
      }
    }
  }
}
