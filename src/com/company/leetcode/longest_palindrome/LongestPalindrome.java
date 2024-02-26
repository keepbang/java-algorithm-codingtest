package com.company.leetcode.longest_palindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * create on 2024/02/26.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class LongestPalindrome {

  public int longestPalindrome(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray()) {
      map.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
    }

    int answer = 0;
    int hasOdd = 0;

    Set<Character> characters = map.keySet();

    for (Character character : characters) {
      Integer count = map.get(character);
      if (count % 2 == 0) {
        answer += count;
      } else {
        answer += count - hasOdd;
        hasOdd = 1;
      }
    }

    return answer;
  }

}
