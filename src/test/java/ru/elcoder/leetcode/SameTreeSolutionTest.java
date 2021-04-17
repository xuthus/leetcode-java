package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameTreeSolutionTest {

    @Test
    public void isSameTree1() {
        final SameTreeSolution solution = new SameTreeSolution();
        assertFalse(solution.isSameTree(
                new TreeNode(7),
                new TreeNode(8)
        ));
    }

    @Test
    public void isSameTree2() {
        final SameTreeSolution solution = new SameTreeSolution();
        assertFalse(solution.isSameTree(
                new TreeNode(7),
                new TreeNode(8)
        ));
    }

    @Test
    public void isSameTree3() {
        final SameTreeSolution solution = new SameTreeSolution();
        assertFalse(solution.isSameTree(
                new TreeNode(7, new TreeNode(3), new TreeNode(10)),
                new TreeNode(7)
        ));
    }

    @Test
    public void isSameTree4() {
        final SameTreeSolution solution = new SameTreeSolution();
        assertFalse(solution.isSameTree(
                new TreeNode(7, new TreeNode(3), new TreeNode(10)),
                new TreeNode(7, new TreeNode(4), null)
        ));
    }

    @Test
    public void isSameTree5() {
        final SameTreeSolution solution = new SameTreeSolution();
        assertTrue(solution.isSameTree(
                new TreeNode(7, new TreeNode(3), new TreeNode(10)),
                new TreeNode(7, new TreeNode(3), new TreeNode(10))
        ));
    }

    @Test
    public void isSameTree6() {
        final SameTreeSolution solution = new SameTreeSolution();
        assertTrue(solution.isSameTree(
                new TreeNode(7, new TreeNode(3), new TreeNode(10, null, new TreeNode(20))),
                new TreeNode(7, new TreeNode(3), new TreeNode(10, null, new TreeNode(20)))
        ));
    }

    @Test
    public void isSameTree7() {
        final SameTreeSolution solution = new SameTreeSolution();
        assertFalse(solution.isSameTree(
                new TreeNode(7, new TreeNode(3), new TreeNode(10, null, new TreeNode(21))),
                new TreeNode(7, new TreeNode(3), new TreeNode(10, null, new TreeNode(20)))
        ));
    }
}