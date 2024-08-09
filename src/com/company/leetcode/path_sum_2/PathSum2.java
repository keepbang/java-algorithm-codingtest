package com.company.leetcode.path_sum_2;

import com.company.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSum2 {

  public static void main(String[] args) {
    PathSum2 pathSum2 = new PathSum2();
    TreeNode root = new TreeNode(5
        , new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null)
        , new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));

    List<List<Integer>> result = pathSum2.solution(root, 22);
    System.out.println("result = " + result);

  }

  public List<List<Integer>> solution(TreeNode root, int targetSum) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    dfs(root, targetSum, path, result);
    return result;
  }

  public void dfs(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result) {
    if (root == null) {
      return;
    }

    path.add(root.val);

    if (root.left == null && root.right == null && sum == root.val) {
      result.add(new ArrayList<>(path));
    } else {
      dfs(root.left, sum - root.val, path, result);
      dfs(root.right, sum - root.val, path, result);
    }

    path.remove(path.size() - 1);

  }


}
