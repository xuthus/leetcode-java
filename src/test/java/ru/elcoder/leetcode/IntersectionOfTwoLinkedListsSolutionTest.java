package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.*;

public class IntersectionOfTwoLinkedListsSolutionTest {

    @Test
    public void getIntersectionNodeNoIntersection() {
        final IntersectionOfTwoLinkedListsSolution solution = new IntersectionOfTwoLinkedListsSolution();
        assertNull(solution.getIntersectionNode(ListNode.fromArray(1, 2, 3, 4), ListNode.fromArray(1, 3, 4, 5, 6)));
    }

    @Test
    public void getIntersectionNode1() {
        final IntersectionOfTwoLinkedListsSolution solution = new IntersectionOfTwoLinkedListsSolution();
        final ListNode headA = ListNode.fromArray(1, 2, 3, 4);
        final ListNode headB = ListNode.fromArray(1, 3, 4, 5, 6);
        final ListNode headTail = ListNode.fromArray(7, 8, 9);
        headA.append(headTail);
        headB.append(headTail);
        assertEquals(headTail, solution.getIntersectionNode(headA, headB));
    }

    @Test
    public void getIntersectionNode2() {
        final IntersectionOfTwoLinkedListsSolution solution = new IntersectionOfTwoLinkedListsSolution();
        final ListNode headTail = ListNode.fromArray(7, 8, 9);
        assertEquals(headTail, solution.getIntersectionNode(headTail, headTail));
    }

    @Test
    public void getIntersectionNode3() {
        final IntersectionOfTwoLinkedListsSolution solution = new IntersectionOfTwoLinkedListsSolution();
        final ListNode headA = ListNode.fromArray(1, 2, 3, 4);
        final ListNode headB = ListNode.fromArray(1, 3, 4, 5, 6, 7, 8);
        final ListNode headTail = ListNode.fromArray(7);
        headA.append(headTail);
        headB.append(headTail);
        assertEquals(headTail, solution.getIntersectionNode(headA, headB));
    }
}