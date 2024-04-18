package com.company.inflearn.string.string_password;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * create on 4/16/24. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyung Chae (Keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  private String solution(int n, String str) {
    String answer = "";

    str = convertPassword(str);

    for (int i = 0; i < n; i++) {
      String tmp = str.substring(i*7, i*7+7);
      char ascii = (char) Integer.parseInt(tmp, 2);
      answer += ascii;
    }


    return answer;
  }

  private String convertPassword(String str) {
    return str.replace('#','1')
        .replace('*','0');
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    System.out.println(main.solution(n, str));
  }

}
