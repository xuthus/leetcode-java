package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class InsertionSortListSolutionTest {

    @Test
    public void insertionSortList1() {
        final InsertionSortListSolution solution = new InsertionSortListSolution();
        assertArrayEquals(arrayOf(1, 2, 3, 4), solution.insertionSortList(ListNode.fromArray(4, 2, 1, 3)).toArray());
    }

    @Test
    public void insertionSortList2() {
        final InsertionSortListSolution solution = new InsertionSortListSolution();
        assertArrayEquals(arrayOf(-1, 0, 3, 4, 5), solution.insertionSortList(ListNode.fromArray(-1, 5, 3, 4, 0)).toArray());
    }

    @Test
    public void insertionSortList3() {
        final InsertionSortListSolution solution = new InsertionSortListSolution();
        assertArrayEquals(arrayOf(1), solution.insertionSortList(ListNode.fromArray(1)).toArray());
        assertArrayEquals(arrayOf(1, 2), solution.insertionSortList(ListNode.fromArray(1, 2)).toArray());
        assertArrayEquals(arrayOf(1, 2), solution.insertionSortList(ListNode.fromArray(2, 1)).toArray());
        assertNull(solution.insertionSortList(null));
    }
}
