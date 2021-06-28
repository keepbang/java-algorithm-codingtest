package com.company.string;

/**
 * 문자열 압축
 */
public class StringCompress {
    public String solution(String input){
        String answer = "";
        input = input + " ";
        int count = 1;

        for (int i = 0; i < input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i+1)){
                count++;
            }else{
                answer = answer + String.valueOf(input.charAt(i)) + (count==1?"":count);
                count = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringCompress M = new StringCompress();

        String input = "KSTTTSEEKFKKKDJJGG";

        System.out.println(M.solution(input));
        System.err.println("KST3SE2KFK3DJ2G2");
    }
}
