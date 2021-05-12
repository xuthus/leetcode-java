package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateBinarySearchTreeSolutionTest {

    @Test
    public void isValidBST() {
        final ValidateBinarySearchTreeSolution solution = new ValidateBinarySearchTreeSolution();
        assertTrue(solution.isValidBST(new TreeNode(1)));
        assertTrue(solution.isValidBST(new TreeNode(10, new TreeNode(9), null)));
        assertTrue(solution.isValidBST(new TreeNode(10, new TreeNode(9), new TreeNode(20))));
        assertFalse(solution.isValidBST(new TreeNode(10,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(8), new TreeNode(28))))
        );
    }
}
