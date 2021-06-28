package com.company.string;

import java.util.Scanner;

/**
 * 특정 문자만 바꾸기
 *
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
public class ReverseSpatialString {
    public String solution(String input){
        String answer = "";

        int rt = input.length()-1;
        int lt = 0;
        char[] charArr = input.toCharArray();

        while(rt > lt){
            if(!Character.isAlphabetic(charArr[lt])) lt++;
            else if(!Character.isAlphabetic(charArr[rt])) rt--;
            else{
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(charArr);

        return answer;
    }

    public static void main(String[] args){
        System.out.println("test");
        System.err.println("error");
    }
}
