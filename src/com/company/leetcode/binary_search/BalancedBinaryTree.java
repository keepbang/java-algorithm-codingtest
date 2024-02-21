package com.company.leetcode.binary_search;

import com.company.common.TreeNode;

/**
 * create on 2024/02/19.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class BalancedBinaryTree {
  public boolean isBalanced(TreeNode root) {
    return getLastLevel(root) != -1;

  }

  public int getLastLevel(TreeNode node) {
    if (node == null) return 0;

    int leftLevel = getLastLevel(node.left);
    int rightLevel = getLastLevel(node.right);

    if (leftLevel == -1 || rightLevel == -1)
      return -1;
    if (Math.abs(leftLevel - rightLevel) > 1) {
      return -1;
    }

    return 1 + Math.max(leftLevel,rightLevel);

  }
}
