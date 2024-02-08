package com.company.leetcode.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * create on 2024/01/08.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class PascalsTriangle {

  public static void main(String[] args) {

  }

  public List<List<Integer>> generate(int numRows) {
    // 초기화
    List<List<Integer>> triangle = new ArrayList<>();

    if (numRows == 0) {
      return triangle;
    }

    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(1);
    triangle.add(firstRow);

    for (int i = 1; i < numRows; i++) {
      List<Integer> previousRow = triangle.get(i - 1);
      List<Integer> currentRow = new ArrayList<>();

      currentRow.add(1);

      for (int j = 1; j < i; j++) {
        int sum = previousRow.get(j - 1) + previousRow.get(j);
        currentRow.add(sum);
      }

      currentRow.add(1);
      triangle.add(currentRow);
    }

    return triangle;


  }

}
