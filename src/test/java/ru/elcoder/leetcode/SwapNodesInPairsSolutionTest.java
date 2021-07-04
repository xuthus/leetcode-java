package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SwapNodesInPairsSolutionTest {

    @Test
    public void swapPairs() {
        SwapNodesInPairsSolution solution = new SwapNodesInPairsSolution();
        assertArrayEquals(
                arrayOf(1, 2, 3, 4, 5, 6, 7),
                solution.swapPairs(ListNode.fromArray(2, 1, 4, 3, 6, 5, 7)).toArray()
        );
        assertArrayEquals(
                arrayOf(1, 2, 3),
                solution.swapPairs(ListNode.fromArray(2, 1, 3)).toArray()
        );
        assertArrayEquals(
                arrayOf(1, 2),
                solution.swapPairs(ListNode.fromArray(2, 1)).toArray()
        );
        assertArrayEquals(
                arrayOf(1),
                solution.swapPairs(ListNode.fromArray(1)).toArray()
        );
        assertNull(
                solution.swapPairs(null)
        );
    }
}