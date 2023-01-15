package com.company.leetcode.clone_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class CloneGraph {

  class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
      val = 0;
      neighbors = new ArrayList<>();
    }
    public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
      val = _val;
      neighbors = _neighbors;
    }
  }

  public Node cloneGraph(Node node) {
    if (node == null) return null;

    Map<Node, Node> nodeMap = new HashMap<>();
    Stack<Node> stack = new Stack<>();

    nodeMap.put(node, new Node(node.val));
    stack.push(node);

    while(!stack.isEmpty()) {
      Node tempNode = stack.pop();

      for (Node neighbor : tempNode.neighbors) {
        if (!nodeMap.containsKey(neighbor)) {
          nodeMap.put(neighbor, new Node(neighbor.val));
          stack.push(neighbor);
        }
        nodeMap.get(tempNode).neighbors.add(nodeMap.get(neighbor));
      }
    }

    return nodeMap.get(node);
  }

}
