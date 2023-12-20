# [2706. Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/)


```Easy```, ```Array``` , ```Sort```

초콜릿 가격이 들어있는 배열 ```prices```와 구매할수있는 돈 ```money```가 주어졌을 때 최대한 많이 남는 잔돈 액수를 구하는 문제

```java
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

```

배열에서 두개의 값을 합했을때 나올수 있는 최소값을 구한다.

최소값과 주어진 금액을 빼서 음수가 나온다면 구매할 수 없으므로 ```money```를 반환하고

음수가 아니라면 남은 잔돈을 반환한다.