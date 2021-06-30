package com.company.recursive;

import java.util.Scanner;

/**
 * 팩토리얼(재귀함수)
 */
public class Factorial {

    private int solution(int n) {
        if(n == 1) return 1;
        return n * solution(n - 1);
    }

    public static void main(String[] args) {
        Factorial m = new Factorial();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(m.solution(n));
    }
}
