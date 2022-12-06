package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class FindModeInBinarySearchTreeSolutionTest extends TestCase {

    public void testFindMode() {
        FindModeInBinarySearchTreeSolution solution = new FindModeInBinarySearchTreeSolution();

        int[] actual = solution.findMode(Utils.arrayToTreeNode(1, null, 2, 2));

        assertThat(actual).containsExactlyInAnyOrder(2);

        actual = solution.findMode(Utils.arrayToTreeNode(0));

        assertThat(actual).containsExactlyInAnyOrder(0);

        actual = solution.findMode(Utils.arrayToTreeNode(1, 2, 3));

        assertThat(actual).containsExactlyInAnyOrder(1, 2, 3);

        actual = solution.findMode(Utils.arrayToTreeNode(1, 2, 3, 1, 4, 2));

        assertThat(actual).containsExactlyInAnyOrder(1, 2);
    }
}