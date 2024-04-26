package com.company.inflearn.map_set.prom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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

  public static void main(String[] args) throws IOException {
    Main m = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();

    System.out.println(m.solution(n, str));
  }

  private String solution(int n, String str) {
    Map<Character, Integer> charCountMap = new HashMap<>();

    // 각 문자의 등장 횟수를 세기
    for (int i = 0; i < n; i++) {
      char currentChar = str.charAt(i);
      charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
    }

    // 가장 많이 등장하는 문자 찾기
    String answer = "";
    int maxCount = 0;
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        answer = entry.getKey().toString();
      }
    }

    return answer;
  }
}
