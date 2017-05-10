package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 05.05.2017.
 */
public class RemoveLinkedListElementsSolutionTest {

    @Test
    public void testRemoveElements() throws Exception {
        RemoveLinkedListElementsSolution solution = new RemoveLinkedListElementsSolution();

        assertArrayEquals(new int[]{1, 2, 3}, solution.removeElements(ListNode.fromArray(1, 2, 4, 3), 4).toArray());
        assertArrayEquals(new int[]{1, 2, 3}, solution.removeElements(ListNode.fromArray(1, 2, 3, 4), 4).toArray());
        assertArrayEquals(new int[]{1, 2, 3}, solution.removeElements(ListNode.fromArray(4, 1, 2, 3, 4), 4).toArray());
        assertArrayEquals(new int[]{1, 2, 3}, solution.removeElements(ListNode.fromArray(4, 4, 4, 4, 1, 2, 3, 4), 4).toArray());
        assertArrayEquals(new int[]{1, 2, 3}, solution.removeElements(ListNode.fromArray(4, 4, 4, 4, 1, 2, 3, 4, 4, 4, 4, 4), 4).toArray());
        assertEquals(null, solution.removeElements(ListNode.fromArray(4, 4, 4, 4, 4, 4, 4, 4, 4), 4));
        assertEquals(null, solution.removeElements(ListNode.fromArray(4), 4));
    }
}