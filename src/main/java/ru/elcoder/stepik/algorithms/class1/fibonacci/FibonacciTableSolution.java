package ru.elcoder.stepik.algorithms.class1.fibonacci;

import java.util.Scanner;

public class FibonacciTableSolution {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int n1 = 1;
        int n2 = 0;
        int n0 = 0;
        for (int i = 2; i <= n; i++) {
            n0 = n1 + n2;
            n2 = n1;
            n1 = n0;
        }
        return n0;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(fib(n));
    }
}
