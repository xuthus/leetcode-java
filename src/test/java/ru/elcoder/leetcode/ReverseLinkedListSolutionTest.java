package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 01.05.2017.
 */
public class ReverseLinkedListSolutionTest {

    @Test
    public void testReverseList() throws Exception {
        ReverseLinkedListSolution solution = new ReverseLinkedListSolution();

        assertArrayEquals(new int[]{1, 2, 3, 4}, solution.reverseList(ListNode.fromArray(4, 3, 2, 1)).toArray());
        assertArrayEquals(new int[]{1}, solution.reverseList(ListNode.fromArray(1)).toArray());
        assertEquals(null, solution.reverseList(null));
    }


}