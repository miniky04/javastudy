package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 힌트얻어서 풀었음 다시 풀어볼 것!

public class valuesInParentheses2504 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(check(str) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    static int check(String s) {
        int count = 0;
        String[] arr = s.split("");
        if (arr.length % 2 == 1)
            return count;

        Stack<String> stack = new Stack<String>();
        int calculation = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                calculation *= 2;
                stack.push(arr[i]);
            } else if (arr[i].equals("[")) {
                calculation *= 3;
                stack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                if (stack.isEmpty() || !stack.peek().equals("("))
                    return calculation = 0;
                if (arr[i - 1].equals("("))
                    count += calculation;
                stack.pop();
                calculation /= 2;
            } else if (arr[i].equals("]")) {
                if (stack.isEmpty() || !stack.peek().equals("["))
                    return calculation = 0;
                if (arr[i - 1].equals("["))
                    count += calculation;
                stack.pop();
                calculation /= 3;
            }
        }
        return count;
    }
}