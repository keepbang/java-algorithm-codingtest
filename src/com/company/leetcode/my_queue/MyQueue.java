package com.company.leetcode.my_queue;

import java.util.Stack;

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
public class MyQueue {

  Stack<Integer> stack = new Stack<>();
  Stack<Integer> tempStack= new Stack<>();

  public MyQueue() {

  }

  public void push(int x) {
    stack.push(x);
  }

  public int pop() {
    tempSwap(stack, tempStack);

    Integer value = tempStack.pop();

    tempSwap(tempStack, stack);

    return value;
  }

  public int peek() {
    tempSwap(stack, tempStack);

    Integer value = tempStack.peek();

    tempSwap(tempStack, stack);

    return value;
  }

  public boolean empty() {
    return stack.empty();
  }

  private void tempSwap(Stack<Integer> source, Stack<Integer> target) {
    while(!source.empty()) {
      target.push(source.pop());
    }
  }

}
