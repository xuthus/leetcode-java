package ru.elcoder.leetcode;

/**
 * Created by xuthus on 14.05.2017.
 */
public class UglyNumbersIISolution {
    /*
    Write a program to find the n-th ugly number.

    Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
    For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

    Note that 1 is typically treated as an ugly number, and n does not exceed 1690.
    https://leetcode.com/problems/ugly-number-ii
     */

    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        int[] uglies = new int[n];
        uglies[0] = 1;
        int pos2 = 0;
        int pos3 = 0;
        int pos5 = 0;

        for (int i = 1; i < n; i++) {
            int n2 = uglies[pos2] * 2;
            int n3 = uglies[pos3] * 3;
            int n5 = uglies[pos5] * 5;
            uglies[i] = Math.min(Math.min(n2, n3), n5);

            if (n2 == uglies[i])
                pos2++;
            if (n3 == uglies[i])
                pos3++;
            if (n5 == uglies[i])
                pos5++;
        }
        return uglies[n - 1];
    }

    public int nthUglyNumberOpt(int n) {
        if (n == 1) return 1;
        int[] uglies = new int[n];
        uglies[0] = 1;
        int pos2 = 0;
        int pos3 = 0;
        int pos5 = 0;

        int n2 = uglies[pos2] * 2;
        int n3 = uglies[pos3] * 3;
        int n5 = uglies[pos5] * 5;
        int ugly = 0;
        for (int i = 1; i < n; i++) {
            ugly = (n2 < n3 && n2 < n5) ? n2 : (n3 < n5) ? n3 : n5;
            uglies[i] = ugly;

            if (n2 == ugly)
                n2 = uglies[++pos2] * 2;
            if (n3 == ugly)
                n3 = uglies[++pos3] * 3;
            if (n5 == ugly)
                n5 = uglies[++pos5] * 5;
        }
        return ugly;
    }
}
