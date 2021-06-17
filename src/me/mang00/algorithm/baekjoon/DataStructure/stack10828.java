package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class stack10828 {

    static List<Integer> stack = new ArrayList<>();
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch(command) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int num) {
        stack.add(num);
    }

    public static int pop() {
        if (stack.isEmpty()) return -1;
        else return stack.remove(stack.size() - 1);
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        if (stack.isEmpty()) return 1;
        else return 0;
    }

    public static int top() {
        if (stack.isEmpty()) return -1;
        else return (stack.get(stack.size() - 1));
    }
}