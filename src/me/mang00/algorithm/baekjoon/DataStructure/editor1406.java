package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class editor1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        String input = br.readLine();
        int N = input.length();

        for(int i = 0; i < N; i++) {
            leftStack.push(input.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            String command = br.readLine();

            if(command.equals("L")) {
                if(!leftStack.empty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (command.equals("D")) {
                if(!rightStack.empty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if(command.equals("B")) {
                if(!leftStack.empty()) {
                    leftStack.pop();
                }
            } else if(command.startsWith("P")) {
                String[] splitCommand = command.split(" ");
                leftStack.push(splitCommand[1].toCharArray()[0]);
            }
        }

        while(!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }

        while(!rightStack.empty()) {
            bw.write(rightStack.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}