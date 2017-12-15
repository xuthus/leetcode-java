package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.NestedInteger;
import ru.elcoder.leetcode.timer.Timer;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 01.07.2017.
 */
public class MiniParserSolutionTest {
    @Test
    public void deserialize() throws Exception {
        MiniParserSolution solution = new MiniParserSolution();

        NestedInteger integer = solution.deserialize("-345");
        assertTrue(integer.isInteger());
        assertEquals(-345, integer.getInteger().intValue());

        integer = solution.deserialize("[-1,-2]");
        assertFalse(integer.isInteger());
        assertEquals(2, integer.getList().size());
        assertEquals(-1, integer.getList().get(0).getInteger().intValue());
        assertEquals(-2, integer.getList().get(1).getInteger().intValue());

        integer = solution.deserialize("[123,[456,[789]]]");
        assertFalse(integer.isInteger());
        List<NestedInteger> list1 = integer.getList();
        assertEquals(2, list1.size());
        assertTrue(list1.get(0).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertFalse(list1.get(1).isInteger());
        List<NestedInteger> list2 = list1.get(1).getList();
        assertEquals(2, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertFalse(list2.get(1).isInteger());
        assertEquals(456, list2.get(0).getInteger().intValue());
        List<NestedInteger> list3 = list2.get(1).getList();
        assertEquals(1, list3.size());
        assertTrue(list3.get(0).isInteger());
        assertEquals(789, list3.get(0).getInteger().intValue());

        integer = solution.deserialize("[123,456]");
        assertFalse(integer.isInteger());
        assertEquals(2, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertTrue(list1.get(1).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(456, list1.get(1).getInteger().intValue());

        integer = solution.deserialize("[123,456,[789]]");
        assertFalse(integer.isInteger());
        assertEquals(3, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertTrue(list1.get(1).isInteger());
        assertFalse(list1.get(2).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(456, list1.get(1).getInteger().intValue());
        list2 = list1.get(2).getList();
        assertEquals(1, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertEquals(789, list2.get(0).getInteger().intValue());

        integer = solution.deserialize("[123,[-456],-789]");
        assertFalse(integer.isInteger());
        assertEquals(3, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertFalse(list1.get(1).isInteger());
        assertTrue(list1.get(2).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(-789, list1.get(2).getInteger().intValue());
        list2 = list1.get(1).getList();
        assertEquals(1, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertEquals(-456, list2.get(0).getInteger().intValue());

        integer = solution.deserialize(" [ 123 , [ -456 ] , -789 ] ");
        assertFalse(integer.isInteger());
        assertEquals(3, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertFalse(list1.get(1).isInteger());
        assertTrue(list1.get(2).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(-789, list1.get(2).getInteger().intValue());
        list2 = list1.get(1).getList();
        assertEquals(1, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertEquals(-456, list2.get(0).getInteger().intValue());

        try {
            solution.deserialize(" [ 123 , [ -456 ] , -789  ");
            fail();
        } catch (IndexOutOfBoundsException e) {
            // ok!
        }

    }

    @Test
    public void deserializeOptimized() throws Exception {
        MiniParserOptimizedSolution solution = new MiniParserOptimizedSolution();

        NestedInteger integer = solution.deserialize("-345");
        assertTrue(integer.isInteger());
        assertEquals(-345, integer.getInteger().intValue());

        integer = solution.deserialize("[-1,-2]");
        assertFalse(integer.isInteger());
        assertEquals(2, integer.getList().size());
        assertEquals(-1, integer.getList().get(0).getInteger().intValue());
        assertEquals(-2, integer.getList().get(1).getInteger().intValue());

        integer = solution.deserialize("[123,[456,[789]]]");
        assertFalse(integer.isInteger());
        List<NestedInteger> list1 = integer.getList();
        assertEquals(2, list1.size());
        assertTrue(list1.get(0).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertFalse(list1.get(1).isInteger());
        List<NestedInteger> list2 = list1.get(1).getList();
        assertEquals(2, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertFalse(list2.get(1).isInteger());
        assertEquals(456, list2.get(0).getInteger().intValue());
        List<NestedInteger> list3 = list2.get(1).getList();
        assertEquals(1, list3.size());
        assertTrue(list3.get(0).isInteger());
        assertEquals(789, list3.get(0).getInteger().intValue());

        integer = solution.deserialize("[123,456]");
        assertFalse(integer.isInteger());
        assertEquals(2, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertTrue(list1.get(1).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(456, list1.get(1).getInteger().intValue());

        integer = solution.deserialize("[123,456,[789]]");
        assertFalse(integer.isInteger());
        assertEquals(3, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertTrue(list1.get(1).isInteger());
        assertFalse(list1.get(2).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(456, list1.get(1).getInteger().intValue());
        list2 = list1.get(2).getList();
        assertEquals(1, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertEquals(789, list2.get(0).getInteger().intValue());

        integer = solution.deserialize("[123,[-456],-789]");
        assertFalse(integer.isInteger());
        assertEquals(3, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertFalse(list1.get(1).isInteger());
        assertTrue(list1.get(2).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(-789, list1.get(2).getInteger().intValue());
        list2 = list1.get(1).getList();
        assertEquals(1, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertEquals(-456, list2.get(0).getInteger().intValue());

        integer = solution.deserialize(" [ 123 , [ -456 ] , -789 ] ");
        assertFalse(integer.isInteger());
        assertEquals(3, integer.getList().size());
        list1 = integer.getList();
        assertTrue(list1.get(0).isInteger());
        assertFalse(list1.get(1).isInteger());
        assertTrue(list1.get(2).isInteger());
        assertEquals(123, list1.get(0).getInteger().intValue());
        assertEquals(-789, list1.get(2).getInteger().intValue());
        list2 = list1.get(1).getList();
        assertEquals(1, list2.size());
        assertTrue(list2.get(0).isInteger());
        assertEquals(-456, list2.get(0).getInteger().intValue());

        try {
            solution.deserialize(" [ 123 , [ -456 ] , -789  ");
            fail();
        } catch (IndexOutOfBoundsException e) {
            // ok!
        }

    }

    @Test
    public void deserializeLT() throws Exception {
        final int LOOPS = 1; //10000000;

        MiniParserSolution solution = new MiniParserSolution();
        MiniParserOptimizedSolution optimizedSolution = new MiniParserOptimizedSolution();

        Timer timer = new Timer();
        timer.start();
        timer.start();
        for (int i = 0; i < LOOPS; i++) {
            optimizedSolution.deserialize("[123,[-456],[-789, 125, 126, [127,128,129],130,131,[132,133],134],135,136,[777]]");
        }
//        System.out.println("optimized deserialize() duration, ms: " + timer.finish());

        timer.start();
        for (int i = 0; i < LOOPS; i++) {
            solution.deserialize("[123,[-456],[-789, 125, 126, [127,128,129],130,131,[132,133],134],135,136,[777]]");
        }
//        System.out.println("non-optimized deserialize() duration, ms: " + timer.finish());
//        System.out.println("total duration, ms: " + timer.finish());
    }

}