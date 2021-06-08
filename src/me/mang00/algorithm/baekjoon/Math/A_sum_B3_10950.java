package me.mang00.algorithm.baekjoon.Math;

import java.util.Scanner;

public class A_sum_B3_10950 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int i;

        for (i = 0; i<count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }
    }
}
