package com.company.string;

import java.util.ArrayList;

/**
 * 문자 암호
 */
public class StringPassword {
    public String solution(int n, String input){
        String answer = "";

        input = input.replace('#','1').replace('*','0');

        for (int i = 0; i < n; i++) {
            String tmp = input.substring(0,7);
            input = input.substring(7);
            answer += (char)Integer.parseInt(tmp,2);
        }

        return answer;
    }

    public static void main(String[] args) {
        StringPassword M = new StringPassword();

        int n = 4;
        String input = "#****###**#####**#####**##**";

        System.out.println(M.solution(n,input));
    }
}
