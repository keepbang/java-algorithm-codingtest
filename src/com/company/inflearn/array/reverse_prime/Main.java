package com.company.inflearn.array.reverse_prime;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 *
 * 설명
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 *
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */
public class Main {


    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = reverseNumber(arr[i]);

            if(isPrime(num)) answer.add(num);


        }

        return answer;

    }

    public boolean isPrime(int n){
        int sqrt = (int) Math.sqrt(n);

        // 2는 유일한 짝수 소수
        if (n == 2)
            return true;

        // 짝수와 1은 소수가 아님
        if (n % 2 == 0 || n == 1)
            return false;

        // 제곱근까지만 홀수로 나눠보면 됨
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int reverseNumber(int n){
        String tmp = String.valueOf(n);
        String result = "";

        for (int i = 0; i < tmp.length(); i++) {
            result = tmp.charAt(i) + result;
        }

        return Integer.parseInt(result);
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);

        String input1 = in.nextLine();
        String input2 = in.nextLine();

        int n = Integer.parseInt(input1);
        String[] splitInput = input2.split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(splitInput[i]);
        }

        m.solution(n, arr).forEach(System.out::println);
    }
}
