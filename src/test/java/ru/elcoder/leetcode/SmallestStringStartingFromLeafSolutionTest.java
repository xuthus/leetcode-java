package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestStringStartingFromLeafSolutionTest extends TestCase {

    public void testSmallestFromLeaf() {
        SmallestStringStartingFromLeafSolution solution = new SmallestStringStartingFromLeafSolution();

        assertThat(solution.smallestFromLeaf(Utils.arrayToTreeNode(0, 1, 2, 3, 4, 3, 4)))
                .isEqualTo("dba");
        assertThat(solution.smallestFromLeaf(Utils.arrayToTreeNode(25, 1, 3, 1, 3, 0, 2)))
                .isEqualTo("adz");
        assertThat(solution.smallestFromLeaf(Utils.arrayToTreeNode(2, 2, 1, null, 1, 0, null, 0)))
                .isEqualTo("abc");
    }
}