package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLeavesOfBinaryTreeSolutionTest extends TestCase {

    public void testFindLeaves() {
        FindLeavesOfBinaryTreeSolution solution = new FindLeavesOfBinaryTreeSolution();

        List<List<Integer>> leaves = solution.findLeaves(Utils.arrayToTreeNode(1, 2, 3, 4, 5));

        assertThat(leaves).hasSize(3);
        assertThat(leaves.get(0)).containsExactlyInAnyOrder(4, 5, 3);
        assertThat(leaves.get(1)).containsExactlyInAnyOrder(2);
        assertThat(leaves.get(2)).containsExactlyInAnyOrder(1);

        leaves = solution.findLeaves(Utils.arrayToTreeNode(1));

        assertThat(leaves).hasSize(1);
        assertThat(leaves.get(0)).containsExactlyInAnyOrder(1);
    }
}