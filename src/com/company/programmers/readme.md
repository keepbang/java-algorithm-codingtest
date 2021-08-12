# 짝지어 제거하기

```Array```, ```stack```

![image](https://user-images.githubusercontent.com/38740455/129237475-6e315763-5bf3-4fc0-9a78-68a80accd1e8.png)

처음에는 일단 list로 풀어보고 substring을 사용해서 이어붙이고 해봤는데 효율성에서 통과되지 못했다.

substring은 효율성에서 거의 걸러지기 때문에 웬만해선 안쓰는게 좋다고 해서...

stack을 사용해서 같으면 빼고 다르면 넣어주는 방식으로 문제를 풀었다.

시간복잡도는 s의 길이만큰 걸리므로 O(n)

처음에 s의 길이가 2보다 작거나 홀수이면 짝지어지는 문자가 없으므로 제외하고 아래와 같이 for문을 돌린다.
```
if(s.length() < 2 || s.length()%2 != 0){
  return 0;
}
```

1. stack의 size가 0이면 push
2. stack의 제일 마지막으로 들어온 데이터와 s의 i번째 문자가 같으면 stack에서 pop
3. 위의 두 조건에 부합하지않으면(문자가 같지 않으면) push
```
for (int i = 0; i < s.length(); i++) {
  if(stack.size() == 0){
    stack.push(s.charAt(i));
  }else if(stack.peek() == s.charAt(i)){
    stack.pop();
  }else{
    stack.push(s.charAt(i));
  }
}
```

stack의 사이즈가 없으면 짝지어 제거하기가 성공적으로 수행 된거라서 1을 리턴하고 사이즈가 있으면 0을 반환한다.
```
return stack.size() == 0 ? 1 : 0;
```

