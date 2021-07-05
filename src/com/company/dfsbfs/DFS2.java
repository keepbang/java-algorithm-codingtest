package com.company.dfsbfs;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 바둑이 승차(DFS)
 *
 * 설명
 * 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
 * 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
 * N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.
 * 둘째 줄부터 N마리 바둑이의 무게가 주어진다.
 *
 *
 * 출력
 * 첫 번째 줄에 가장 무거운 무게를 출력한다.
 *
 * 259 5
 * 81
 * 58
 * 42
 * 33
 * 61
 */
public class DFS2 {
    static int answer = Integer.MIN_VALUE,total,n;
    public void solution(int[] dogs){
        dfs(0,0,dogs);
    }

    public void dfs(int L, int sum, int[] dogs){
        System.out.printf("%d | %d",L,sum);
        System.out.println();
        if(sum > total){
            return;
        }
        if(L == n){
            answer = Math.max(sum, answer);
        }else{
            dfs(L+1, sum+dogs[L],dogs);
            dfs( L+1, sum,dogs);
        }

    }

    public static void main(String[] args) {
        DFS2 m = new DFS2();

        Scanner in = new Scanner(System.in);

        total = in.nextInt();
        n = in.nextInt();

        int[] dogs = new int[n];

        for (int i = 0; i < n; i++) {
            dogs[i] = in.nextInt();
        }

        m.dfs(0,0,dogs);
        System.out.println(answer);
        return ;
    }
}
