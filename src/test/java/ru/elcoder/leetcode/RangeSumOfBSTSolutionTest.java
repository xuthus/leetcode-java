package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeSumOfBSTSolutionTest extends TestCase {

    public void testRangeSumBST() {
        RangeSumOfBSTSolution solution = new RangeSumOfBSTSolution();

        assertThat(solution.rangeSumBST(Utils.arrayToTreeNode(10, 5, 15, 3, 7, null, 18), 7, 15))
                .isEqualTo(32);
        assertThat(solution.rangeSumBST(Utils.arrayToTreeNode(10, 5, 15, 3, 7, 13, 18, 1, null, 6), 6, 10))
                .isEqualTo(23);
    }
}