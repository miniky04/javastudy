package me.mang00.algorithm.baekjoon.Math;

import java.util.Scanner;

public class Average_1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[sc.nextInt()];
        int max = 0, sum = 0;
        double avg = 0.0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        sc.close();

        avg = 100.0 * sum / max / arr.length;
        System.out.println(avg);
    }
}


