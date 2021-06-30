package com.company.array;

import java.util.Scanner;

/**
 * 소수
 * <p>
 * 설명
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * <p>
 * <p>
 * 출력
 */
public class PrimeNumber {

    public int solution(int n) {
        int answer = 0;
        int[] primeArr = new int[n+1];


        for (int i = 2; i <= n; i++) {
            if(primeArr[i] == 0){
                answer++;
                for(int j = i;j<=n;j+=i){
                    primeArr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        PrimeNumber m = new PrimeNumber();
        Scanner in=new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(m.solution(input));
        return ;
    }
}
