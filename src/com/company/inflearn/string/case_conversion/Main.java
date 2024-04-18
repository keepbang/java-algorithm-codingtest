package com.company.inflearn.string.case_conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public String solution(String input) {
    StringBuilder answer = new StringBuilder();
    for (char c : input.toCharArray()) {
      if (c >= 65 && c <= 90) { // 대문자일경우
        answer.append((char) (c + 32)); // 소문자로 변환
      } else {
        answer.append((char) (c - 32)); // 대문자로 변환
      }
    }

    return answer.toString();
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    System.out.println(main.solution(input));
  }
}
