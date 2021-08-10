# [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

```array``` , ```Binary Search```

정렬된 배열에서 숫자를 찾는 문제로 이진 탐색(Binary Search)을 사용하였다.

두 개의 인덱스 포인터를 사용하여 mid index를 구한다음 해당값을 비교하고 해당 값보다 크거나 같을때 두 인덱스포인터를 이동시키는 방법으로 값을 찾는다.

시작 인덱스가 마지막 인덱스보다 클경우 반복문을 종료하고 찾는값이 없으면 시작 인덱스를 반환한다.

시간복잡도는 O(logN)만큼 걸린다.

![image](https://user-images.githubusercontent.com/38740455/128850569-b70f962c-271c-4af4-9b62-cf3e1196bbd8.png)

