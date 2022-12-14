package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeRightSideViewSolutionTest extends TestCase {

    public void testRightSideView() {
        BinaryTreeRightSideViewSolution solution = new BinaryTreeRightSideViewSolution();

        assertThat(solution.rightSideView(Utils.arrayToTreeNode(1, 2, 3, null, 5, null, 4)))
                .containsExactly(1, 3, 4);
        assertThat(solution.rightSideView(Utils.arrayToTreeNode(1, null, 3)))
                .containsExactly(1, 3);
        assertThat(solution.rightSideView(Utils.arrayToTreeNode(1, 2, 3, null, 5, null, 4, 6, 7, 8, 9, null, null, 10, 11, null, 12, null, null, 13)))
                .containsExactly(1, 3, 4, 9, 12, 13);
        assertThat(solution.rightSideView(null)).isEmpty();
    }
}