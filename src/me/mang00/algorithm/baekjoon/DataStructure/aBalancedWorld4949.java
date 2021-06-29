package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class aBalancedWorld4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String input;

        while (true) {
            input = br.readLine();

            if (input.equals("."))
                break;

            result.append(check(input)).append('\n');
        }
        System.out.println(result);
        br.close();
    }

    public static String check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);

            if (tmp == '(' || tmp == '[') {
                stack.push(tmp);
            }

            else if (tmp == ')') {
                if (stack.empty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            }

            else if (tmp == ']') {
                if (stack.empty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }
        }

        if (stack.empty())
            return "yes";
        else
            return "no";
    }
}