package me.mang00.algorithm.baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackSequence1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        Stack<Integer> numBasket = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        boolean bool = true;

        while (n-- > 0) {
            int number = Integer.parseInt(br.readLine());

            while (count <= number) {
                numBasket.add(count);
                result.append('+').append('\n');
                count += 1;
            }

            if (number == numBasket.peek()) {
                numBasket.pop();
                result.append('-').append('\n');
            } else {
                bool = false;
                break;
            }
        }

        if (!bool) {
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }
}