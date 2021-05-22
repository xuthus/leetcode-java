package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoSumIVInputIsBSTSolutionTest {

    @Test
    public void findTarget() {
        TwoSumIVInputIsBSTSolution solution = new TwoSumIVInputIsBSTSolution();
        assertTrue(solution.findTarget(
                new TreeNode(10, new TreeNode(10), null),
                20
        ));
        assertFalse(solution.findTarget(
                new TreeNode(10, new TreeNode(10), null),
                12
        ));
        assertTrue(solution.findTarget(
                new TreeNode(10, new TreeNode(10), new TreeNode(2)),
                12
        ));
    }
}