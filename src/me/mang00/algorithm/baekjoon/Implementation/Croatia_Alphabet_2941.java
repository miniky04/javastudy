package me.mang00.algorithm.baekjoon.Implementation;

import java.io.*;
import java.lang.*;

public class Croatia_Alphabet_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] Croatia = {"c=", "c-", "dz=","d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < Croatia.length; i++) {
            if(str.contains(Croatia[i])) {
                str = str.replaceAll(Croatia[i], " ");
            }
        }
        System.out.println(str.length());
    }
}