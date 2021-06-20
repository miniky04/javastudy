package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parentheses9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            sb.append(check(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }

    public static String check(String s) {
        int count = 0;

        for(char c : s.toCharArray()) {
            if(c=='(') count++;
            else if(c == ')') {
                if(count == 0) return "NO";
                else count--;
            }
        }

        if(count == 0) return "YES";
        else return "NO";
    }
}