package com.company.leetcode.towsum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] solution(int[] nums, int target) {
    int[] answer = new int[2];
    Map<Integer, Integer> answerMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int calcNum = target - nums[i];

      if (answerMap.containsKey(calcNum)) {
        answer = new int[]{answerMap.get(calcNum), i};
        break;
      } else {
        answerMap.put(nums[i], i);
      }
    }

    return answer;

  }

}
