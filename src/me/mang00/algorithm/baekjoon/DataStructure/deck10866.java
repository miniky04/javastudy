package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class deck10866 {

    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    if (deque.isEmpty()) {
                        result.append(-1).append('\n');
                    } else {
                        result.append(deque.pollFirst()).append('\n');
                    }
                    break;

                case "pop_back":
                    if (deque.isEmpty()) {
                        result.append(-1).append('\n');
                    } else {
                        result.append(deque.pollLast()).append('\n');
                    }
                    break;

                case "size":
                    result.append(deque.size()).append('\n');
                    break;

                case "empty":
                    if (deque.isEmpty()) {
                        result.append(1).append('\n');
                    } else {
                        result.append(0).append('\n');
                    }
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        result.append(-1).append('\n');
                    } else {
                        result.append(deque.peekFirst()).append('\n');
                    }
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        result.append(-1).append('\n');
                    } else {
                        result.append(deque.peekLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(result);
    }
}