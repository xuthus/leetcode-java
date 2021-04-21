package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.*;

public class SubtreeOfAnotherTreeSolutionTest {

    @Test
    public void isSubtree() {
        final SubtreeOfAnotherTreeSolution solution = new SubtreeOfAnotherTreeSolution();
        assertTrue(solution.isSubtree(
                new TreeNode(5, new TreeNode(8), new TreeNode(9)),
                new TreeNode(5, new TreeNode(8), new TreeNode(9))
        ));
        assertTrue(solution.isSubtree(
                new TreeNode(5, new TreeNode(8), new TreeNode(9)),
                new TreeNode(8)
        ));
        assertTrue(solution.isSubtree(
                new TreeNode(5, new TreeNode(8, new TreeNode(4), new TreeNode(5)), new TreeNode(9)),
                new TreeNode(8, new TreeNode(4), new TreeNode(5))
        ));
        assertTrue(solution.isSubtree(
                new TreeNode(5, new TreeNode(8, null, new TreeNode(5)), new TreeNode(9)),
                new TreeNode(8, null, new TreeNode(5))
        ));
        assertTrue(solution.isSubtree(
                new TreeNode(5, null, new TreeNode(8, null, new TreeNode(5))),
                new TreeNode(8, null, new TreeNode(5))
        ));
    }

    @Test
    public void isIdentical() {
        final SubtreeOfAnotherTreeSolution solution = new SubtreeOfAnotherTreeSolution();
        assertTrue(solution.isIdentical(
                new TreeNode(5),
                new TreeNode(5)
        ));
        assertTrue(solution.isIdentical(
                new TreeNode(5, new TreeNode(8), null),
                new TreeNode(5, new TreeNode(8), null)
        ));
        assertFalse(solution.isIdentical(
                new TreeNode(5, new TreeNode(8), new TreeNode(9)),
                new TreeNode(5, new TreeNode(8), new TreeNode(10))
        ));
    }
}