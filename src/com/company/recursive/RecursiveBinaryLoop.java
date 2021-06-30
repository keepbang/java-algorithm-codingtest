package com.company.recursive;

import java.util.Scanner;

/**
 * 입력 받은 정수 N을 이진수로 출력(재귀함수 사용)
 */
public class RecursiveBinaryLoop {

    private String solution(int n){
        String answer = "";

        answer = DFS(n,"");

        return answer;

    }

    private String DFS(int n, String binaryString) {
        if(n == 0) return binaryString;
        binaryString = DFS(n/2,n%2 + binaryString);

        return binaryString;
    }

    public static void main(String[] args) {
        RecursiveBinaryLoop m = new RecursiveBinaryLoop();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(m.solution(n));
    }
}
