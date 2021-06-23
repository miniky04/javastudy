package me.mang00.algorithm.baekjoon.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci1003 {

    static int zero, one, plus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            result.append(zero).append(' ').append(one).append('\n');
        }
        System.out.println(result);
        br.close();
    }

    public static void fibonacci(int n) {
        zero = 1;
        one = 0;
        plus = 1;

        for(int i = 0; i < n; i++) {
            zero = one;
            one = plus;
            plus = zero + one;
        }
    }
}