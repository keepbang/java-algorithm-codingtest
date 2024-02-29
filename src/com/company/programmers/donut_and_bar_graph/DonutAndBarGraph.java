package com.company.programmers.donut_and_bar_graph;

import java.util.HashMap;
import java.util.Map;

/**
 * create on 2024/02/28.
 * create by IntelliJ IDEA.
 *
 * 입출력 예
 * edges	result
 * [[2, 3], [4, 3], [1, 1], [2, 1]]	[2, 1, 1, 0]
 * [[4, 11], [1, 12], [8, 3], [12, 7], [4, 2], [7, 11], [4, 8], [9, 6], [10, 11], [6, 10], [3, 5], [11, 1], [5, 3], [11, 9], [3, 8]]	[4, 0, 1, 2]
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public class DonutAndBarGraph {

  static class EdgeCount {
    int in;
    int out;

    public EdgeCount() {
      this.in = 0;
      this.out = 0;
    }

    public void increaseIn() {
      in++;
    }

    public void increaseOut() {
      out++;
    }

    public int getIn() {
      return in;
    }

    public int getOut() {
      return out;
    }
  }

  public int[] solution(int[][] edges) {
    Map<Integer, EdgeCount> pointer = new HashMap<>();
    int vertex = -1;
    int donut = 0;
    int line = 0;
    int eight = 0;

    for (int[] edge : edges) {
      int out = edge[0];
      int in = edge[1];

      EdgeCount edgeOutCount = pointer.computeIfAbsent(out, key -> new EdgeCount());
      edgeOutCount.increaseOut();
      EdgeCount edgeInCount = pointer.computeIfAbsent(in, key -> new EdgeCount());
      edgeInCount.increaseIn();
    }

    for (Integer key : pointer.keySet()) {
      EdgeCount edgeCount = pointer.get(key);
      if (edgeCount.getOut() >= 2 && edgeCount.getIn() == 0) {
        vertex = key;
      }

      // 막대 그래프
      if (edgeCount.getIn() >= 1 && edgeCount.getOut() == 0) {
        line++;
      }

      // 8자 그래프
      if (edgeCount.getOut() >= 2 && edgeCount.getIn() >= 2) {
        eight++;
      }
    }

    donut = pointer.get(vertex).getOut() - line - eight;

    return new int[]{vertex, donut, line, eight};

  }

}
