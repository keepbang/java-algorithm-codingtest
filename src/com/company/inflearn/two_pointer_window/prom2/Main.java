package com.company.inflearn.two_pointer_window.prom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

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

        int[] answer = main.solution(a, b);

        for (int i : answer) {
            System.out.print(i + " ");
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
