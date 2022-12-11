# [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

```Easy```, ```Array``` , ```Dynamic Programming```

주식 가격이 시간순서대로 주어질 때 해당 리스트에서 최대의 이익을 구하는 문제

먼저 최소값을 찾고 최소값 다음 index 값 부터 최소값과의 차이가 가장 큰 값을 찾는다.

걸리는 시간은 O(n)이 걸린다.