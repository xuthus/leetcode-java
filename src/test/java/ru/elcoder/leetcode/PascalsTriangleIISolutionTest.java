package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.utils.Utils;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class PascalsTriangleIISolutionTest {

    @Test
    public void getRow3() {
        PascalsTriangleIISolution solution = new PascalsTriangleIISolution();
        assertArrayEquals(
                arrayOf(1, 3, 3, 1),
                Utils.toIntArray(solution.getRow(3))
        );
    }

    @Test
    public void getRow4() {
        PascalsTriangleIISolution solution = new PascalsTriangleIISolution();
        assertArrayEquals(
                arrayOf(1, 4, 6, 4, 1),
                Utils.toIntArray(solution.getRow(4))
        );
    }
}