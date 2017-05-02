package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 01.05.2017.
 */
public class PalindromLinkedListSolutionTestV2 {

    @Test
    public void testIsPalindrome() throws Exception {
        PalindromLinkedListSolutionV2 solution = new PalindromLinkedListSolutionV2();

        assertFalse(solution.isPalindrome(newLinkedList(1, 2, 3, 4)));
        assertTrue(solution.isPalindrome(newLinkedList(1, 2, 1)));
        assertTrue(solution.isPalindrome(newLinkedList(1, 2, 1, 2, 1)));
        assertTrue(solution.isPalindrome(newLinkedList(1)));
        assertTrue(solution.isPalindrome(null));
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