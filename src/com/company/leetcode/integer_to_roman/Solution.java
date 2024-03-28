package com.company.leetcode.integer_to_roman;

import java.util.NavigableSet;
import java.util.TreeMap;

/**
 * create on 2024/03/28.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Solution {
  public String intToRoman(int num) {
    TreeMap<Integer, String> symbolMap = new TreeMap<>();
    symbolMap.put(1, "I");
    symbolMap.put(4, "IV");
    symbolMap.put(5, "V");
    symbolMap.put(9, "IX");
    symbolMap.put(10, "X");
    symbolMap.put(40, "XL");
    symbolMap.put(50, "L");
    symbolMap.put(90, "XC");
    symbolMap.put(100, "C");
    symbolMap.put(400, "CD");
    symbolMap.put(500, "D");
    symbolMap.put(900, "CM");
    symbolMap.put(1000, "M");

    StringBuilder sb = new StringBuilder();

    NavigableSet<Integer> keySet = symbolMap.navigableKeySet()
        .descendingSet();

    for (Integer key : keySet) {
      for (int i = num ; i >= key  ; i-=key) {
        String roman = symbolMap.get(key);
        sb.append(roman);
        num -= key;
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    String s = solution.intToRoman(1994);
    System.out.println("s = " + s);
  }
}
