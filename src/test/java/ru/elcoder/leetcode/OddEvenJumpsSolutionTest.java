package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class OddEvenJumpsSolutionTest {

    @Test
    public void oddEvenJumps() {
        final OddEvenJumpsSolution solution = new OddEvenJumpsSolution();
        assertEquals(2, solution.oddEvenJumps(arrayOf(10, 13, 12, 14, 15)));
        assertEquals(3, solution.oddEvenJumps(arrayOf(2, 3, 1, 1, 4)));
        assertEquals(3, solution.oddEvenJumps(arrayOf(5, 1, 3, 4, 2)));
        assertEquals(16245, solution.oddEvenJumps(createRandomArray()));
    }

    private int[] createRandomArray() {
        final int[] ints = new int[50000];
        final Random random = new Random(123L);
        for (int i = 0; i < 50000; i++) {
            ints[i] = random.nextInt(100000);
        }
        return ints;
    }
}