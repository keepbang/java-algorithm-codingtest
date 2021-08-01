package com.company.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 설명
 *
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 *
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 *
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 *
 * 입력
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 *
 *
 * 출력
 * 입력된 순서대로 등수를 출력하다
 */
public class 등수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        등수구하기 m = new 등수구하기();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] answer = m.solution(arr);
        for (int i : answer) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(int[] arr){

        int[] answer = new int[arr.length];
        int idx = 0;
        for (int i : arr) {
            int level = 1;
            for (int j : arr) {
                if(i < j){
                    level += 1;
                }
            }
            answer[idx++] = level;
        }

        return answer;
    }



}
