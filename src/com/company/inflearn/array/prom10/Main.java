package com.company.inflearn.array.prom10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * create on 4/17/24. create by IntelliJ IDEA.
 *
 * <pre>
 * 설명
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * 출력
 * 봉우리의 개수를 출력하세요.
 * </pre>
 *
 * @author Gibyung Chae (Keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public int solution(int n, int[][] arr) {
    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (isPeaks(arr, i, j, n)) {
          count++;
        }
      }
    }

    return count;
  }

  public boolean isPeaks(int[][] arr, int i, int j, int n) {
    int checkNum = arr[i][j];
    if ((j+1 == n || checkNum > arr[i][j + 1])
        && (j-1 == -1 || checkNum > arr[i][j - 1])
        && (i+1 == n || checkNum > arr[i + 1][j])
        && (i-1 == -1 || checkNum > arr[i - 1][j])) {
      return true;
    }
    return false;
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
