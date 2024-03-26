# [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

`Medium`

- 반복이 없는 가장 긴 문자열 길이를 구하는 문제입니다.


Example 1:  
> Input: s = "abcabcbb"  
> Output: 3  
> Explanation: The answer is "abc", with the length of 3.

Example 2:  
> Input: s = "bbbbb"  
> Output: 1  
> Explanation: The answer is "b", with the length of 1.  

Example 3:  
> Input: s = "pwwkew"  
> Output: 3  
> Explanation: The answer is "wke", with the length of 3.  
> Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.  

- 슬라이딩 윈도우 방식 사용
- 문자열 전체를 순회하면서 문자들을 임시 저장함
- 임시 저장한 문자에 중복된 문자가 있는지 확인
- 문자가 존재할 경우 문자열 길이의 최대값을 판별해서 저장
- 해당 문자가 있던 자리 이후부터 잘라서 다시 객체 생성

## Code
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        StringBuilder repeatingStr = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int repeat = repeatingStr.toString().indexOf(c);

            if (repeat != -1) {
            // 문자가 존재할 경우
                if (repeatingStr.length() > maxLength) {
                    maxLength = repeatingStr.length();
                }
                String substring = repeatingStr.substring(repeat + 1);
                repeatingStr = new StringBuilder(substring);
            }
            repeatingStr.append(c);
        }

        if (repeatingStr.length() > maxLength) {
            return repeatingStr.length();
        }

        return maxLength;
    }
}
```