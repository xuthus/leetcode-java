package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FindPivotIndexSolutionTest extends TestCase {

    public void testPivotIndex() {
        FindPivotIndexSolution solution = new FindPivotIndexSolution();

        assertThat(solution.pivotIndex(arrayOf(1, 7, 3, 6, 5, 6))).isEqualTo(3);
        assertThat(solution.pivotIndex(arrayOf(1, 2, 3))).isEqualTo(-1);
        assertThat(solution.pivotIndex(arrayOf(2, 1, -1))).isEqualTo(0);
    }

}
