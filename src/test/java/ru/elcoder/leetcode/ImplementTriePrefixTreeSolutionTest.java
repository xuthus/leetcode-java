package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.ImplementTriePrefixTreeSolution.Trie;

import static org.junit.Assert.*;

public class ImplementTriePrefixTreeSolutionTest {

    @Test
    public void trieTest() {
        final Trie trie = new Trie();
        trie.insert("bob");
        trie.insert("flashmob");
        trie.insert("moby");
        assertTrue(trie.search("moby"));
        assertTrue(trie.search("flashmob"));
        assertTrue(trie.search("bob"));
        assertFalse(trie.search("boba"));
        assertFalse(trie.search("abob"));
        assertFalse(trie.search("bo"));
        assertTrue(trie.startsWith("bo"));
        assertTrue(trie.startsWith("bob"));
        assertTrue(trie.startsWith("b"));
        assertTrue(trie.startsWith(""));
    }
}
