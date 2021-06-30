package com.company.recursive;

import java.util.ArrayList;

/**
 * 1부터 n까지 부분집합 구하기
 */
public class SubSet {

    public static boolean[] tmpArr;
    public static ArrayList<ArrayList<Integer>> ANSWER;

    public static void solution(int n){
        tmpArr = new boolean[n+1]; // true로 초기화

        ANSWER = new ArrayList<>();

        dfs(1,n);
    }

    public static void dfs(int i, int n){
        if(i == n + 1) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 1; j < tmpArr.length ; j++) {
                if(tmpArr[j]){
                    tmp.add(j);
                }
            }
            if(tmp.size() > 0) ANSWER.add(tmp);
        }else{
            tmpArr[i] = true;
            dfs(i+1,n);
            tmpArr[i] = false;
            dfs(i+1,n);
        }
    }



    public static void main(String[] args) {
        solution(4);

        System.out.println(ANSWER.size());
        System.out.println(ANSWER.toString());
    }
}
