package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by xuthus on 19.05.2017.
 */
public class SortListSolutionTest {

    @Test
    public void testSortList() throws Exception {
        SortListSolution solution = new SortListSolution();

        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 6}, solution.sortList(ListNode.fromArray(2, 3, 1, 4, 6, 0)).toArray());
        assertNull(solution.sortList(null));
    }
}