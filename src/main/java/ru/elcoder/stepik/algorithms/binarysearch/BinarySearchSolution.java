package ru.elcoder.stepik.algorithms.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchSolution {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        final int k = scanner.nextInt();
        final int[] pos = new int[k];
        for (int i = 0; i < k; i++) {
            final int num = scanner.nextInt();
            pos[i] = binarySearch(array, num);
        }
        for (int i = 0; i < pos.length - 1; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println(pos[pos.length - 1]);
    }

    public static int binarySearch(int[] array, int num) {
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int i = (l + r) >> 1;
            if (array[i] == num) {
                return i + 1;   // arrays are 1-based by the problem description
            } else if (num > array[i]) {
                l = i + 1;
            } else {
                r = i - 1;
            }
        }
        return -1;
    }
}
