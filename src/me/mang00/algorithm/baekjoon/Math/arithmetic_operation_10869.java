package me.mang00.algorithm.baekjoon.Math;

import java.io.*;
import java.util.*;

public class arithmetic_operation_10869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write((a+b) + "\n");
        bw.write((a-b) + "\n");
        bw.write((a*b) + "\n");
        bw.write((a/b) + "\n");
        bw.write((a%b) + "\n");

        bw.flush();
        bw.close();
    }
}
