package ru.elcoder.codesignal;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.*;

public class IsListPalindromeSolutionTest {

    @Test
    public void isListPalindrome() {
        final IsListPalindromeSolution solution = new IsListPalindromeSolution();
        assertTrue(solution.isListPalindrome(ListNode.fromArray(1, 2, 3, 2, 1)));
        assertTrue(solution.isListPalindrome(ListNode.fromArray(1, 2, 3, 3, 2, 1)));
        assertFalse(solution.isListPalindrome(ListNode.fromArray(1, 2, 3, 3, 4, 1)));
        assertFalse(solution.isListPalindrome(ListNode.fromArray(1, 2)));
        assertTrue(solution.isListPalindrome(ListNode.fromArray(1, 1)));
        assertTrue(solution.isListPalindrome(ListNode.fromArray(1)));
    }
}
