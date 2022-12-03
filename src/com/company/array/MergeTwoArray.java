package com.company.array;

/**
 * 정렬된 두 배열 합치기(two-pointers)
 */
public class MergeTwoArray {
    public static void main(String[] args) {
        MergeTwoArray m = new MergeTwoArray();

        int[] a = {1,3,7,20,33};
        int[] b = {2,7,8,9,10,27,88,92,102};

        int[] result = m.solution(a,b);

        for (int i : result) {
            System.out.print(i + ", ");
        }

    }

    public int[] solution(int[] a, int[] b){
        int p1 = 0, p2 = 0;
        int n = a.length, m = b.length;

        int[] answer = new int[n + m];
        int idx = 0;


        while(p1 < n && p2 < m){
            if(a[p1] < b[p2]) answer[idx++] = a[p1++];
            else answer[idx++] = b[p2++];

        }

        while(p1 < n){
            answer[idx++] = a[p1++];
        }

        while(p2 < m){
            answer[idx++] = b[p2++];
        }

        return answer;
    }
}
