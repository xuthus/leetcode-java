package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.utils.Utils;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SpiralMatrixSolutionTest {

    @Test
    public void spiralOrder() {
        final SpiralMatrixSolution solution = new SpiralMatrixSolution();
        assertArrayEquals(arrayOf(1, 2, 3, 6, 9, 8, 7, 4, 5), Utils.toIntArray(solution.spiralOrder(new int[][]{
                arrayOf(1, 2, 3),
                arrayOf(4, 5, 6),
                arrayOf(7, 8, 9)
        })));
    }
}