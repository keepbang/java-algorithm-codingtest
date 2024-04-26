package com.company.inflearn.two_pointer_window.prom3;

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

  public int solution(int n, int k, int[] arr) {
    int sum = 0, p = 0;
    for (int i = 0; i < k; i++) {
      int sale = arr[i];
      sum += sale;
    }

    int maxValue = sum;
    for (int i = k; i < n; i++) {
      sum = sum - arr[p++] + arr[i];
      maxValue = Math.max(sum, maxValue);
    }

    return maxValue;
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numStr = br.readLine().split(" ");
    int n = Integer.parseInt(numStr[0]);
    int k = Integer.parseInt(numStr[1]);

    int[] arr = new int[n];
    String[] str = br.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }

    System.out.println(main.solution(n, k, arr));

  }

}
