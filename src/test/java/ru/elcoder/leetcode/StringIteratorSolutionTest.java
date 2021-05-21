package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.StringIteratorSolution.StringIterator;

import static org.junit.Assert.*;

public class StringIteratorSolutionTest {

    @Test
    public void test1() {
        StringIterator iterator = new StringIterator("a1b3c1");
        assertTrue(iterator.hasNext());
        assertEquals('a', iterator.next());
        assertEquals('b', iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals('b', iterator.next());
        assertEquals('b', iterator.next());
        assertEquals('c', iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test2() {
        StringIterator iterator = new StringIterator("a10b3c1");
        assertTrue(iterator.hasNext());
        assertEquals('a', iterator.next());
        assertEquals('a', iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals('a', iterator.next());
        assertEquals('a', iterator.next());
        assertEquals('a', iterator.next());
        assertTrue(iterator.hasNext());
    }

}