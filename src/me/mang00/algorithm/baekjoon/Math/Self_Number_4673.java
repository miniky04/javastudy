package me.mang00.algorithm.baekjoon.Math;

public class Self_Number_4673 {
    public static void main(String[] args) {

        boolean[] NotSelfNumber = new boolean[10001];

        for(int i = 1; i < 10001; i++) {
            int n = self(i);
            if (n < 10001) {
                NotSelfNumber[n] = true;
            }
        }

        for(int i = 1; i < 10001; i++) {
            if (!NotSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static int self(int number) {
        int NotSelf = number;

        while (number != 0) {
            NotSelf += number % 10;
            number /= 10;
        }

        return NotSelf;
    }
}
