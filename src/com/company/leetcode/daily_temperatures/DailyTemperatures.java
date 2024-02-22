package com.company.leetcode.daily_temperatures;

import java.util.Stack;

/**
 * create on 2024/01/31.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {
    int[] output = new int[temperatures.length];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < temperatures.length; i++) {

      while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ) {
        int tempIndex = stack.pop();
        output[tempIndex] = i - tempIndex;
      }

      stack.push(i);

    }

    return output;
  }

}
