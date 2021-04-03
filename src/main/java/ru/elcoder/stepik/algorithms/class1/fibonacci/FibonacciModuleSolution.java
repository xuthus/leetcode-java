package ru.elcoder.stepik.algorithms.class1.fibonacci;

import java.util.Scanner;

/**
 * <pre>
 * Даны целые числа 1 <= n <= 1e18 и 2 <= m <= 1e5
 * необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * </pre>
 */
public class FibonacciModuleSolution {

    public static int[] sequence;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int m = scanner.nextInt();
        System.out.println(calcMod(n, m));
    }

    public static int calcMod(long n, int m) {
        int len = findPizanoSequence((int) Math.min(n, m * 12L), m);
        if (len > 0) {
            return sequence[(int) (n % len)];
        } else {
            return sequence[(int) n];
        }
    }

    public static int findPizanoSequence(int n, int m) {
        sequence = new int[n + 1];
        sequence[0] = 0;
        sequence[1] = 1;
        int n1 = 1;
        int n2 = 0;
        int n0 = 0;
        int xorSum = sequence[0] ^ sequence[1]; // == 1
        for (int i = 2; i <= n; i++) {
            n0 = (n1 + n2) % m;
            sequence[i] = n0;
            xorSum ^= n0;
            if (xorSum == 0 && sequence2x(sequence, i)) {
                return i >> 1;
            }
            n2 = n1;
            n1 = n0;
        }
        return 0;
    }

    public static boolean sequence2x(int[] ints, int len) {
        if ((len & 1) == 1) {
            return false;
        }
        int subLen = len >> 1;
        for (int i = 0; i < subLen; i++) {
            if (ints[i] != ints[i + subLen]) {
                return false;
            }
        }
        return true;
    }
}
