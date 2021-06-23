package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ReverseLinkedListIISolutionTest {

    @Test
    public void reverseBetween() {
        ReverseLinkedListIISolution solution = new ReverseLinkedListIISolution();
        assertArrayEquals(arrayOf(1, 4, 3, 2, 5), solution.reverseBetween(ListNode.fromArray(1, 2, 3, 4, 5), 1, 3).toArray());
        assertArrayEquals(arrayOf(4, 3, 2, 1, 5), solution.reverseBetween(ListNode.fromArray(1, 2, 3, 4, 5), 0, 3).toArray());
        assertArrayEquals(arrayOf(1, 5, 4, 3, 2), solution.reverseBetween(ListNode.fromArray(1, 2, 3, 4, 5), 1, 4).toArray());
        assertArrayEquals(arrayOf(1, 5), solution.reverseBetween(ListNode.fromArray(1, 5), 1, 1).toArray());
        assertArrayEquals(arrayOf(1, 5), solution.reverseBetween(ListNode.fromArray(5, 1), 0, 1).toArray());
    }

    @Test
    public void join() {
        ReverseLinkedListIISolution solution = new ReverseLinkedListIISolution();
        assertArrayEquals(arrayOf(1, 2, 3, 4), solution.join(
                ListNode.fromArray(1, 2),
                ListNode.fromArray(3, 4)
        ).toArray());
        assertArrayEquals(arrayOf(3, 4), solution.join(
                null,
                ListNode.fromArray(3, 4)
        ).toArray());
        assertArrayEquals(arrayOf(3, 4), solution.join(
                ListNode.fromArray(3, 4),
                null
        ).toArray());
    }

    @Test
    public void reverse() {
        ReverseLinkedListIISolution solution = new ReverseLinkedListIISolution();
        assertArrayEquals(arrayOf(2, 1), solution.reverse(
                ListNode.fromArray(1, 2)
        ).toArray());
        assertArrayEquals(arrayOf(3, 2, 1), solution.reverse(
                ListNode.fromArray(1, 2, 3)
        ).toArray());
        assertArrayEquals(arrayOf(1), solution.reverse(
                ListNode.fromArray(1)
        ).toArray());
    }
}