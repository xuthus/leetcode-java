package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.LFUCacheSolution.LFUCache;

public class LFUCacheSolutionTest {
    @Test
    public void test1() {
        LFUCache cache = new LFUCache(3);
        cache.put(1, 10);
        cache.put(2, 11);
        cache.put(3, 12);
        cache.put(4, 13);
        assertEquals(-1, cache.get(1));
        cache.put(4, 23);
        assertEquals(23, cache.get(4));
        cache.put(5, 15);
        cache.put(6, 16);
        assertEquals(-1, cache.get(3));
        assertEquals(-1, cache.get(2));
        assertEquals(23, cache.get(4));
    }

    @Test
    public void test2() {
        LFUCache lfu = new LFUCache(2);
        lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
        lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
        assertEquals(1, lfu.get(1));      // return 1
        // cache=[1,2], cnt(2)=1, cnt(1)=2
        lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
        // cache=[3,1], cnt(3)=1, cnt(1)=2
        assertEquals(-1, lfu.get(2));      // return -1 (not found)
        assertEquals(3, lfu.get(3));      // return 3
        // cache=[3,1], cnt(3)=2, cnt(1)=2
        lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
        // cache=[4,3], cnt(4)=1, cnt(3)=2
        assertEquals(-1, lfu.get(1));      // return -1 (not found)
        assertEquals(3, lfu.get(3));      // return 3
        // cache=[3,4], cnt(4)=1, cnt(3)=3
        assertEquals(4, lfu.get(4));      // return 4
        // cache=[3,4], cnt(4)=2, cnt(3)=3
    }

    @Test
    public void test3() {
        LFUCache lfu = new LFUCache(0);
        lfu.put(0, 0);   // cache=[1,_], cnt(1)=1
        assertEquals(-1, lfu.get(0));      // return 1
    }
}