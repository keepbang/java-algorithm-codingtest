# [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list)

```Easy```, ```Linked List```

주어진 리스트를 역순으로 정렬하는 문제.

간단하게 스택을 사용해서 풀수도 있다.

스택은 LIFO(Last In First Out) 형태라서 마지막에 들어온 데이터부터 꺼내서 리스트를 만들어주면 역순으로 정렬된다.

여기에서는 스택이 아닌 다른 방법으로 풀어봤다.

두 노드를 가지고 푸는 방법인데 포인터를 지정하여 방향을 하나씩 바꿔주는 방법이다.

이전 노드를 가지고있는 before 노드와 현재 노드를 기억하고 있는 curr 노드가 있다.

curr.next 노드에 before 노드를 연결하면 원래 있던 연결이 끊기기 때문에 반복문에서 next라는 노드에 curr.next를 저장해서 다음 노드를 잃어버리지 않게 가지고 있는다.

```java
class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode before = null;

    while(curr != null) {
      ListNode next = curr.next;
      curr.next = before;
      before = curr;
      curr = next;
    }

    return before;
  }
}
```