package com.company.programmers.oil_drilling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * create on 2024/03/04.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class OilDrilling {

  public int solution(int[][] land) {
    int row = land.length;
    int col = land[0].length;

    int[] oilCount = new int[col];

    for (int r = 0; r < row; r++) {
      for (int c = 0; c < col; c++) {
        if (land[r][c] == 1) {
          // 탐색
          bfs(land, r, c, oilCount);
        }
      }
    }

    return Arrays.stream(oilCount)
        .max()
        .orElse(0);
  }

  private void bfs(int[][] land, int r, int c, int[] oilCount) {
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{r,c});

    // 석유 사용.
    land[r][c] = 0;

    // 열 위치
    Set<Integer> drilling = new HashSet<>();

    int count = 1;

    drilling.add(c);
    int row = land.length;
    int col = land[0].length;
    int[][] xy = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; // 상, 우, 하, 좌

    while(!q.isEmpty()) {
      int[] curr = q.poll();
      drilling.add(curr[1]);

      for (int[] v : xy) {
        int x = v[0];
        int y = v[1];
        int nx = curr[0] + x;
        int ny = curr[1] + y;

        if (nx < 0 || nx >= row || ny < 0 || ny >= col || land[nx][ny] == 0) {
          continue;
        }

        q.add(new int[]{nx, ny});
        land[nx][ny] = 0;
        count += 1;
      }
    }

    for (Integer field : drilling) {
      oilCount[field] += count;
    }
  }

  public static void main(String[] args) {
    OilDrilling oilDrilling = new OilDrilling();

    int value = oilDrilling.solution(
        new int[][]{{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0},
            {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}});
    System.out.println(value);
  }

}
