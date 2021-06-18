package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWordOrder12605 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringBuilder result = new StringBuilder();

            String str = br.readLine();
            List<String> reverseList = Arrays.asList(str.split(" "));

            Collections.reverse(reverseList);

            for (String reverseStr : reverseList) {
                result.append(reverseStr).append(" ");
            }
            System.out.println("Case #" + (i + 1) + ": " + result);
        }
    }
}