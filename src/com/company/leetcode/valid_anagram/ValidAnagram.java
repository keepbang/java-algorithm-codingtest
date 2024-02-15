package com.company.leetcode.valid_anagram;

import java.util.Arrays;

/**
 * create on 2024/02/15.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    char[] sChar = s.toCharArray();
    char[] tChar = t.toCharArray();

    Arrays.sort(sChar);
    Arrays.sort(tChar);

    s = Arrays.toString(sChar);
    t = Arrays.toString(tChar);

    if (s.equals(t)) {
      return true;
    }

    return false;

  }

}
