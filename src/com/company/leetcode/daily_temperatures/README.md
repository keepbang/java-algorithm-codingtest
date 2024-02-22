# [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

```medium```, ```stack```

일일 온도가 들어있는 `temperatures`가 주어진다.

현재 온도보다 더 따듯한 온도까지의 일수를 배열로 담아서 출력하는 문제.

```
Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0]
```

`output`은 일 수 만큼 나와서 `temperatures`만큼의 배열을 선언해준다.

일일 온도가 들어있는 배열 수 만큼 반복문을 돌리고 스택에 값을 추가하면서 현재 값과 스택의 맨 위의 값과 비교하면서 `output` 배열을 채워준다. 

```java
  public int[] dailyTemperatures(int[] temperatures) {
    int[] output = new int[temperatures.length];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < temperatures.length; i++) {

      while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ) {
        int tempIndex = stack.pop();
        output[tempIndex] = i - tempIndex;
      }

      stack.push(i);

    }

    return output;
  }
```