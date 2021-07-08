package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class cardTwo2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++)
            queue.offer(i);

        while(N --> 0) {
            if(queue.size() == 1) {
                System.out.println(queue.poll());
                break;
            }
            queue.poll();
            queue.offer(queue.poll());
        }
    }
}
