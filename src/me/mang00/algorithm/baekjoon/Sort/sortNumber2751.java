package me.mang00.algorithm.baekjoon.Sort;

import java.io.*;
import java.util.*;

public class sortNumber2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < number; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);
    }
}
