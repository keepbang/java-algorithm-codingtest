package com.company.string;

/**
 * 숫자만 추출
 */
public class GetDigit {
    public int solution(String input){
        String answer = "";

        for (char c : input.toCharArray()){
            if(Character.isDigit(c)) answer += String.valueOf(c);
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        GetDigit g = new GetDigit();
        System.out.println(g.solution("g0en2T0s8eSoft"));
    }

}
