package com.company.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 *
 * 설명
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 *
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class BiggerNumberOutput {
    public int[] solution(int n, int[] arr){
        ArrayList<Integer> tmp = new ArrayList<>();

        if(n == 0 || n == 1) return arr;

        tmp.add(arr[0]);

        for(int i = 1;i < arr.length;i++){
            if(arr[i-1] < arr[i]){
                tmp.add(arr[i]);
            }
        }

        int[] answer = new int[tmp.size()];

        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        BiggerNumberOutput M = new BiggerNumberOutput();

        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        String[] strArr = input2.split(" ");

        int[] intArr = new int[strArr.length];
        for(int i = 0;i<strArr.length;i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int[] result = M.solution(Integer.parseInt(input1), intArr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        return ;
    }
}
