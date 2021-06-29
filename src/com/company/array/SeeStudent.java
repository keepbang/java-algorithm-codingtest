package com.company.array;

import java.util.Scanner;

/**
 * 보이는 학생
 *
 * 설명
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 *
 * 입력
 * 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 *
 * 출력
 * 선생님이 볼 수 있는 최대학생수를 출력한다.
 *
 * 8
 * 130 135 148 140 145 150 150 153
 *
 */
public class SeeStudent {
    public int solution(int n, int[] students){
        int answer = 1;
        int tall = students[0];

        for (int i = 1; i < n; i++) {
            if(tall < students[i]){
                answer++;
                tall = students[i];
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        SeeStudent m = new SeeStudent();

        Scanner in = new Scanner(System.in);

        String input1 = in.nextLine();
        String input2 = in.nextLine();

        int n = Integer.parseInt(input1);
        int[] students = new int[n];
        String[] splitInput = input2.split(" ");
        for (int i = 0; i < n; i++) {
            System.out.println(splitInput[i]);
            students[i] = Integer.parseInt(splitInput[i]);
        }

        System.out.println(m.solution(n, students));
    }
}
