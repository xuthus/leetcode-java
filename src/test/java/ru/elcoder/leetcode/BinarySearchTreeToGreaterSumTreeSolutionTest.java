package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.models.TreeNode;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTreeToGreaterSumTreeSolutionTest extends TestCase {

    public void testBstToGst() {
        BinarySearchTreeToGreaterSumTreeSolution solution = new BinarySearchTreeToGreaterSumTreeSolution();

        // ex. 1
        TreeNode node = solution.bstToGst(Utils.arrayToTreeNode(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8));

        assertThat(node.equals(Utils.arrayToTreeNode(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8))).isTrue();

        // ex. 2
        node = solution.bstToGst(Utils.arrayToTreeNode(0, null, 1));

        assertThat(node.equals(Utils.arrayToTreeNode(1, null, 1))).isTrue();
    }
}