package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MinimumFallingPathSumSolutionTest extends TestCase {

    public void testMinFallingPathSum() {
        MinimumFallingPathSumSolution solution = new MinimumFallingPathSumSolution();

        assertThat(solution.minFallingPathSum(new int[][] {
                arrayOf(2,1,3),
                arrayOf(6,5,4),
                arrayOf(7,8,9)
        })).isEqualTo(13);
        assertThat(solution.minFallingPathSum(new int[][] {
                arrayOf(-19,57),
                arrayOf(-40,-5)
        })).isEqualTo(-59);
        assertThat(solution.minFallingPathSum(new int[][] {
                arrayOf(2,1,3,0),
                arrayOf(6,5,4,9),
                arrayOf(7,8,9,1),
                arrayOf(1,2,3,4)
        })).isEqualTo(8);
    }
}