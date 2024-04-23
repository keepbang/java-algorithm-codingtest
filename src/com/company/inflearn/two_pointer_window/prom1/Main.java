package com.company.inflearn.two_pointer_window.prom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정렬된 두 배열 합치기(two-pointers)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] aArr = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aArr[i]);
        }

        int m = Integer.parseInt(br.readLine());

        int[] b = new int[m];
        String[] bArr = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(bArr[i]);
        }

        for (int i : main.solution(a, b)) {
            System.out.print(i + " ");
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
