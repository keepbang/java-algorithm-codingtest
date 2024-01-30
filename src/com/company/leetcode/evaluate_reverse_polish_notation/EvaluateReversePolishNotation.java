package com.company.leetcode.evaluate_reverse_polish_notation;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Stack;

/**
 * create on 2024/01/30.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class EvaluateReversePolishNotation {

  enum Operator {
    PLUS("+") {
      @Override
      public Integer calc(int number1, int number2) {
        return number1 + number2;
      }
    },
    MINUS("-") {
      @Override
      public Integer calc(int number1, int number2) {
        return number1 - number2;
      }
    },
    MULTIPLY("*") {
      @Override
      public Integer calc(int number1, int number2) {
        return number1 * number2;
      }
    },
    DIVIDE("/") {
      @Override
      public Integer calc(int number1, int number2) {
        return number1 / number2;
      }
    };

    private String operator;
    abstract public Integer calc(int number1, int number2);

    Operator(String operator) {
      this.operator = operator;
    }

    public static Operator getOperator(String input) {
      return Arrays.stream(Operator.values())
          .filter(value -> value.operator.equals(input))
          .findFirst()
          .orElseThrow(() -> new InvalidParameterException("wrong input!"));
    }

  }

  public int evalRPN(String[] tokens) {

    //enum version
//    Stack<Integer> stack = new Stack<>();
//
//    for (String token : tokens) {
//      try {
//        int number = Integer.parseInt(token);
//        stack.push(number);
//      } catch (NumberFormatException e) {
//        int number2 = stack.pop();
//        int number1 = stack.pop();
//
//        Operator operator = Operator.getOperator(token);
//        Integer calcNumber = operator.calc(number1, number2);
//        stack.push(calcNumber);
//      }
//    }
//

    // switch version
    Stack<Integer> stack = new Stack<>();
    int number1 = 0;
    int number2 = 0;

    for (String token : tokens) {
      switch(token) {
        case "+":
          number2 = stack.pop();
          number1 = stack.pop();
          stack.push(number1 + number2);
          break;
        case "-":
          number2 = stack.pop();
          number1 = stack.pop();
          stack.push(number1 - number2);
          break;
        case "*":
          number2 = stack.pop();
          number1 = stack.pop();
          stack.push(number1 * number2);
          break;
        case "/":
          number2 = stack.pop();
          number1 = stack.pop();
          stack.push(number1 / number2);
          break;
        default:
          stack.push(Integer.parseInt(token));
      }
    }

    return stack.pop();
  }

}
