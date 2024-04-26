package com.company.inflearn.two_pointer_window.prom4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * create on 4/26/24. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyung Chae (Keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public int solution(int n, int m, int[] arr) {
    int count = 0;
    int sum = 0;
    int start = 0;

    for (int end = 0; end < n; end++) {
      sum += arr[end]; // 현재 부분 수열의 합에 end 위치의 숫자 추가

      while (sum > m) { // 현재 부분 수열의 합이 M보다 크다면 start 위치의 숫자를 제외하고 합에서도 빼줌
        sum -= arr[start];
        start++;
      }

      if (sum == m) { // 현재 부분 수열의 합이 M과 같다면 경우의 수 증가
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numStr = br.readLine().split(" ");
    int n = Integer.parseInt(numStr[0]);
    int m = Integer.parseInt(numStr[1]);

    int[] arr = new int[n];
    String[] str = br.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }

    System.out.println(main.solution(n, m, arr));

  }

}
