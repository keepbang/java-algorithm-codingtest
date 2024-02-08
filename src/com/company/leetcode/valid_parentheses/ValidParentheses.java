package com.company.leetcode.valid_parentheses;

import java.util.Stack;
import java.util.stream.Stream;

/**
 * create on 2024/02/07.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class ValidParentheses {
  public boolean isValid(String s) {
    if (s.length() % 2 != 0
        || Stream.of(")","}","]").anyMatch(s::startsWith)) return false;

    Stack<Character> stack = new Stack<>();
    char[] charArray = s.toCharArray();

    for (char bracket : charArray) {
      stack.forEach(System.out::println);
      switch (bracket) {
        case ')' -> {
          if (extracted(stack, '(')) {
            return false;
          }
        }
        case ']' -> {
          if (extracted(stack, '[')) {
            return false;
          }
        }
        case '}' -> {
          if (extracted(stack, '{')) {
            return false;
          }
        }
        default -> stack.push(bracket);
      }
    }

    if (!stack.isEmpty()) {
      return false;
    }

    return true;

  }

  private static boolean extracted(Stack<Character> stack, char bracket) {
    if (stack.isEmpty()) return true;
    Character openBracket;
    openBracket = stack.pop();
    return openBracket == null || openBracket != bracket;
  }

  public static void main(String[] args) {
    ValidParentheses validParentheses = new ValidParentheses();

    boolean valid = validParentheses.isValid("()))");
    System.out.println(valid);
  }
}
