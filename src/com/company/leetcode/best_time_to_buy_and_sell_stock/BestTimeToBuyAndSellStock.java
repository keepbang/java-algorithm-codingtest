package com.company.leetcode.best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxPrice = 0;
    for (int price : prices) {
      if (price < minPrice) {
        minPrice = price;
      } else if (price - minPrice > maxPrice) {
        maxPrice = price - minPrice;
      }
    }

    return maxPrice;
  }
}
