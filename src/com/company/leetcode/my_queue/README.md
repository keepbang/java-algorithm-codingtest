# [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

```easy```, ```stack```

`Stack`으로 `Queue`를 구현하는 구현 문제.

```
Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
```

스택 두개를 사용해서 하나는 저장용, 하나는 이동용으로 사용했다.

`push`는 `stack`의 `push`메서드를 사용한다.

두 스택을 옮기는 `tempSwap`이라는 메서드를 만들어서 `pop`이나 `peek`을 할 때 사용한다.

```java
  private void tempSwap(Stack<Integer> source, Stack<Integer> target) {
    while(!source.empty()) {
      target.push(source.pop());
    }
  }
```