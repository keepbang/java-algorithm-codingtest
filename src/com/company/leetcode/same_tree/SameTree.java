package com.company.leetcode.same_tree;

import com.company.common.TreeNode;

/**
 * create on 2024/01/02.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {

    int x = 4;

    int floor = (int) Math.floor(Math.sqrt(x));

    if(p==null && q==null) return true;

    if(p==null || q==null) return false;

    if (p.val == q.val) {
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    return false;

  }

}
