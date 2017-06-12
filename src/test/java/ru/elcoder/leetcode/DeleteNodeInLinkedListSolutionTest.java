package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by xuthus on 12.06.2017.
 */
public class DeleteNodeInLinkedListSolutionTest {
    @Test
    public void deleteNode() throws Exception {
        DeleteNodeInLinkedListSolution solution = new DeleteNodeInLinkedListSolution();

        ListNode list = ListNode.fromArray(1, 2, 3, 4);
        ListNode node = list.next.next;
        solution.deleteNode(node);
        assertArrayEquals(new int[]{1, 2, 4}, list.toArray());

        list = ListNode.fromArray(1, 2, 3, 4);
        node = list;
        solution.deleteNode(node);
        assertArrayEquals(new int[]{2, 3, 4}, list.toArray());

        list = ListNode.fromArray(1, 2, 3, 4);
        node = list.next;
        solution.deleteNode(node);
        assertArrayEquals(new int[]{1, 3, 4}, list.toArray());
    }

}