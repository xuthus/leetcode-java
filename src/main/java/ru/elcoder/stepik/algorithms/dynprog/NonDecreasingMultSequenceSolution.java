package ru.elcoder.stepik.algorithms.dynprog;

import java.util.Scanner;

/**
 * Дано целое число 1 <= n <= 10^3 и массив A[1 .. n] натуральных чисел, не превосходящих 2e9.
 * Выведите максимальное 1 <= k <= n, для которого найдётся подпоследовательность 1 <= i_1 <= i_2 <= .. <= i_k <= n
 * длины k, в которой каждый элемент делится на предыдущий (формально: для всех 1 <= j <= k, A[i_j] | A[i_{j+1}]).
 */
public class NonDecreasingMultSequenceSolution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int max = findMaxSequenceLength(nums);
        System.out.println(max);
    }

    public static int findMaxSequenceLength(int[] nums) {
        int[] d = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && (d[j] + 1) > d[i]) {
                    d[i] = d[j] + 1;
                }
            }
        }
        int max = 0;
        for (int num : d) {
            max = Math.max(max, num);
        }
        return max;
    }
}
