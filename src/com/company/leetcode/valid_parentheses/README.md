# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

```easy```, ```stack```

입력으로 주어진 문자열이 유효한지 판단하는 문제

입력으로는 다음 괄호만 입력된다 : `(){}[]`

괄호문제는 대부분 스택으로 풀어나가는거 같다.

스택에는 여는 괄호만 추가하고 만약 닫는괄호가나오면 스택에서 하나를 빼서 유효한지 체크한다.

처음 시작할때 짝수가 아니거나 닫는 괄호부터 나오면 유효하지 않는 괄호이기 때문에 `false`를 return 한다.

