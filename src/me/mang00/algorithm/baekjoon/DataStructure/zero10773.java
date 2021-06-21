package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class zero10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> intStack = new Stack<>();

        for(int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) intStack.pop();
            else intStack.push(number);
        }

        int sum = 0;

        for(int i : intStack) sum = sum + i;

        System.out.println(sum);
    }
}