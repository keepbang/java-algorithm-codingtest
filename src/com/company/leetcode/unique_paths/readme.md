# [62. Unique Paths](https://leetcode.com/problems/unique-paths/)

`Medium`,`Dynamic Programming`

- `m * n`의 `matrix`가 주어질 때 좌측 상단에서 우측 하단까지 갈 수 있는 경우의 수를 구하는 문제
- `dp 테이블`을 사용해서 각 행열 영역까지의 경우의 수를 구하면 `m, n` 위치에 경우의 수가 입력된다.
- 현위치 기준으로 `dp 테이블`에서 왼쪽과 위의 값을 더하면 현 위치까지의 경우의 수를 구할 수 있다.

```java
for (int i = 0; i < n; i++) {
  dp[0][i] = 1;
}

for (int i = 0; i < m; i++) {
  dp[i][0] = 1;
}
```
- 맨 왼쪽과 맨 위의 값들은 경우의수가 1이기 때문에 1로 초기화 한다. 실제로 값을 입력하는건 `1,1` 부터다.