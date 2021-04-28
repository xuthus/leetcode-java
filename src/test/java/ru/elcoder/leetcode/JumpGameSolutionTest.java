package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class JumpGameSolutionTest {

    @Test
    public void canJump() {
        final JumpGameSolution solution = new JumpGameSolution();
        assertTrue(solution.canJump(arrayOf(2, 0)));
        assertTrue(solution.canJump(arrayOf(2, 3, 1, 1, 4)));
        assertFalse(solution.canJump(arrayOf(3, 2, 1, 0, 4)));
    }

    @Test
    public void canJump2() {
        final JumpGameSolution solution = new JumpGameSolution();
        assertFalse(solution.canJump(arrayOf(2, 0, 6, 9, 8, 4, 5, 0, 8, 9, 1, 2, 9, 6, 8, 8, 0, 6, 3, 1, 2, 2, 1,
                2, 6, 5, 3, 1, 2, 2, 6, 4, 2, 4, 3, 0, 0, 0, 3, 8, 2, 4, 0, 1, 2, 0, 1, 4, 6, 5, 8, 0, 7, 9, 3, 4, 6, 6,
                5, 8, 9, 3, 4, 3, 7, 0, 4, 9, 0, 9, 8, 4, 3, 0, 7, 7, 1, 9, 1, 9, 4, 9, 0, 1, 9, 5, 7, 7, 1, 5, 8, 2, 8,
                2, 6, 8, 2, 2, 7, 5, 1, 7, 9, 6)));
    }

    @Test
    public void canJump3() {
        final JumpGameSolution solution = new JumpGameSolution();
        int[] ints = new int[25003];
        for (int i = 25000; i > 0; i--)
            ints[25000 - i] = i;
        assertFalse(solution.canJump(ints));
    }
}
