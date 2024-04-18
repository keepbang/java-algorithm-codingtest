package com.company.inflearn.array.prom9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * create on 4/17/24. create by IntelliJ IDEA.
 *
 * <pre>
 * 설명
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * 출력
 * 최대합을 출력합니다.
 * </pre>
 *
 * @author Gibyung Chae (Keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public int solution(int n, int[][] arr) {
    int maxValue = Integer.MIN_VALUE;

    // 대각선
    int crossL = 0;
    int crossR = 0;

    for (int i = 0; i < n; i++) {
      int rowSum = 0;
      int colSum = 0;
      for (int j = 0; j < n; j++) {
        rowSum += arr[i][j];
        colSum += arr[j][i];
      }

      crossL += arr[i][i];
      crossR += arr[i][n-i-1];

      int tmp = Math.max(colSum, rowSum);
      maxValue = Math.max(maxValue, tmp);
    }

    int maxCross = Math.max(crossL, crossR);

    return Math.max(maxCross, maxValue);
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      String[] numbers = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(numbers[j]);
      }
    }

    System.out.println(main.solution(n, arr));

  }

}
