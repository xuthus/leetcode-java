package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.models.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleOfTheLinkedListSolutionTest extends TestCase {

    public void testMiddleNode() {
        MiddleOfTheLinkedListSolution solution = new MiddleOfTheLinkedListSolution();

        assertThat(solution.middleNode(ListNode.fromArray(1, 2, 3, 4, 5)).toArray())
                .containsExactly(3, 4, 5);
        assertThat(solution.middleNode(ListNode.fromArray(1, 2, 3, 4, 5, 6)).toArray())
                .containsExactly(4, 5, 6);
        assertThat(solution.middleNode(ListNode.fromArray(1, 2)).toArray())
                .containsExactly(2);
        assertThat(solution.middleNode(ListNode.fromArray(1)).toArray())
                .containsExactly(1);
    }
}