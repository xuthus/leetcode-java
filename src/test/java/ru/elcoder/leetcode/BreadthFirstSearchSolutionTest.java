package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;

public class BreadthFirstSearchSolutionTest {

    @Test
    public void sumTree1() {
        final BreadthFirstSearchSolution solution = new BreadthFirstSearchSolution();
        assertEquals(3, solution.sumTree(new TreeNode(3)));
    }

    @Test
    public void sumTree2() {
        final BreadthFirstSearchSolution solution = new BreadthFirstSearchSolution();
        assertEquals(28, solution.sumTree(new TreeNode(3,
                new TreeNode(10),
                new TreeNode(15)
        )));
    }

    @Test
    public void sumTree3() {
        final BreadthFirstSearchSolution solution = new BreadthFirstSearchSolution();
        assertEquals(32, solution.sumTree(new TreeNode(3,
                new TreeNode(10),
                new TreeNode(15,
                        new TreeNode(4),
                        null
                )
        )));
    }
}
