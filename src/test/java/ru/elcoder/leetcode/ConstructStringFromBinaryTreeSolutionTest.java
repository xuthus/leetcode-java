package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class ConstructStringFromBinaryTreeSolutionTest extends TestCase {

    public void testTree2str() {
        ConstructStringFromBinaryTreeSolution solution = new ConstructStringFromBinaryTreeSolution();

        assertThat(solution.tree2str(Utils.arrayToTreeNode(1, 2, 3, 4))).isEqualTo("1(2(4))(3)");
        assertThat(solution.tree2str(Utils.arrayToTreeNode(1, 2, 3, null, 4))).isEqualTo("1(2()(4))(3)");
        assertThat(solution.tree2str(Utils.arrayToTreeNode(1, 2, 3, null, 4, null, null, 5, 6, null, 7, null, 8, 9))).isEqualTo("1(2()(4(5()(7(9)))(6()(8))))(3)");
    }
}