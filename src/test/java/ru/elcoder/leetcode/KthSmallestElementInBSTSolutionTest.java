package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.*;

public class KthSmallestElementInBSTSolutionTest {

    @Test
    public void kthSmallest() {
        final KthSmallestElementInBSTSolution solution = new KthSmallestElementInBSTSolution();
        assertEquals(10, solution.kthSmallest(new TreeNode(10), 1));
        assertEquals(12, solution.kthSmallest(new TreeNode(10, null, new TreeNode(12)), 2));
    }
}