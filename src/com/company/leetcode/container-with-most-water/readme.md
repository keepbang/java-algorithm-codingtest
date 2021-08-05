# [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

```array``` , ```Two Pointer``` , ```Greedy```

두개의 포인터를 사용하여 두 막대기 사이에 넣을수있는 가장 많은 물의양을 구하는 문제를 풀었다.

두 막대기사이의 넓이를 구하기 위해 먼저 밑변의 길이를 구하고(right - left)

짧은 막대기만큼 물을 채울 수 있기 때문에 두 막대기 중에 짧은 막대기를 구한다.

위에서 구한 밑변과 짧은 막대기를 사용해서 넓이를 구하고 최대값을 판별한뒤 짧은 막대기쪽을 옮겨주면서 반복문을 돌린다.

시간복잡도는 O(n)만큼 걸린다.

![image](https://user-images.githubusercontent.com/38740455/128338438-11532511-a954-4e5c-8791-6c8d52d5268e.png)
