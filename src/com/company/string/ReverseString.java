package com.company.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 문자열 뒤집기
 *
 * 설명
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class ReverseString {
    public List<String> solution1(int n, String[] input){
        List<String> stringList = new ArrayList<>();

        for (String s : input) {
            String tmp = new StringBuilder(s).reverse().toString();
            stringList.add(tmp);
        }


        return stringList;
    }

    public List<String> solution2(int n, String[] input){
        List<String> stringList = new ArrayList<>();

        for (String s : input) {
            stringList.add(reverse(s));
        }

        return stringList;

    }

    public String reverse(String input){
        int lt = 0;
        int rt = input.length()-1;
        char[] charArr = input.toCharArray();

        while(lt < rt){
            char tmp = charArr[lt];
            charArr[lt] = charArr[rt];
            charArr[rt] = tmp;
            lt++;
            rt--;
        }

        return String.valueOf(charArr);

    }

    public static void main(String[] args){
        ReverseString m = new ReverseString();
        Scanner in=new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        String[] strArr = new String[N];
        for(int i = 0; i<N ;i++){
            strArr[i] = in.nextLine();
        }
        for(String x : m.solution1(N,strArr)){
            System.out.println(x);
        }

        return ;
    }

}
