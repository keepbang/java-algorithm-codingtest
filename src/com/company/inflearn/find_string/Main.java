package com.company.inflearn.find_string;

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

  public int solution(String str, char findChar) {
    String upperStr = str.toUpperCase();
    char c = Character.toUpperCase(findChar);

    int count = 0;

    for (char x: upperStr.toCharArray()) {
      if (x == c) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char findChar = br.readLine().charAt(0);
    int count = main.solution(str, findChar);
    System.out.println(count);
  }

}
