package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.models.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class OddEvenLinkedListSolutionTest extends TestCase {

    public void testOddEvenList() {
        OddEvenLinkedListSolution solution = new OddEvenLinkedListSolution();

        ListNode listNode = solution.oddEvenList(ListNode.fromArray(1, 2, 3, 4, 5));
        assertThat(listNode.toArray()).containsExactly(1, 3, 5, 2, 4);

        listNode = solution.oddEvenList(ListNode.fromArray(1));
        assertThat(listNode.toArray()).containsExactly(1);

        listNode = solution.oddEvenList(ListNode.fromArray(2));
        assertThat(listNode.toArray()).containsExactly(2);

        listNode = solution.oddEvenList(ListNode.fromArray(2, 1, 7, 6));
        assertThat(listNode.toArray()).containsExactly(2, 7, 1, 6);

        listNode = solution.oddEvenList(ListNode.fromArray(2, 1, 3, 5, 6, 4, 7));
        assertThat(listNode.toArray()).containsExactly(2, 3, 6, 7, 1, 5, 4);
    }
}