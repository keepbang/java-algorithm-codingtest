package com.company.inflearn.array.large_number_print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * create on 4/17/24. create by IntelliJ IDEA.
 *
 * <p>
 * 설명
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 * </p>
 *
 * @author Gibyung Chae (Keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public int[] solution(int n, int[] arr) {
    ArrayList<Integer> tmp = new ArrayList<>();

    if (n == 0 || n == 1) {
      return arr;
    }

    tmp.add(arr[0]);

    for (int i = 1; i < n; i++) {
      if (arr[i - 1] < arr[i]) {
        tmp.add(arr[i]);
      }
    }

    return tmp.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] strArr = br.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    int[] result = main.solution(n, arr);

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

  }

}
