package com.company.leetcode.first_bad_version;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * create on 2024/02/23.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class FirstBadVersion {
  public int firstBadVersion(int n) {
    int start = 1;

    while(start <= n) {
      int version = (int) (Math.floor(start + n) / 2);
      if (isBadVersion(version)) {
        n = version -1;
      } else {
        start = version + 1;
      }
    }

    return start;
  }

  public boolean isBadVersion(int version) {
    return true;
  }

  public boolean canConstruct(String ransomNote, String magazine) {
    int[] arr = new int[26];
    int ASCII = -97;

    for (char c : magazine.toCharArray()) {
      arr[c + ASCII]++;
    }

    for (char c : ransomNote.toCharArray()) {
      if (arr[c+ASCII] == 0) {
        return false;
      } else {
        arr[c+ASCII]--;
      }
    }

    return true;
  }

}
