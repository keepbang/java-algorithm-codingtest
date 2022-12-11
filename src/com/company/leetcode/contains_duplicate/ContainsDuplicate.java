package com.company.leetcode.contains_duplicate;

import java.util.Arrays;
import java.util.Objects;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums); //O(nlogn)

    Integer beforeNum = null;

    for (int num : nums) {
      if (Objects.equals(num,beforeNum)) {
        return true;
      }
      beforeNum = num;
    }
    return false;
  }
}
