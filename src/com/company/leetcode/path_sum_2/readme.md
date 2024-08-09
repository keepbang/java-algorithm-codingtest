# [113. Path Sum II](https://leetcode.com/problems/path-sum-ii/description/)

```medium```, ```Tree```, ```DFS(Depth-First Search)```

- 이진 트리의 `root`와 정수 `targetSum`이 주어질 때, 경로의 노드 값 합계가 `targetSum`과 같은 모든 `root-to-leaf`를 반환하는 문제.
- `root-to-leaf` 경로 : 루트에서 시작하여 모든 리프 노드에서 끝나는 경로
- dfs를 통해서 문제를 해결

```
  public List<List<Integer>> solution(TreeNode root, int targetSum) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    dfs(root, targetSum, path, result);
    return result;
  }

  public void dfs(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result) {
    if (root == null) { // (1)
      return;
    }

    path.add(root.val); // (2)

    if (root.left == null && root.right == null && sum == root.val) {
      result.add(new ArrayList<>(path)); (3)
    } else { (4)
      dfs(root.left, sum - root.val, path, result);
      dfs(root.right, sum - root.val, path, result);
    }

    path.remove(path.size() - 1); (5)

  }
```

1. 현재 노드가 `null`일 경우 더이상 탐색 할 수 없으므로 함수를 종료한다.
2. 현재 노드가 `null`이 아니면 `path(경로 리스트)`에 값을 추가한다.
3. 만약 리프 노드이고 재귀가 호출되면서 감소된 합계가 현재 노드의 값과 동일하면 현재까지의 경로의 합이 `targetSum`과 같다고 판단하여 `result`에 배열을 추가한다.  
   path는 백트레킹을 통해서 변경되는데 새로운 배열을 만들어서 result 리스트에 축사 함으로써 path리스트가 변경되더라도 영향을 받지 않는다.
4. 리프노드가 아닐 경우 합계에 현재 노드의 값을 빼고 왼쪽노드와 오른쪽 노드를 탐색한다.
5. 왼쪽 노드와 오른쪽 노드 탐색이 끝나면 현재노드를 제거하고 백트래킹(이전단계로 돌아가 다른 경로를 탐색)을 수행한다.

- 해당 알고리즘을 수행하면 모든 노드를 한번씩 탐색하므로 시간복잡도는 O(N)이다.


