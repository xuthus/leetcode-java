package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeStringSolutionTest {

    @Test
    public void decodeString() {
        final DecodeStringSolution solution = new DecodeStringSolution();

        assertEquals("aa", solution.decodeString("aa"));
        assertEquals("aa", solution.decodeString("2[a]"));
        assertEquals("aabbbbcc", solution.decodeString("aa2[bb]cc"));
        assertEquals("aabbbbccdededef", solution.decodeString("aa2[bb]cc3[de]f"));
        assertEquals("abcccbcccd", solution.decodeString("a2[b3[c]]d"));
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
        assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
    }
}
