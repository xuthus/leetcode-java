package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by xuthus on 14.05.2017.
 */
public class MergeKSortedListsSolutionTest {

    @Test
    public void testMerge2Lists() throws Exception {
        MergeKSortedListsSolution solution = new MergeKSortedListsSolution();

        ListNode list = solution.mergeKLists(new ListNode[]{ListNode.fromArray(1, 3, 4, 6), ListNode.fromArray(2, 5, 8)});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 8}, list.toArray());
    }

    @Test
    public void testMergeKListsWithNulls() throws Exception {
        MergeKSortedListsSolution solution = new MergeKSortedListsSolution();

        ListNode[] lists = new ListNode[]{
                null,
                null,
                ListNode.fromArray(1, 3, 4, 6),
                ListNode.fromArray(2, 5, 8),
                null,
                ListNode.fromArray(1, 7, 9),
                ListNode.fromArray(-5, -3, 4),
                null
        };
        ListNode list = solution.mergeKLists(lists);
        assertArrayEquals(new int[]{-5, -3, 1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9}, list.toArray());
    }
}