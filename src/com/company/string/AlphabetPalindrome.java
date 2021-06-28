package com.company.string;

import java.util.Scanner;

/**
 * 알파벳 회문 문자열 검사
 */
public class AlphabetPalindrome {
    public String solution(String input){
        String answer = "NO";
        input = input.toLowerCase().replaceAll("[^a-z]","");
        System.err.println(input);
        String tmp = new StringBuilder(input).reverse().toString();
        System.out.println(tmp);
        if(tmp.equals(input)) answer = "YES";

        return answer;

    }

    public static void main(String[] args){
        AlphabetPalindrome m = new AlphabetPalindrome();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(m.solution(input));
        return ;
    }
}
