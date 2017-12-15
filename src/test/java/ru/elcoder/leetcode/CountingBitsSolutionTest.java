package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.timer.Timer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class CountingBitsSolutionTest {

    public static final int LOOP_COUNT = 1;

    @Test
    public void countBitsDynamicInPlace() {
        CountingBitsSolution solution = new CountingBitsSolution();
        assertArrayEquals(arrayOf(0, 1), solution.countBits(1));
        assertArrayEquals(arrayOf(0, 1, 1, 2), solution.countBits(3));
        assertArrayEquals(arrayOf(0, 1, 1), solution.countBits(2));
        final Timer timer = new Timer();
        timer.start();
        for (int i = 0; i < LOOP_COUNT; i++) {
            solution.countBits(25678);
        }
//        System.out.println(timer.finish());
    }

    @Test
    public void genCountsInPlace() throws Exception {
        CountingBitsSolution solution = new CountingBitsSolution();
        int[] ints = new int[2];
        assertArrayEquals(arrayOf(0, 1), solution.genCountsInPlace(2, ints));
        ints = new int[4];
        assertArrayEquals(arrayOf(0, 1, 1, 2), solution.genCountsInPlace(4, ints));
        ints = new int[8];
        assertArrayEquals(arrayOf(0, 1, 1, 2, 1, 2, 2, 3), solution.genCountsInPlace(8, ints));
    }

    @Test
    public void getMaxPower2() throws Exception {
        CountingBitsSolution solution = new CountingBitsSolution();

        assertEquals(1, solution.getMaxPower2(1));
        assertEquals(2, solution.getMaxPower2(2));
        assertEquals(8, solution.getMaxPower2(15));
        assertEquals(16, solution.getMaxPower2(16));
        assertEquals(16, solution.getMaxPower2(18));
        assertEquals(128, solution.getMaxPower2(140));
    }

}