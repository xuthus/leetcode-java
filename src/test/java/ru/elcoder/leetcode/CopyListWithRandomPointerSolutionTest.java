package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.RandomListNode;

import static org.junit.Assert.*;

public class CopyListWithRandomPointerSolutionTest {

    @Test
    public void copyRandomList() throws Exception {
        CopyListWithRandomPointerSolution solution = new CopyListWithRandomPointerSolution();

        int[][] randomListArray = new int[][]{
                {10, 1},  // second value is "random" index
                {20, 0},
                {30, 0}
        };
        RandomListNode list = RandomListNode.fromArray(randomListArray);
        RandomListNode copy = solution.copyRandomListOptimized(list);
        assertFalse(copy == list);
        int[][] copyArray = RandomListNode.toArray(copy);
        assertArrayEquals(randomListArray, copyArray);

        randomListArray = new int[][]{
                {10, 1},  // second value is "random" index
                {20, -1},
                {30, 0}
        };
        list = RandomListNode.fromArray(randomListArray);
        copy = solution.copyRandomListOptimized(list);
        assertFalse(copy == list);
        copyArray = RandomListNode.toArray(copy);
        assertArrayEquals(randomListArray, copyArray);

        randomListArray = new int[][]{
                {10, -1}  // second value is "random" index
        };
        list = RandomListNode.fromArray(randomListArray);
        copy = solution.copyRandomListOptimized(list);
        assertFalse(copy == list);
        copyArray = RandomListNode.toArray(copy);
        assertArrayEquals(randomListArray, copyArray);
    }

    @Test
    public void testListToArray() {
        int[][] randomListArray = new int[][]{
                {10, 1},  // second value is "random" index
                {20, 0},
                {30, 0}
        };
        RandomListNode list = RandomListNode.fromArray(randomListArray);

        assertEquals(10, list.label);
        assertEquals(20, list.random.label);
        list = list.next;
        assertEquals(20, list.label);
        assertEquals(10, list.random.label);
        list = list.next;
        assertEquals(30, list.label);
        assertEquals(10, list.random.label);
        assertNull(list.next);
    }

}