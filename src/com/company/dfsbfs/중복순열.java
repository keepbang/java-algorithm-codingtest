package com.company.dfsbfs;

import java.util.Scanner;

public class 중복순열 {
    public void solution(int N, int M){
        int[] tmp = new int[M];
        dfs(0,N,M,tmp);
    }

    public void dfs(int L, int N, int M, int[] pm){
        if(L == M){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i = 1; i <= N; i++) {
                pm[L] = i;
                dfs(L+1,N,M,pm);
            }
        }
    }

    public static void main(String[] args) {
        중복순열 m = new 중복순열();

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        m.solution(N,M);
    }
}
