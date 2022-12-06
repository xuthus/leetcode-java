package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.models.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteTheMiddleNodeOfALinkedListSolutionTest extends TestCase {

    public void testDeleteMiddle() {
        DeleteTheMiddleNodeOfALinkedListSolution solution = new DeleteTheMiddleNodeOfALinkedListSolution();

        assertThat(solution.deleteMiddle(ListNode.fromArray(1, 2, 3)).toArray())
                .containsExactly(1, 3);
        assertThat(solution.deleteMiddle(ListNode.fromArray(1, 2, 3, 4)).toArray())
                .containsExactly(1, 2, 4);
        assertThat(solution.deleteMiddle(ListNode.fromArray(1, 2)).toArray())
                .containsExactly(1);
        assertThat(solution.deleteMiddle(ListNode.fromArray(1))).isNull();
    }
}