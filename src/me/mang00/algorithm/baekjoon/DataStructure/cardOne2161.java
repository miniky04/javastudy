package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class cardOne2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++)
            queue.offer(i);

        while(!queue.isEmpty()) {
            result.append(queue.poll().toString()).append(" ");
            if(queue.isEmpty()) {
                break;
            }
            queue.offer(queue.poll());
        }
        System.out.println(result);
    }
}