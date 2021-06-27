package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class goodWord3986 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            result += check(str);
        }
        System.out.println(result);
        br.close();
    }

    public static Integer check(String s) throws IOException {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        if(stack.isEmpty()) count++;
        return count;
    }
}