package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MinimumPathSumSolutionTest extends TestCase {

    public void testMinPathSum() {
        MinimumPathSumSolution solution = new MinimumPathSumSolution();

        assertThat(solution.minPathSum(new int[][]{
                arrayOf(1, 3, 1),
                arrayOf(1, 5, 1),
                arrayOf(4, 2, 1)
        })).isEqualTo(7);
        assertThat(solution.minPathSum(new int[][]{
                arrayOf(1, 2, 3),
                arrayOf(4, 5, 6)
        })).isEqualTo(12);
        assertThat(solution.minPathSum(new int[][]{
                arrayOf(1, 2, 3)
        })).isEqualTo(6);
        assertThat(solution.minPathSum(new int[][]{
                arrayOf(1), arrayOf(2), arrayOf(3)
        })).isEqualTo(6);
    }
}