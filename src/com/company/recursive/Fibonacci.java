package com.company.recursive;

import java.util.Scanner;

/**
 * 피보나치 수열(재귀함수)
 * 재귀함수보다 for문이 더 빠르다
 * 45 1134903170
 */
public class Fibonacci {

    public static int[] ANSWER;

    public int solution(int n){
        ANSWER = new int[n+1];

        fibo(n);

        return ANSWER[n];
    }

    private int fibo(int i){
        if(ANSWER[i] > 0) return ANSWER[i];
        if(i == 1) ANSWER[i] = 1;
        else if(i == 2) ANSWER[i] = 1;
        else {
            ANSWER[i] = fibo(i - 2) + fibo(i - 1);
        }
        return ANSWER[i];
    }

    public static void main(String[] args) {
        Fibonacci m = new Fibonacci();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(m.solution(n));

    }
}
