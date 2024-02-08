# [118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

```easy```, ```array```

- [pascal's triangle wiki](https://en.wikipedia.org/wiki/Pascal%27s_triangle)

숫자가 주어졌을때 해당 숫자만큼의 파스칼의 삼각형을 구성하는 배열을 만드는 문제 

input 값이 1 이상이기때문에 먼저 1을 추가해주고 그 다음부터 이중 for문으로 값을 넣어준다.

파스칼의 삼각형은 각 줄 맨 처음과 마지막은 1이기때문에 두번째 for문 앞뒤로 1을 추가하는 로직을 넣어준다.

그 중간에는 중간값을 추가하기 위한 로직을 넣어준다.

```java
List<Integer> previousRow = triangle.get(i - 1);
List<Integer> currentRow = new ArrayList<>();

currentRow.add(1);

// 중간값 추가 로직

currentRow.add(1);

```

중간값을 계산할때에는 이전 row의 값이 필요함으로 앞에서 이전 row의 값을 가져와서 계산을 해준다.

```java
for (int j = 1; j < i; j++) {
    int sum = previousRow.get(j - 1) + previousRow.get(j);
    currentRow.add(sum);
}
```