package com.company.inflearn.two_pointer_window.prom6;

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
    int answer = 0, cnt = 0;
    int pl = 0;

    for (int pr = 0; pr < n; pr++) {
      if (arr[pr] == 0) cnt++;
      while (cnt > k) {
        if (arr[pl]==0) cnt--;
        pl++;
      }
      answer = Math.max(answer, pr - pl + 1);
    }

    return answer;
  }

  public static void main(String[] args) throws IOException {
    Main m = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numStr = br.readLine().split(" ");
    int n = Integer.parseInt(numStr[0]);
    int k = Integer.parseInt(numStr[1]);

    int[] arr = new int[n];
    String[] str = br.readLine().split(" ");

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }

    System.out.println(m.solution(n, k, arr));


  }

}
