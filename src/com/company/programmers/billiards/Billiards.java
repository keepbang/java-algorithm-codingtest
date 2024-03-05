package com.company.programmers.billiards;

/**
 * create on 2024/03/05.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Billiards {

  public int[] solution(int m, int n, int startX, int startY, int[][] balls) {

    // 결과값
    int[] results = new int[balls.length];

    for (int i = 0; i < balls.length; i++) {
      // 목표
      int targetX = balls[i][0];
      int targetY = balls[i][1];

      double result = Integer.MAX_VALUE;

      // 위
      if (!(startX == targetX && startY < targetY)) {
        int a = Math.abs(startX - targetX);
        int b = (2 * (n - targetY) + targetY) - startY;
        result = getMinResult(a, b, result);
      }

      // 아래
      if (!(startX == targetX && startY > targetY)) {
        int a = Math.abs(startX - targetX);
        int b = 2 * targetY + (startY - targetY);
        result = getMinResult(a, b, result);
      }

      // 좌
      if (!(startY == targetY && startX > targetX)) {
        int a = Math.abs(startY - targetY);
        int b = 2 * targetX + (startX - targetX);
        result = getMinResult(a, b, result);
      }

      // 우
      if (!(startY == targetY && startX < targetX)) {
        int a = Math.abs(startY - targetY);
        int b = (2 * (m - targetX) + targetX) - startX;
        result = getMinResult(a, b, result);
      }

      results[i] = (int) result;
    }

    return results;

  }

  private double getMinResult(double a, double b, double minResult) {
    double powC = Math.pow(a, 2) + Math.pow(b, 2);
    return Math.min(minResult, powC);
  }

}
