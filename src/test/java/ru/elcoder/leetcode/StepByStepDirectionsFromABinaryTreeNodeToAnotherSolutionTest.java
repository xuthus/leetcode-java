package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

public class StepByStepDirectionsFromABinaryTreeNodeToAnotherSolutionTest extends TestCase {

    public void testGetDirections() {
        StepByStepDirectionsFromABinaryTreeNodeToAnotherSolution solution = new StepByStepDirectionsFromABinaryTreeNodeToAnotherSolution();

        assertThat(solution.getDirections(Utils.arrayToTreeNode(5,1,2,3,null,6,4), 3, 6))
                .isEqualTo("UURL");
        assertThat(solution.getDirections(Utils.arrayToTreeNode(2,1), 2, 1))
                .isEqualTo("L");
        assertThat(solution.getDirections(Utils.arrayToTreeNode(2,1), 1, 2))
                .isEqualTo("U");
        assertThat(solution.getDirections(Utils.arrayToTreeNode(5,1,2,3,null,6,4,7,8), 7, 6))
                .isEqualTo("UUURL");
        assertThat(solution.getDirections(Utils.arrayToTreeNode(5,8,3,1,null,4,7,6,null,null,null,null,null,null,2), 4, 3))
                .isEqualTo("U");
    }
}