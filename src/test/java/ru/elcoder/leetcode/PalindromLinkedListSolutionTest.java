package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 01.05.2017.
 */
public class PalindromLinkedListSolutionTest {

    @Test
    public void testIsPalindrome() throws Exception {
        PalindromLinkedListSolution solution = new PalindromLinkedListSolution();

        assertTrue(solution.isPalindrome(newLinkedList(1, 2, 1)));
        assertTrue(solution.isPalindrome(newLinkedList(1, 2, 1, 2, 1)));
        assertTrue(solution.isPalindrome(newLinkedList(1)));
        assertTrue(solution.isPalindrome(newLinkedList(1)));
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