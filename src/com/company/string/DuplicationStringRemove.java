package com.company.string;

/**
 * 중복문자 제거
 */
public class DuplicationStringRemove {
    public String solution(String input){
        String answer = "";

        for (int i = 0; i < input.length(); i++) {
            if(i == input.indexOf(input.charAt(i))){
                answer += input.charAt(i);
            }
        }
        
        return answer;
    }
}
