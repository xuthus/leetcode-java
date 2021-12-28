package ru.elcoder.stepik.algorithms.mergesort;

import java.util.Scanner;

/**
 * Первая строка содержит число 1 <= n <= 10^5, <br/>
 * вторая — массив A[1 .. n], содержащий натуральные числа, не превосходящие 10^9. <br/>
 * Необходимо посчитать число пар индексов 1 <= i < j <= n , <br/>
 * для которых A[i] > A[j].<br/>
 * Такая пара элементов называется инверсией массива. Количество инверсий в массиве является в некотором смысле его
 * мерой неупорядоченности: например, в упорядоченном по неубыванию массиве инверсий нет вообще, а в массиве,
 * упорядоченном по убыванию, инверсию образуют каждые два элемента.
 */
public class InversionsCountSolution {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        long count = mergeSort(array, 0, n - 1);
        System.out.println(count);
    }

    public static long mergeSort(int[] array, int l, int r) {
        if (r == l) {
            return 0L;
        }
        if (r - l == 1) {
            if (array[r] >= array[l]) {
                return 0L;
            }
            swap(array, r, l);
            return 1L;
        }
        int m = (l + r) >> 1;
        long res = 0;
        res += mergeSort(array, l, m);
        res += mergeSort(array, m + 1, r);
        res += merge(array, l, m, m + 1, r);
        return res;
    }

    public static long merge(int[] array, int l1, int r1, int l2, int r2) {
        long count = 0;
        int saveL1 = l1;
        int[] dest = new int[r1 - l1 + 1 + r2 - l2 + 1];
        int i = 0;
        while (l1 <= r1 || l2 <= r2) {
            int top1 = l1 <= r1 ? array[l1] : Integer.MAX_VALUE;
            int top2 = l2 <= r2 ? array[l2] : Integer.MAX_VALUE;
            if (top1 <= top2) {
                dest[i++] = top1;
                l1++;
            } else {
                dest[i++] = top2;
                l2++;
                if (l1 <= r1)
                    count += (r1 - l1 + 1);
            }
        }
        System.arraycopy(dest, 0, array, saveL1, dest.length);
        return count;
    }

    private static void swap(int[] array, int p1, int p2) {
        int tmp = array[p1];
        array[p1] = array[p2];
        array[p2] = tmp;
    }
}
