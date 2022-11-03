package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreePostorderTraversalSolutionTest extends TestCase {

    public void testPostorderTraversal_Ex1() {
        BinaryTreePostorderTraversalSolution solution = new BinaryTreePostorderTraversalSolution();

        List<Integer> integers = solution.postorderTraversal_Recursive(Utils.arrayToTreeNode(1, null, 2, 3));

        assertThat(Utils.toIntArray(integers)).containsExactly(3, 2, 1);
    }

    public void testPostorderTraversal_Ex2() {
        BinaryTreePostorderTraversalSolution solution = new BinaryTreePostorderTraversalSolution();

        List<Integer> integers = solution.postorderTraversal_Recursive(Utils.arrayToTreeNode());

        assertThat(Utils.toIntArray(integers)).hasSize(0);
    }

    public void testPostorderTraversal_Ex3() {
        BinaryTreePostorderTraversalSolution solution = new BinaryTreePostorderTraversalSolution();

        List<Integer> integers = solution.postorderTraversal_Recursive(Utils.arrayToTreeNode(1));

        assertThat(Utils.toIntArray(integers)).containsExactly(1);
    }

    public void testIterative_Ex1() {
        BinaryTreePostorderTraversalSolution solution = new BinaryTreePostorderTraversalSolution();

        List<Integer> integers = solution.postorderTraversal_Iterative(Utils.arrayToTreeNode(1, null, 2, 3));

        assertThat(Utils.toIntArray(integers)).containsExactly(3, 2, 1);
    }

    public void testIterative_My1() {
        BinaryTreePostorderTraversalSolution solution = new BinaryTreePostorderTraversalSolution();

        List<Integer> integers = solution.postorderTraversal_Iterative(Utils.arrayToTreeNode(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        assertThat(Utils.toIntArray(integers)).containsExactly(8, 9, 4, 10, 5, 2, 6, 7, 3, 1);
    }
}