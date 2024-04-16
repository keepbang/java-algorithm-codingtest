package com.company.inflearn.string_zip;

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

  public String solution(String str) {
    int count = 1;
    String answer = "";

    for (int i = 0; i < str.toCharArray().length; i++) {
      if (i == str.length() - 1) {
        answer = answer + str.charAt(i) + (count == 1 ? "" : count);
        break;
      }
      if (str.charAt(i) == str.charAt(i + 1)) {
        count++;
      } else {
        answer = answer + str.charAt(i) + (count == 1 ? "" : count);
        count = 1;
      }
    }

    return answer;

  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    System.out.println(main.solution(str));
  }

}
