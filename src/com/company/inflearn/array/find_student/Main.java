package com.company.inflearn.array.find_student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * create on 4/17/24. create by IntelliJ IDEA.
 *
 * <p>
 * 설명 : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는
 * 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 * <p>
 * 입력 : 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 * <p>
 * 출력 : 선생님이 볼 수 있는 최대학생수를 출력한다.
 * </p>
 *
 * @author Gibyung Chae (Keepbang)
 * @version 1.0
 * @since 1.0
 */
public class Main {

  public int solution(int n, int[] arr) {
    int answer = 0;
    int maxValue = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];
        answer+=1;
      }
    }

    return answer;
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] strArr = br.readLine().split(" ");
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    int result = main.solution(n, arr);
    System.out.println(result);

  }

}
