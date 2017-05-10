package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 05.05.2017.
 */
public class MergeTwoSortedListSolutionTest {

    @Test
    public void testMergeTwoLists() throws Exception {
        MergeTwoSortedListSolution solution = new MergeTwoSortedListSolution();

        ListNode list = solution.mergeTwoLists(ListNode.fromArray(1, 3, 4, 6), ListNode.fromArray(2, 5, 8));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 8}, list.toArray());

        list = solution.mergeTwoLists(ListNode.fromArray(1), ListNode.fromArray(-2, 2));
        assertArrayEquals(new int[]{-2, 1, 2}, list.toArray());

        list = solution.mergeTwoLists(null, ListNode.fromArray(-2, 2));
        assertArrayEquals(new int[]{-2, 2}, list.toArray());

        list = solution.mergeTwoLists(ListNode.fromArray(-2, 2), null);
        assertArrayEquals(new int[]{-2, 2}, list.toArray());

        list = solution.mergeTwoLists(null, null);
        assertEquals(null, list);
    }
}