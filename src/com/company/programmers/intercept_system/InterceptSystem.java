package com.company.programmers.intercept_system;

import java.util.Arrays;
import java.util.Comparator;

/**
 * create on 2024/02/29.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class InterceptSystem {

  public int solution(int[][] targets) {
    int answer = 1;

    Arrays.sort(targets, (Comparator.comparingInt(o -> o[0])));

    int start = targets[0][0];
    int end = targets[0][1];

    for (int[] target : targets) {
      int s = target[0];
      int e = target[1];

      if (s >= start && s < end) {
        end = Math.min(end, e);
      } else {
        end = e;
        answer += 1;
      }

      start = s;

    }

    return answer;
  }
}
