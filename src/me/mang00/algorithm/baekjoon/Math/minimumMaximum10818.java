package me.mang00.algorithm.baekjoon.Math;

import java.util.Scanner;
import java.util.Arrays;

public class minimumMaximum10818 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[sc.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
