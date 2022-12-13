package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreePathsSolutionTest extends TestCase {

    public void testBinaryTreePaths() {
        BinaryTreePathsSolution solution = new BinaryTreePathsSolution();

        assertThat(solution.binaryTreePaths(Utils.arrayToTreeNode(1, 2, 3, null, 5)))
                .containsExactlyInAnyOrder("1->2->5", "1->3");
        assertThat(solution.binaryTreePaths(Utils.arrayToTreeNode(1)))
                .containsExactlyInAnyOrder("1");
        assertThat(solution.binaryTreePaths(Utils.arrayToTreeNode(1, 2, 3, null, 5, 7, 1, 8, 1, 3, 9)))
                .containsExactlyInAnyOrder("1->2->5->8", "1->2->5->1", "1->3->7->3", "1->3->7->9", "1->3->1");
    }
}