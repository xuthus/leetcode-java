package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.FlattenNestedListIteratorSolution.NestedIterator;
import ru.elcoder.leetcode.models.NestedInteger;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlattenNestedListIteratorSolutionTest {

    @Test
    public void iterateEmpty2() {
        final NestedInteger emptyNestedInteger = new NestedInteger();
        final NestedInteger nestedInteger = new NestedInteger();
        nestedInteger.getList().add(new NestedInteger(3));
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                emptyNestedInteger,
                nestedInteger
        ));
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iterateEmpty3() {
        final NestedInteger emptyNestedInteger = new NestedInteger();
        final NestedInteger nestedInteger = new NestedInteger();
        nestedInteger.getList().add(new NestedInteger(3));
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                emptyNestedInteger,
                nestedInteger,
                emptyNestedInteger
        ));
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iterateEmpty() {
        final NestedInteger emptyNestedInteger = new NestedInteger();
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                emptyNestedInteger,
                emptyNestedInteger
        ));
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iterate1() {
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                new NestedInteger(1),
                new NestedInteger(2),
                new NestedInteger(3)
        ));
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iterate2() {
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                new NestedInteger(1)
        ));
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iterate3() {
        final NestedInteger nestedInteger = new NestedInteger();
        nestedInteger.getList().addAll(Arrays.asList(
                new NestedInteger(3),
                new NestedInteger(5)
        ));
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                new NestedInteger(1),
                nestedInteger
        ));
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iterate4() {
        final NestedInteger nestedInteger = new NestedInteger();
        nestedInteger.getList().addAll(Arrays.asList(
                new NestedInteger(3),
                new NestedInteger(5)
        ));
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                new NestedInteger(1),
                nestedInteger,
                new NestedInteger(7),
                nestedInteger
        ));
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(7), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iterate5() {
        final NestedInteger nestedInteger = new NestedInteger();
        nestedInteger.getList().addAll(Arrays.asList(
                new NestedInteger(3),
                new NestedInteger(5)
        ));
        final NestedInteger nestedInteger2 = new NestedInteger();
        nestedInteger2.getList().addAll(Arrays.asList(
                new NestedInteger(3),
                new NestedInteger(5),
                nestedInteger
        ));
        final NestedIterator iterator = new NestedIterator(Arrays.asList(
                new NestedInteger(1),
                nestedInteger2,
                new NestedInteger(7),
                nestedInteger
        ));
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(7), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertFalse(iterator.hasNext());
    }

}