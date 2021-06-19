package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class goad17608 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] heightArr = new int[num];

        for (int i = 0; i < num; i++) {
            heightArr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int count = 1;
        int highHeight = heightArr[num - 1];

        for (int m = num - 2; m >= 0; m--) {
            if (heightArr[m] > highHeight) {
                count++;
                highHeight = heightArr[m];
            }
        }

        System.out.println(count);
    }
}