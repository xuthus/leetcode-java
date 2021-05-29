package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.TimeBasedKeyValueStoreSolution.*;

public class TimeBasedKeyValueStoreSolutionTest {

    @Test
    public void timeMap1() {
        TimeMap map = new TimeMap();
        map.set("foo", "bar", 1);
        assertEquals("", map.get("foo", 0));
        assertEquals("", map.get("foo2", 0));
        assertEquals("", map.get("foo2", 1));
        assertEquals("bar", map.get("foo", 1));
        assertEquals("bar", map.get("foo", 2));
        map.set("foo", "bar2", 3);
        assertEquals("bar", map.get("foo", 2));
        assertEquals("bar2", map.get("foo", 3));
        assertEquals("bar2", map.get("foo", 4));
    }

}