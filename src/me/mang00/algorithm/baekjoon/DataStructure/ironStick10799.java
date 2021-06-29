package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ironStick10799 {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        String parentheses = br.readLine();
        for (int i = 0; i < parentheses.length(); i++) {
            result += check(parentheses.charAt(i), i);
        }
        System.out.println(result);
        br.close();
    }

    public static int check(char c, int i) {
        int count = 0;

        if (c == '(') {
            stack.push(i);
        } else {
            if (stack.peek() == i - 1) {
                stack.pop();
                count += stack.size();
            } else {
                stack.pop();
                count++;
            }
        }
        return count;
    }
}