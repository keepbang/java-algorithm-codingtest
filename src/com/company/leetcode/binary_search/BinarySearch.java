package com.company.leetcode.binary_search;

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
public class BinarySearch {

  public int search(int[] nums, int target) {
    return binarySearch(nums, 0, nums.length - 1, target);
  }

  public int binarySearch(int[] nums, int start, int end, int target) {
    int middleIndex = (start + end) / 2;

    if (nums[middleIndex] == target) {
      return middleIndex;
    }

    if (start >= end) {
      return -1;
    }

    if (nums[middleIndex] < target) {
      return binarySearch(nums, middleIndex + 1, end, target);
    } else {
      return binarySearch(nums, start, middleIndex - 1, target);
    }
  }

}
