package me.mang00.algorithm.baekjoon.Math;

import java.util.Scanner;

public class aMultiplyB10998 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(0 < a && b < 10){
            int c = a * b;
            System.out.println(c);
        }
    }
}
