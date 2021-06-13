package me.mang00.algorithm.baekjoon.Math;

public class selfNumber4673 {
    public static void main(String[] args) {

        boolean[] notSelfNumber = new boolean[10001];

        for(int i = 1; i < 10001; i++) {
            int n = self(i);
            if (n < 10001) {
                notSelfNumber[n] = true;
            }
        }

        for(int i = 1; i < 10001; i++) {
            if (!notSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static int self(int number) {
        int notSelf = number;

        while (number != 0) {
            notSelf += number % 10;
            number /= 10;
        }

        return notSelf;
    }
}
