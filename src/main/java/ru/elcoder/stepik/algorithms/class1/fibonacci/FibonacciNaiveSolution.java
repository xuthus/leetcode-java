package ru.elcoder.stepik.algorithms.class1.fibonacci;

import java.util.Scanner;

public class FibonacciNaiveSolution {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(fib(n));
    }
}
