package com.company.leetcode.merge_two_linked_lists;

/**
 * create on 2024/02/08.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class MergeTwoSortedLists {

  public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode head = new ListNode();
    ListNode pointer = head;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        pointer.next = new ListNode(list1.val);
        list1 = list1.next;
      } else {
        pointer.next = new ListNode(list2.val);
        list2 = list2.next;
      }
      pointer = pointer.next;
    }

    if (list1 == null) {
      pointer.next = list2;
    }

    if (list2 == null) {
      pointer.next = list1;
    }

    return head.next;

  }
}
