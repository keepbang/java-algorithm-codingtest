# [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

```easy```, ```linked-list```

두 단일 연결 리스트가 주어졌을때 두 리스트를 오름차순으로 `merge`하는 문제.

두 리스트중 한 리스트가 `null`이 될 때 까지 이동하면서 `while`문을 돌린다.

두 리스트의 값을 비교하여 더 작거나 같은 값을 노드로 만들고 새 리스트노드에 넣어준다.

여기서 `pointer`에 바로 안넣고 `pointer.next`에 넣는 이유는 `pointer`에 바로 넣으면 head와의 연결이 끊겨버리기 때문이다.

```java
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode head = new ListNode();
    ListNode pointer = head;

    while(list1 != null && list2 != null) {
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
```

`pointer`에 값을 다 추가하면 아래와같은 형태가 되어 `head`의 다음 리스트 노드를 `return`한다.

```
input1 : [1] -> [2] -> [4]
input2 : [1] -> [3] -> [4]
        
output : [] -> [1] -> [1] -> [2] -> [3] -> [4] -> [4]
        head
```


