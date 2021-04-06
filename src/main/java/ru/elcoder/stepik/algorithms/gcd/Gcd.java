package ru.elcoder.stepik.algorithms.gcd;

import java.util.Scanner;

public class Gcd {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        int r = a % b;
        if (r == 0) {
            return b;
        }
        return gcd(b, r);
    }
}
