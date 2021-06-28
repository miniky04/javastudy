package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue10845 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch(command) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
                    break;

                case "pop":
                    result.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
                    break;

                case "size":
                    result.append(queue.size()).append('\n');
                    break;

                case "empty":
                    result.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    result.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
                    break;

                case "back":
                    result.append(queue.isEmpty() ? -1 : last).append('\n');
                    break;
            }
        }
        System.out.println(result);
    }
}