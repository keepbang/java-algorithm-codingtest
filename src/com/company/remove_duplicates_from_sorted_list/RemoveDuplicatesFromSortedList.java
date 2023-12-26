package com.company.remove_duplicates_from_sorted_list;

/**
 * create on 2023/12/26.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class RemoveDuplicatesFromSortedList {


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

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return head;
    }

    int beforeValue = head.val;
    ListNode point = head;

    while (point.next != null) {
      if (beforeValue == point.next.val) {
        point.next = point.next.next;
      } else {
        beforeValue = point.next.val;
        point = point.next;
      }
    }
    return head;
  }

}
