# [409. Longest Palindrome](https://leetcode.com/problems/longest-palindrome)

```easy```, ```Hash Table```, ```String```

주어진 문자열로 만들 수 있는 가장 긴 회문의 길이를 출력하는 문제.

문자열은 영문 대/소문자만 포함된다.

```text
Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
```

문자열의 모든 문자를 개수와 같이 `Map`에 추가했다.
그리고 짝수/홀수 여부에 따라서 문제를 풀었다.

N = 회문의 길이

1. 문자의 개수(M)가 짝수이면 회문의 길이는 `N + M` 이다.  
2. 문자의 개수(M)가 홀수일경우 홀수 개수가 있는지에 따라 다르다.
   - `N + M - hasOdd`

```
if (count % 2 == 0) {
    answer += count;
} else {
    answer += count - hasOdd;
    hasOdd = 1;
}
```

`hasOdd`는 홀수가 있을 경우 `1`로 변하여 최초 한번만 홀수 개수를 추가하고 나머지는 `-1`을 한 상태로 추가된다.