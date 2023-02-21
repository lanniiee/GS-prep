package org.questions;

import java.util.Arrays;

public class Fibonacci {

    public static int fibonacci(int n) {
        int[] numbers = new int[n];
        int answer = 0;

        if (n == 1 || n == 2) {
            answer = 1;
        } else {
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 0; i < n-2; i++) {
                numbers[i + 2] = numbers[i] + numbers[i + 1];
                answer = numbers[i + 2];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
