package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesignAddAndSearchWordsDataStructureSolutionTest {
    @Test
    public void testTrie1() {
        final DesignAddAndSearchWordsDataStructureSolution.WordDictionary dic = new DesignAddAndSearchWordsDataStructureSolution.WordDictionary();
        dic.addWord("bad");
        dic.addWord("dad");
        dic.addWord("mad");
        dic.addWord("mazda");
        assertTrue(dic.search("bad"));
        assertTrue(dic.search("dad"));
        assertTrue(dic.search("mad"));
        assertTrue(dic.search(".ad"));
        assertTrue(dic.search("m.d"));
        assertTrue(dic.search("ma."));
        assertFalse(dic.search("ma.."));
        assertFalse(dic.search("maz"));
        assertFalse(dic.search("mazd"));
        assertFalse(dic.search("mazdo"));
        assertFalse(dic.search("mazdak"));
        assertTrue(dic.search("mazda"));
        assertTrue(dic.search("ma..a"));
    }
}