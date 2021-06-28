package com.company.string;

/**
 * 회문 문자열 찾기
 */
public class PalindromeString {
    public String solution(String input){
        input = input.toLowerCase();

        int lt = 0;
        int rt = input.length() - 1;

        String answer = "YES";

        while(lt < input.length()/2){
            if(input.charAt(lt) != input.charAt(rt)){
                answer = "NO";
                break;
            }

            lt++;
            rt--;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
