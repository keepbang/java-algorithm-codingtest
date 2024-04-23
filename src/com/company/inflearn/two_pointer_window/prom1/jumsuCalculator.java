package com.company.inflearn.two_pointer_window.prom1;

import java.util.Scanner;

public class jumsuCalculator {

    public static void main(String[] args) {
        jumsuCalculator m = new jumsuCalculator();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] resultArr = new int[n];
        for (int i = 0; i < n; i++) {
            resultArr[i] = in.nextInt();
        }

        System.out.println(m.solution(n,resultArr));

    }

    private int solution(int n, int[] resultArr) {
        int sum = 0;
        int tmp = 0;

        for (int i = 0; i < resultArr.length; i++) {
            if(resultArr[i] == 1){
                tmp += 1;
                sum = sum + tmp;
            }else{
                tmp = 0;
            }
        }

        return sum;
    }
}
