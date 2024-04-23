package com.company.inflearn.two_pointer_window.prom2;

import java.util.Arrays;
import java.util.LinkedList;

public class 공통원소구하기 {
    public static void main(String[] args) {
        공통원소구하기 m = new 공통원소구하기();

        int[] a = {1,2,3,5,8};
        int[] b = {2,3,5,6,7,8};

        int[] result = m.solution(a,b);

        for (int i : result) {
            System.out.print(i + ", ");
        }

    }

    public int[] solution(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;
        int m = a.length, n = b.length;

        LinkedList<Integer> list = new LinkedList<>();

        while(p1 < m && p2 < n){
            if(a[p1] == b[p2]){
                list.add(a[p1++]);
                p2++;
            }else if(a[p1] < b[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
