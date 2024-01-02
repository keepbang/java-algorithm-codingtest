# [100. Same Tree](https://leetcode.com/problems/same-tree/)

```easy``` , ```tree```

두 트리 노드가 주어졌을 때 트리 노드가 같은지 확인하는 문제

다음 노드가 둘 다 `null`일 경우 이 전까지의 값은 다 같으므로 `true`를 반환함

둘중 하나만 `null`일 경우 두 값이 같지 않아 `false`를 반환함

두 노드의 값을 비교하여 같으면 왼쪽 노드와 오른쪽 노드를 재귀함수로 호출 후 결과를 `and`로 묶어서 반환 한다.

만약 같지 않으면 `false`를 반환함.

```
if(p==null && q==null) return true;

if(p==null || q==null) return false;

if (p.val == q.val) {
  return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}

return false;
```

