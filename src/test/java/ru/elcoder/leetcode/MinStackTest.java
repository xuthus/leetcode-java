package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 12.07.2017.
 */
public class MinStackTest {

    @Test
    public void testStack() throws Exception {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
        minStack.push(5);
        assertEquals(-2, minStack.getMin());
        minStack.push(-5);
        assertEquals(-5, minStack.getMin());
        minStack.push(-15);
        assertEquals(-15, minStack.getMin());
        minStack.pop();
        assertEquals(-5, minStack.getMin());
        minStack.pop();
        assertEquals(-2, minStack.getMin());
    }

}