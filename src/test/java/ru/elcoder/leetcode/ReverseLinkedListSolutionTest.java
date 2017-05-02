package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 01.05.2017.
 */
public class ReverseLinkedListSolutionTest {

    @Test
    public void testReverseList() throws Exception {
        ReverseLinkedListSolution solution = new ReverseLinkedListSolution();

        assertArrayEquals(new int[]{1, 2, 3, 4}, listToArray(solution.reverseList(newLinkedList(4, 3, 2, 1))));
        assertArrayEquals(new int[]{1}, listToArray(solution.reverseList(newLinkedList(1))));
        assertEquals(null, solution.reverseList(null));
    }

    private int[] listToArray(ListNode listNode) {
        int length = 0;
        ListNode node = listNode;
        while (node != null) {
            length++;
            node = node.next;
        }
        int[] ints = new int[length];
        length = 0;
        node = listNode;
        while (node != null) {
            ints[length++] = node.val;
            node = node.next;
        }
        return ints;
    }

    private ListNode newLinkedList(int... items) {
        ListNode head = null;
        ListNode parent = null;
        for (int item : items) {
            ListNode node = new ListNode(item);
            if (parent == null)
                parent = head = node;
            else {
                parent.next = node;
                parent = node;
            }
        }
        return head;
    }
}