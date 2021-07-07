package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class RemoveDuplicatesFromSortedListSolutionTest {

    @Test
    public void deleteDuplicates() {
        final RemoveDuplicatesFromSortedListSolution solution = new RemoveDuplicatesFromSortedListSolution();
        assertArrayEquals(arrayOf(1, 2), solution.deleteDuplicates(ListNode.fromArray(1, 2)).toArray());
        assertArrayEquals(arrayOf(1, 2), solution.deleteDuplicates(ListNode.fromArray(1, 1, 2)).toArray());
        assertArrayEquals(arrayOf(1, 2), solution.deleteDuplicates(ListNode.fromArray(1, 1, 2, 2, 2)).toArray());
        assertArrayEquals(arrayOf(1), solution.deleteDuplicates(ListNode.fromArray(1)).toArray());
        assertNull(solution.deleteDuplicates(null));
    }
}
