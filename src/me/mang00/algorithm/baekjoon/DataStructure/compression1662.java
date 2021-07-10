package me.mang00.algorithm.baekjoon.DataStructure;

/*
스택 1 -> 숫자 길이 저장 ex) 33(562(71(9))) 이면 3, 56, 7이니 1, 2, 1이 저장됨
스택 2 -> 괄호 전 숫자 저장 ex) 위와 같은 예제면 3, 2, 1 저장
'(' -> count 를 계산해서 스택1과 스택2에 값을 넣는다.
')' -> 스택1과 스택2에서 값을 꺼내서 계산하고 count 에 더해준다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class compression1662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> left = new Stack<>();
        Stack<Integer> number = new Stack<>();
        String input = br.readLine();
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c == '(') {
                count -= 1;
                int temp = input.charAt(i - 1) -'0';
                left.push(count);
                number.push(temp);
                count = 0;
            }
            else if(c == ')') {
                int a = number.peek();
                number.pop();
                a  *= count;

                int b = left.peek();
                left.pop();
                count = a + b;
            }
            else {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}