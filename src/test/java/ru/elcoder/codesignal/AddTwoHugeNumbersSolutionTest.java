package ru.elcoder.codesignal;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.*;

public class AddTwoHugeNumbersSolutionTest {

    @Test
    public void addTwoHugeNumbers() {
        ListNode a = ListNode.fromArray(1, 2, 3);
        ListNode b = ListNode.fromArray(1, 2, 3);
        final AddTwoHugeNumbersSolution solution = new AddTwoHugeNumbersSolution();
        ListNode res = solution.addTwoHugeNumbers(a, b);
        assertArrayEquals(new int[]{2, 4, 6}, res.toArray());

        a = ListNode.fromArray(1, 2, 5);
        b = ListNode.fromArray(1, 2, 6);
        res = solution.addTwoHugeNumbers(a, b);
        assertArrayEquals(new int[]{2, 5, 1}, res.toArray());

        a = ListNode.fromArray(5, 2, 5);
        b = ListNode.fromArray(7, 2, 6);
        res = solution.addTwoHugeNumbers(a, b);
        assertArrayEquals(new int[]{1, 2, 5, 1}, res.toArray());
    }
}
