# 도넛과 막대 그래프

`2024 KAKAO WINTER INTERNSHIP`

- 정점들을 연결하는 단방향 간선으로 이루어진 2차원 배열이 주어질 때 그래프를 생성한 정점의 번호, 도넛 모양 그래프 수, 막대 모양 그래프 수, 8자 모양 그래프 수를 순서대로 1차원 정수 배열에 담아 return하는 문제.

- Map을 사용해서 풀었고 EdgeCount라는 class를 만들어서 in, out을 관리했다.
- 각 그래프들의 규칙과 모든 그래프를 연결하는 정점의 규칙을 찾아야한다.

```java
static class EdgeCount {
    int in;
    int out;

    public EdgeCount() {
      this.in = 0;
      this.out = 0;
    }

    public void increaseIn() {
      in++;
    }

    public void increaseOut() {
      out++;
    }

    public int getIn() {
      return in;
    }

    public int getOut() {
      return out;
    }
}
```

## 규칙 
### 임의의 정점
- 정점은 나가는 간선이 2개 이상이고 들어오는 간선은 0개여야 한다.  
- `out >= 2 && in == 0`

```java
if (edgeCount.getOut() >= 2 && edgeCount.getIn() == 0) {
  vertex = key;
}
```

### 막대 그래프
- 막대 그래프는 마지막 정점만 보면 나가는 간선은 0개이고 들어오는 간선은 1개 이상이라는 규칙을 가지고 있다.
- `out == 0 && in >= 1`
 
```java
if (edgeCount.getIn() >= 1 && edgeCount.getOut() == 0) {
  line++;
}
```

### 8자 그래프
- 8자모양 그래프는 하나의 그래프에 나가는 간선이 2개 이상이고 들어오는 간선이 2개이상인 정점이 하나 이상 존재하는 규칙이 있다.
- `out >= 2 && in >= 2`

```java
if (edgeCount.getOut() >= 2 && edgeCount.getIn() >= 2) {
  eight++;
}
```


### 도넛 그래프
- 모든 그래프는 맨 위에 임의의 정점으로 부터 시작한다.
- 따라서 임의의 정점이 곧 그래프의 개수이고 그래프의 개수에 막대 그래프와 8자 그래프를 뺀 값이 도넛 그래프이다.
- `전체 그래프 수 - 막대 그래프 수 - 8자 그래프 수`

```
donut = pointer.get(vertex).getOut() - line - eight;
```

