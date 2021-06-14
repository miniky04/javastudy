package me.mang00.algorithm.baekjoon.Implementation;

import java.io.*;

public class groupWordChecker1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < num; i++) {
            if (checker() == true) count++;
        }
        System.out.println(count);
    }

    public static boolean checker() throws IOException {
        boolean[] alphabet = new boolean[26];
        int compareInt = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int nowChar = str.charAt(i);

            if(nowChar != compareInt) {
                if (alphabet[nowChar - 'a'] == false) {
                    alphabet[nowChar - 'a'] = true;
                    compareInt = nowChar;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}