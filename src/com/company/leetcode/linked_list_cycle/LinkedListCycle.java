package com.company.leetcode.linked_list_cycle;

import com.company.common.ListNode;

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
public class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
    if (head == null) return false;

    ListNode before = head;
    ListNode after = head.next;

    while(after != null && after.next != null) {
      before = before.next;
      after = after.next.next;

      if (after == before) {
        return true;
      }

    }

    return false;
  }
}
