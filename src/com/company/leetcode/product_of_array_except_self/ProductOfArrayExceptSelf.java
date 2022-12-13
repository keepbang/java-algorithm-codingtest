package com.company.leetcode.product_of_array_except_self;

public class ProductOfArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    int[] answer = new int[nums.length];
    int[] reverse = new int[nums.length];

    int index = 1;
    int rIndex = nums.length - 2;
    answer[0] = 1;
    reverse[nums.length - 1] = 1;

    int value = 1;

    while (index < nums.length) {
      answer[index] = answer[index - 1] * nums[index - 1];
      reverse[rIndex] = reverse[rIndex + 1] * nums[rIndex + 1];

      index += value;
      rIndex -= value;
    }

    for (int i = nums.length - 2; i >= 0; i--) {
      answer[i] = reverse[i] * answer[i];
    }

    return answer;
  }
}
