package com.company.recursive;

import java.util.Scanner;

/**
 * 1부터 입력받은 숫자 N까지 출력(재귀함수 사용)
 */
public class RecursiveNumberLoop {

    public void DFS(int n){
        if(n == 0) return;

//        System.out.print(n + " ");역순으로 순회
        DFS(n-1);
        System.out.print(n + " ");//처음부터 순회
    }

    public static void main(String[] args) {
        RecursiveNumberLoop m = new RecursiveNumberLoop();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        m.DFS(n);
    }
}
