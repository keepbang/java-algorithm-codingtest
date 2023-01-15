# [133. Clone Graph](https://leetcode.com/problems/clone-graph/)


```Medium```, ```Hash Table``` , ```DFS, BFS``` , ```Graph```

주어진 `Node`들을 전부 복사해서 새로운 `Node`로 만드는 문제다.

그래프 탐색에 관련된 문제로 모든 노드들을 방문해야 하기 때문에 DFS(깊이 우선 탐색)를 사용하였다.

```java

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

```

스택에 탐색할 노드를 추가하고 Map은 해당 노드를 새로 생성했는지 용도로 사용했다. 제약사항에 노드의 value는 고유하다고 적혀있기 때문에 Map을 사용 할 수 있었다.

Map에 존재하지 않는 노드라면 생성이 안된 노드이기 때문에 새로 생성해서 스택에 추가해준다.

Map에서 해당 노드를 가져와 이웃 노드들을 추가해 주는 방식으로 새로운 객체를 생성한다.