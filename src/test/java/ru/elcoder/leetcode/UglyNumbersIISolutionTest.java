package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 14.05.2017.
 */
public class UglyNumbersIISolutionTest {

    public static void main(String[] args) {
        UglyNumbersIISolution solution = new UglyNumbersIISolution();
        long startAt = System.currentTimeMillis();
        for (int k = 0; k < 10; k++) {
            for (int i = 1; i < 1690; i++) {
                solution.nthUglyNumberOpt(i);
            }
        }
        System.out.println("Optimized, ms: " + (System.currentTimeMillis() - startAt));
        startAt = System.currentTimeMillis();
        for (int k = 0; k < 10; k++) {
            for (int i = 1; i < 1690; i++) {
                solution.nthUglyNumber(i);
            }
        }
        System.out.println("Not optimized, ms: " + (System.currentTimeMillis() - startAt));
    }

    private static boolean isUglyNumber(int num) {
        if (num == 1) return true;
        if (num % 2 == 0) return isUglyNumber(num / 2);
        if (num % 3 == 0) return isUglyNumber(num / 3);
        if (num % 5 == 0) return isUglyNumber(num / 5);
        return false;
    }

    @Test
    public void testNthUglyNumber() throws Exception {
        UglyNumbersIISolution solution = new UglyNumbersIISolution();
        int n = 1;
        int i = 0;
        for (i = 1; n <= 100; i++) {
            if (isUglyNumber(i)) {
                assertEquals(i, solution.nthUglyNumberOpt(n++));
            }
        }
        for (i = 1; i <= 1690; i++) {
            solution.nthUglyNumberOpt(i);
        }
        assertEquals(2123366400, solution.nthUglyNumberOpt(1690));
    }
}