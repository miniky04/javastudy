package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class insertParentheses11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            if(c == '(')
                stack.push(c);
            else{
                if(stack.empty())
                    count++;
                else
                    stack.pop();
            }
        }
        count += stack.size();
        System.out.println(count);
    }
}