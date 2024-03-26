package com.company.leetcode.longest_substring_without_repeating_characters;

/**
 * create on 2024/03/26.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int i = solution.lengthOfLongestSubstring("dabcagcf");
    System.out.println("i = " + i);
  }
  public int lengthOfLongestSubstring(String s) {

    int n = s.length();
    int maxLength = 0;
    StringBuilder repeatingStr = new StringBuilder();

    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);

      int repeat = repeatingStr.toString().indexOf(c);

      if (repeat != -1) {
        // 문자가 존재할 경우
        if (repeatingStr.length() > maxLength) {
          maxLength = repeatingStr.length();
        }
        String substring = repeatingStr.substring(repeat + 1);
        System.out.println("substring = " + substring);
        repeatingStr = new StringBuilder(substring);
      }
      repeatingStr.append(c);
    }

    if (repeatingStr.length() > maxLength) {
      return repeatingStr.length();
    }

    return maxLength;

  }
}
