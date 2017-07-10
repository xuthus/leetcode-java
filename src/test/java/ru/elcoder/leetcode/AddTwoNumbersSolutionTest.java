package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.tools.Utils.array;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 10.07.2017.
 */
public class AddTwoNumbersSolutionTest {

    @Test
    public void testAddTwoNumbers() throws Exception {
        AddTwoNumbersSolution solution = new AddTwoNumbersSolution();

        assertArrayEquals(array(2, 2, 3), solution.addTwoNumbers(ListNode.fromArray(1, 1, 1), ListNode.fromArray(1, 1, 2)).toArray());
        assertArrayEquals(array(7, 0, 8), solution.addTwoNumbers(ListNode.fromArray(2, 4, 3), ListNode.fromArray(5, 6, 4)).toArray());
        assertArrayEquals(array(8, 9, 9, 1), solution.addTwoNumbers(ListNode.fromArray(9, 9, 9), ListNode.fromArray(9, 9, 9)).toArray());
        assertArrayEquals(array(8, 1), solution.addTwoNumbers(ListNode.fromArray(9), ListNode.fromArray(9)).toArray());
        assertArrayEquals(array(8, 1), solution.addTwoNumbers(ListNode.fromArray(2, 1), ListNode.fromArray(6)).toArray());
        assertArrayEquals(array(1, 0, 0, 2), solution.addTwoNumbers(ListNode.fromArray(5, 9, 9, 1), ListNode.fromArray(6)).toArray());
        assertArrayEquals(array(1, 0, 0, 2), solution.addTwoNumbers(ListNode.fromArray(6), ListNode.fromArray(5, 9, 9, 1)).toArray());
        assertArrayEquals(array(0), solution.addTwoNumbers(ListNode.fromArray(0), ListNode.fromArray(0)).toArray());
        assertArrayEquals(array(0, 1), solution.addTwoNumbers(ListNode.fromArray(0, 1), ListNode.fromArray(0)).toArray());
        assertArrayEquals(array(0, 0, 1), solution.addTwoNumbers(ListNode.fromArray(9, 4), ListNode.fromArray(1, 5)).toArray());
        assertArrayEquals(array(0, 0, 1), solution.addTwoNumbers(ListNode.fromArray(0, 0, 1), null).toArray());
        assertArrayEquals(array(0, 0, 1), solution.addTwoNumbers(null, ListNode.fromArray(0, 0, 1)).toArray());
    }
}