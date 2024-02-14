# [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome)

```easy```, ```two pointer```

주어진 문장을 회문(palindrome) 인지 판별하는 문제

- 거꾸로 읽어도 똑같은 문장인지 판별
- 소문자 및 숫자만 판별함

주어진 문자열을 소문자로 변환 해준 후 정규식으로 소문자와 숫자만 남기고 다 제거해준다. `[^0-9a-z]`

포인터 두개를 사용하여 하나는 처음부터 조회하고 하나는 문자열 마지막부터 조회한다.

두 포인터를 문자열 가운데로 이동시키며 값을 비교시키고 다르면 `false`를 반환한다.
