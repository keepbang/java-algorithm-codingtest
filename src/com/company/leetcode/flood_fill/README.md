# [733. Flood Fill](https://leetcode.com/problems/flood-fill)

```easy```, ```dfs```, ```bfs```

특정 좌표부터 시작하여 주어진 color로 변경하고 상하좌우로 탐색하여 처음 좌표에 있던 color와 같은 color일 경우 주어진 color로 변경하는 문제.

상하좌우를 계속 탐색하므로 dfs로 문제를 풀었다.

처음에는 stack을 사용해서 탐색을 했는데 시간이 2ms가 나와서 좀 더 줄어보고자 재귀로 만들어서 풀었다.

재귀로 할 때 좌표(sr, sc)의 값이 주어진 처음 좌표의 값과 같다면 값을 새로운 color로 변경하고 상하좌우의 값들을 재귀호출한다.

```java
public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int pixelColor = image[sr][sc];

    if (pixelColor == color) {
      return image;
    }

    Stack<Integer> stackRow = new Stack<>();
    Stack<Integer> stackCell = new Stack<>();

    stackRow.push(sr);
    stackCell.push(sc);

    while (!stackRow.empty() && !stackCell.empty()) {
      Integer row = stackRow.pop();
      Integer cell = stackCell.pop();

      if (image[row][cell] == pixelColor) {
        image[row][cell] = color;

        if ((row - 1) >= 0) {
          stackRow.push(row - 1);
          stackCell.push(cell);
        }

        if ((cell - 1) >= 0) {
          stackRow.push(row);
          stackCell.push(cell - 1);
        }

        if ((cell + 1) < image[0].length) {
          stackRow.push(row);
          stackCell.push(cell + 1);
        }

        if ((row + 1) < image.length) {
          stackRow.push(row + 1);
          stackCell.push(cell);
        }
      }
    }

    return image;
  }

  // 재귀 사용
  public int[][] floodFill2(int[][] image, int sr, int sc, int color) {
    int pixelColor = image[sr][sc];

    if (pixelColor == color) {
      return image;
    }

    dfs(image, sr, sc, pixelColor, color);

    return image;
  }

  public void dfs(int[][] image, int sr, int sc, int pixelColor, int color) {
    if (image[sr][sc] == pixelColor) {
      image[sr][sc] = color;

      if ((sr - 1) >= 0) {
        dfs(image, sr - 1, sc, pixelColor, color);
      }

      if ((sc - 1) >= 0) {
        dfs(image, sr, sc - 1, pixelColor, color);
      }

      if ((sc + 1) < image[0].length) {
        dfs(image, sr, sc + 1, pixelColor, color);
      }

      if ((sr + 1) < image.length) {
        dfs(image, sr + 1, sc, pixelColor, color);
      }
    }
  }
```