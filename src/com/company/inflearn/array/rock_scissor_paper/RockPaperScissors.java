package com.company.inflearn.array.rock_scissor_paper;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 가위 바위 보
 *
 * 설명
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N=5이면
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 * 1,1 / 2,2 / 3,3 D
 * 1 > 2 > 3
 * A  B
 * 1  2  B
 * 1  3  A
 * 2  1  A
 * 2  3  B
 * 3  1  B
 * 3  2  A
 *
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 *
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 *
 * A
 * B
 * A
 * B
 * D
 */

public class RockPaperScissors {
    public ArrayList<String> solution(int n, int[] a, int[] b){
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            answer.add(gameResult(a[i],b[i]));
        }

        return answer;
    }

    private String gameResult(int a, int b){
        if(a == b) return "D";

        if(a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2){
            return "A";
        }else{
            return "B";
        }
    }

    public static void main(String[] args) {
        RockPaperScissors m = new RockPaperScissors();

        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String inputA = in.nextLine();
        String inputB = in.nextLine();

        int n = Integer.parseInt(input1);
        String[] arrA = inputA.split(" ");
        String[] arrB = inputB.split(" ");

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arrA[i]);
            b[i] = Integer.parseInt(arrB[i]);
        }

        m.solution(n,a,b).forEach(System.out::println);

    }
}