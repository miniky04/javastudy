package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class josephusProblem1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++)
            queue.offer(i);

        result.append("<");

        while(queue.size() != 1) {
            for(int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            result.append(queue.poll()).append(", ");
        }

        result.append(queue.poll()).append(">");
        System.out.println(result.toString());
        br.close();
    }
}