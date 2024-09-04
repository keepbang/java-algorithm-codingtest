package com.company.leetcode.unique_paths;

public class UniquePaths {

  public static void main(String[] args) {

  }

  public int uniquePaths(int m, int n) {

    int[][] dp = new int[m][n];

    for (int i = 0; i < n; i++) {
      dp[0][i] = 1;
    }

    for (int i = 0; i < m; i++) {
      dp[i][0] = 1;
    }

    for (int j = 1; j < n; j++) {
      for (int i = 1; i < m; i++) {
        // [i, j - 1] , [i - 1, j]
        int left = dp[i - 1][j];
        int top = dp[i][j - 1];
        dp[i][j] = left + top;
      }
    }

    return dp[m - 1][n - 1];
  }

}
