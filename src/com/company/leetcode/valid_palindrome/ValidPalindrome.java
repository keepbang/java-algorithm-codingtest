package com.company.leetcode.valid_palindrome;

/**
 * create on 2024/02/14.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    String regex = "[^0-9a-z]";
    String lowerStr = s.toLowerCase();
    String replacedStr = lowerStr.replaceAll(regex, "");

    int p1 = 0;
    int p2 = replacedStr.length() - 1;

    char[] charArray = replacedStr.toCharArray();

    boolean answer = true;

    while(p1 < p2) {
      if (charArray[p1] == charArray[p2]) {
        p1++;
        p2--;
      } else {
        answer = false;
        break;
      }
    }

    return answer;

  }
}
