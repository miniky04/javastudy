package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rubberDuckDebugging20001 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String rubberDuck = br.readLine();
        int count = 0;

        rubberDuck = br.readLine();

        while (!rubberDuck.equals("고무오리 디버깅 끝")) {
            if (rubberDuck.equals("문제")) {
                count++;
            } else if (rubberDuck.equals("고무오리")) {
                if (count == 0) {
                    count += 2;
                } else {
                    count--;
                }
            }
            rubberDuck = br.readLine();
        }

        if (count > 0) {
            System.out.println("힝구");
        } else {
            System.out.println("고무오리야 사랑해");
        }
    }
}