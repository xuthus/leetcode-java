package ru.elcoder.stepik.algorithms;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * find maximal amount of distinct natural numbers whose sum equals to N
 * output all numbers
 */
public class DistinctTermsSolution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = distinctTerms(1, n);
        System.out.println(IntStream.of(nums).mapToObj(i -> i + "").collect(Collectors.joining(" ")));
    }

    private static int[] distinctTerms(int min, int n) {
        if (n <= 2 || n <= min * 2) {
            return new int[]{n};
        }
        final int[] nums = distinctTerms(min + 1, n - min);
        int[] res = new int[nums.length + 1];
        res[0] = min;
        System.arraycopy(nums, 0, res, 1, nums.length);
        return res;
    }
}
