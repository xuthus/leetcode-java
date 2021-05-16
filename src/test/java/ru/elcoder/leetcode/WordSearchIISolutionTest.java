package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class WordSearchIISolutionTest {

    @Test
    public void findWords() {
        WordSearchIISolution solution = new WordSearchIISolution();
        List<String> words = solution.findWords(
                new char[][]{
                        new char[]{'a', 'b', 'c'}
                },
                arrayOf("abc", "cba", "bac", "bca", "ba")
        );
        assertTrue(words.contains("abc"));
        assertTrue(words.contains("cba"));
        assertTrue(words.contains("ba"));
        assertFalse(words.contains("bac"));
        assertFalse(words.contains("bc"));
        assertEquals(3, words.size());
    }
}