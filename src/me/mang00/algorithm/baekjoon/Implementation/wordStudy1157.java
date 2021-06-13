package me.mang00.algorithm.baekjoon.Implementation;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class wordStudy1157 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toUpperCase().toCharArray();
        int max = 0;
        int overlap = '?';
        int overlapCount = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char key : chArr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for ( Character i : map.keySet() ) {
            if (max < map.get(i)) max = map.get(i);
        }

        for(Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(max)) {
                overlap = entry.getKey();
                overlapCount++;
            }
        }

        if(overlapCount > 1) System.out.println('?');
        else System.out.println((char)overlap);

    }
}