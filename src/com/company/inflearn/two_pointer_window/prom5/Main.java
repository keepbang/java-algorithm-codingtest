package com.company.inflearn.two_pointer_window.prom5;

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
  public int solution(int n) {
    int count = 0;
    int sum = 0;
    int start = 0;
    int end = n/2 + 1;

    for (int i = 0; i <= end; i++) {
      sum += i;

      while (sum > n) {
        sum -= start++;
      }

      if (sum == n) {
        count++;
      }
    }

    return count;
  }

  public int solution1(int n) {
    int count = 0;
    int tmp = 1;
    for (int i = 2; i * (i + 1) / 2 <= n; i++) {
      tmp += i;
      if ((n - tmp) % i == 0) {
        count++;
      }
    }
    return count;
  }

  public int solution2(int n) {
    int count = 0;
    int i = 1;
    n--;
    while(n > 0) {
      i++;
      n -= i;
      if (n % i == 0) {
        count++;
      }
    }
    return count;
  }


  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    System.out.println(main.solution2(n));

  }
}
