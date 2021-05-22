package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DesignLogStorageSystemSolutionTest {

    @Test
    public void test1() {
        DesignLogStorageSystemSolution solution = new DesignLogStorageSystemSolution();
        solution.put(1, "2017:01:01:23:59:59");
        solution.put(2, "2017:01:01:22:59:59");
        solution.put(3, "2016:01:01:00:00:00");
        List<Integer> list = solution.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour");
        assertEquals(2, list.size());
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
    }

    @Test
    public void test2() {
        DesignLogStorageSystemSolution solution = new DesignLogStorageSystemSolution();
        solution.put(1, "2017:01:01:23:59:59");
        solution.put(2, "2017:01:01:22:59:59");
        solution.put(3, "2016:01:01:00:00:00");
        List<Integer> list = solution.retrieve("2015:01:01:01:01:01", "2017:01:01:23:00:00", "Hour");
        assertEquals(3, list.size());
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
    }

    @Test
    public void test3() {
        DesignLogStorageSystemSolution solution = new DesignLogStorageSystemSolution();
        solution.put(1, "2017:01:01:23:59:59");
        solution.put(2, "2017:01:01:22:59:59");
        solution.put(3, "2016:01:01:00:00:00");
        List<Integer> list = solution.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year");
        assertEquals(3, list.size());
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
    }

}