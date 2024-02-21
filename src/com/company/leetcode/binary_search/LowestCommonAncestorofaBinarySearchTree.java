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
public class LowestCommonAncestorofaBinarySearchTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return null;
    }

    if (root == p || root == q) {
      return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left == null && right == null) {
      return null;
    }

    if (left != null && right != null) {
      return root;
    }

    return left == null ? right : left;
  }
}
