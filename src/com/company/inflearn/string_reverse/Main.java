package com.company.inflearn.string_reverse;

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

  // StringBuilder 사용
  public String[] solution(String[] str) {
    String[] answerList = new String[str.length];
    for (int i = 0; i < str.length; i++) {
      String reverseStr = new StringBuilder(str[i]).reverse()
          .toString();

      answerList[i] = reverseStr;
    }
    return answerList;
  }

  // reverse 구현
  public String[] solution1(String[] str) {
    String[] answerList = new String[str.length];

    for (int i = 0; i < str.length; i++) {
      int lt = 0;
      int rt = str[i].length()-1;
      char[] charArr = str[i].toCharArray();

      while(lt < rt){
        char tmp = charArr[lt];
        charArr[lt] = charArr[rt];
        charArr[rt] = tmp;
        lt++;
        rt--;
      }

      answerList[i] = String.valueOf(charArr);

    }

    return answerList;
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    String[] strList = new String[count];
    for (int i = 0; i < count; i++) {
      strList[i] = br.readLine();
    }

    for (String s : main.solution1(strList)) {
      System.out.println(s);
    }
  }

}
