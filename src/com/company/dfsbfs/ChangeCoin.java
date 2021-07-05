package com.company.dfsbfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전 교환
 *
 * 설명
 * 다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
 * 각 단위의 동전은 무한정 쓸 수 있다.
 *
 *
 * 입력
 * 첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
 * 그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.
 *
 *
 * 출력
 * 첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
 *
 * 3
 * 1 2 5
 * 15
 *
 */
public class ChangeCoin {

    static int answer = Integer.MAX_VALUE, N, M;
    public void dfs(int L, int sum,Integer[] coin_kind){
        if(sum > M) return;
        if(L >= answer) return;
        if(sum == M){
            answer = Integer.min(L, answer);
        }else {
            for (int i = 0; i < coin_kind.length; i++) {
                dfs(L + 1, sum + coin_kind[i], coin_kind);
            }
        }
    }

    public static void main(String[] args) {
        ChangeCoin m = new ChangeCoin();

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        Integer[] coin_kind = new Integer[N];
        for (int i = 0; i < N; i++) {
            coin_kind[i] = in.nextInt();
        }
        M = in.nextInt();

        Arrays.sort(coin_kind, Collections.reverseOrder());

        m.dfs(0,0,coin_kind);

        System.out.println(answer);

    }
}
