package com.company.leetcode.best_time_to_buy_and_sell_stock;

import java.util.Stack;

/**
 * create on 2024/02/14.
 * create by IntelliJ IDEA.
 *
 * <p>
 *  간단한
 * </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Solution2 {

  public int maxProfit(int[] prices) {
    int minPrice  = Integer.MAX_VALUE;
    int maxPrice = 0;

    for (int price : prices) {
      if (price < minPrice) {
        minPrice = price;
      } else if (price > maxPrice) {
        maxPrice = price - minPrice;
      }
    }

    return maxPrice;
  }

}
