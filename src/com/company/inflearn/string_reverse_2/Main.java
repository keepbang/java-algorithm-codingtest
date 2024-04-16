package com.company.inflearn.string_reverse_2;

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
  // reverse 구현
  public String solution1(String str) {

    int lt = 0;
    int rt = str.length()-1;
    char[] charArr = str.toCharArray();

    while(lt < rt){
      if (!Character.isAlphabetic(charArr[lt])) lt++;
      else if (!Character.isAlphabetic(charArr[rt])) rt--;
      else {
        char tmp = charArr[lt];
        charArr[lt] = charArr[rt];
        charArr[rt] = tmp;
        lt++;
        rt--;
      }
    }

    return String.valueOf(charArr);
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    System.out.println(main.solution1(str));
  }
}
