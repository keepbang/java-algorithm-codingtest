package com.company.inflearn.find_long_string;

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

  public String solution(String input) {
    String[] splitStr = input.split(" ");
    String maxStr = "";
    for (String s : splitStr) {
      if (maxStr.length() < s.length()) {
        maxStr = s;
      }
    }
    return maxStr;
  }

  public String solution1(String input) {
    String maxStr = "";

    int pos;

    while ((pos=input.indexOf(' ')) != -1) {
      String tmp = input.substring(0, pos);
      if (maxStr.length() < tmp.length()) {
        maxStr = tmp;
      }
      input = input.substring(pos + 1);
    }

    if (input.length() > maxStr.length()) {
      return input;
    }

    return maxStr;
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    System.out.println(main.solution1(input));
  }

}
