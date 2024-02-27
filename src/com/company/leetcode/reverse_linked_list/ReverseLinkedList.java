package com.company.leetcode.reverse_linked_list;

import com.company.common.ListNode;

/**
 * create on 2024/02/27.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode before = null;

    while (curr != null) {
      ListNode next = curr.next;
      curr.next = before;
      before = curr;
      curr = next;
    }

    return before;
  }
}
