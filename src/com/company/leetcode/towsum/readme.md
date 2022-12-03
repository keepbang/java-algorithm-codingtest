# [1. Two Sum](https://leetcode.com/problems/two-sum/)


```Easy```, ```array``` , ```Hash Table```

Map에 키를 사용하여 문제를 풀었다.

Map의 key, value는 아래와 같다
```text
key : 배열의 값
value : key로 들어간 값의 Index 
```

key로 들어간 값이 다음에 계산될 연산결과값이라면 해당 Index와 map의 value를 return 한다.
```java
  int calcNum = target - nums[i];
```

Ex)
```text
nums = [3,2,4], target = 6
```
Input이 위와 같을 경우 loop별 Map과 연산결과이다.
```
loop 1.
calcNum : 3, i = 0
Map : {3=0}

loop 2.
calcNum : 5, i = 1
Map : {1=1, 3=0}

loop 3.
calcNum : 2, i = 2
Map : {1=1, 3=0, 4=2}

loop 4.
calcNum : 1, i = 3
Map : {1=1, 3=0, 4=2}
loop 4에서 calcNum값이 Map에 key로 존재하기 때문에
key에 해당하는 value와 현재 Index인 3이 결과값이다.

answer : 1, 3
```



시간복잡도는 O(N)만큼 걸린다.

![image](https://user-images.githubusercontent.com/38740455/205422222-32ad0976-60b8-409a-a20b-66909473f6f4.png)

