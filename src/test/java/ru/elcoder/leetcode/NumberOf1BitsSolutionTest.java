package ru.elcoder.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 04.07.2017.
 */
public class NumberOf1BitsSolutionTest {

    private NumberOf1BitsSolution solution;

    @Before
    public void createSolution() {
        solution = new NumberOf1BitsSolution();
    }

    @Test
    public void testHammingWeight() throws Exception {
        test(0, 0);
        test(2, 1);
        test(3, 2);
        test(7, 3);
        test(255, 8);
        test(65535, 16);
        test(Integer.MAX_VALUE, 31);
        test(Integer.MIN_VALUE, 1);
        test(-1, 32);
        test(-2, 31);
    }

    private void test(int n, int expected) {
        final int cnt = solution.hammingWeight(n);
        assertEquals(expected, cnt);
    }
}