package com.company.leetcode.buy_two_chocolates;

import java.util.Arrays;

/**
 * create on 2023/12/20.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class BuyTwoChocolates {

  public static void main(String[] args) {
    int[] prices = {74,31,38,24,25,24,5};
    int money = 79;

    BuyTwoChocolates buyTwoChocolates = new BuyTwoChocolates();
    int i = buyTwoChocolates.buyChoco(prices, money);

    System.out.println(i);

  }

  public int buyChoco(int[] prices, int money) {
    int minAmount = Integer.MAX_VALUE;

    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        int priceSum = prices[i] + prices[j];
        minAmount = Math.min(minAmount,priceSum);
      }
    }

    int answer = money - minAmount;
    if (answer < 0) {
      return money;
    }

    return answer;
  }

}
