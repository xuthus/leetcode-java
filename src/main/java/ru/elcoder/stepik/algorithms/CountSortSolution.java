package ru.elcoder.stepik.algorithms;

import java.util.Scanner;

public class CountSortSolution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] counts = new int[11];
        for (int i = 0; i < n; i++) {
            final int num = scanner.nextInt();
            counts[num]++;
        }
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            final int count = counts[i];
            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    builder.append(i).append(' ');
                }
            }
        }
        System.out.println(builder);
    }
}
