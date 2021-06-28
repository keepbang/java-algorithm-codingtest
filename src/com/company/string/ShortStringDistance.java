package com.company.string;

/**
 * 가장 짧은 문자 거리
 */
public class ShortStringDistance {
    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t){
                len += 1;
                answer[i] = len;
            }else{
                len = 0;
                answer[i] = len;
            }
        }

        len = 0;
        for (int i = s.length()-1; i > -1; i--) {
            if(s.charAt(i) != t){
                len += 1;
                answer[i] = Math.min(answer[i],len);
            }else{
                len = 0;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        ShortStringDistance T = new ShortStringDistance();

        String s = "teachermode";
        char t = 'e';

        int[] result = T.solution(s,t);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
