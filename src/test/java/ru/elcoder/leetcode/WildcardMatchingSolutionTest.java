package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class WildcardMatchingSolutionTest {

    public static final int WARMUP_LOOPS = 1; // 100
    public static final int LOOPS = 1;        // 10000

    @Test
    public void isMatch() throws Exception {
//        System.out.println("Warmup...");
        Thread.sleep(500);
        WildcardMatchingSolution solution = new WildcardMatchingSolution();
        applyTestCases(solution, WARMUP_LOOPS);
        Thread.sleep(500);
        solution = new WildcardMatchingOptimizationsSolution();
        applyTestCases(solution, WARMUP_LOOPS);

//        System.out.println("Not Optimized");
        solution = new WildcardMatchingSolution();
        long startAt = System.currentTimeMillis();
        applyTestCases(solution, LOOPS);
//        System.out.println(System.currentTimeMillis() - startAt);

//        System.out.println("Optimized");
        solution = new WildcardMatchingOptimizationsSolution();
        startAt = System.currentTimeMillis();
        applyTestCases(solution, LOOPS);
//        System.out.println(System.currentTimeMillis() - startAt);
    }

    private void applyTestCases(WildcardMatchingSolution solution, int loops) {
        for (int i = 0; i < loops; i++) {
            assertTrue(solution.isMatch("cXaXb", "c*a*b"));
            assertTrue(solution.isMatch("cXaXb", "*a*"));
            assertTrue(solution.isMatch("cXaXb", "*XaX*"));
            assertTrue(solution.isMatch("cXaX", "*XaX*"));
            assertTrue(solution.isMatch("XaX", "*XaX*"));
            assertTrue(solution.isMatch("XaXb", "*XaX*"));
            assertFalse(solution.isMatch("cXaXb", "*a"));
            assertTrue(solution.isMatch("cXaXb", "***"));
            assertTrue(solution.isMatch("cXaXb", "*"));
            assertFalse(solution.isMatch("cXaXb", ""));
            assertFalse(solution.isMatch("cXaXb", "?"));
            assertTrue(solution.isMatch("cXaXb", "?*"));
            assertTrue(solution.isMatch("cXaXb", "*?*"));
            assertTrue(solution.isMatch("cXaXb", "*?"));
            assertTrue(solution.isMatch("cXaXb", "cXaX?"));
            assertTrue(solution.isMatch("cXaXb", "?XaXb"));
            assertFalse(solution.isMatch("acXaXb", "cXaX?"));
            assertFalse(solution.isMatch("cXaXba", "?XaXb"));
            assertTrue(solution.isMatch("cXaXb", "cXa??"));
            assertTrue(solution.isMatch("cXaXb", "?????"));
            assertTrue(solution.isMatch("cXaXb", "??*??"));
            assertTrue(solution.isMatch("cXaXb", "*??*??"));
            assertTrue(solution.isMatch("cXaXb", "*??*??*"));
            assertTrue(solution.isMatch("cXaXb", "*?????*"));
            assertFalse(solution.isMatch("cXaXb", "??????"));
            assertFalse(solution.isMatch("cXaXb", "??????*"));
            assertFalse(solution.isMatch("cXaXb", "*??????"));
            assertFalse(solution.isMatch("cXaXb", "*??????*"));
            assertFalse(solution.isMatch("", "?"));
            assertTrue(solution.isMatch("", "*"));
            assertTrue(solution.isMatch("", ""));
            assertFalse(solution.isMatch("aa", null));
            assertFalse(solution.isMatch("aa", ""));
            assertTrue(solution.isMatch("aa", "a?"));
            assertFalse(solution.isMatch("aa", "a??"));
            assertFalse(solution.isMatch("aa", "??a"));
            assertFalse(solution.isMatch("aa", "?a?"));
            assertTrue(solution.isMatch("aa", "*"));
            assertTrue(solution.isMatch("aa", "aa"));
            assertFalse(solution.isMatch("aa", "aaa"));
            assertTrue(solution.isMatch("aaa", "a?a"));
            assertTrue(solution.isMatch("cXaXb", "c*a*b"));
            assertFalse(solution.isMatch("aab", "c*a*b"));
            assertTrue(solution.isMatch("c*ab", "c*a*b"));
            assertTrue(solution.isMatch("aaab", "aa*ab"));
            assertTrue(solution.isMatch("aabab", "aa*ab"));
            assertTrue(solution.isMatch("aa-ab-ab", "aa*ab"));
            assertFalse(solution.isMatch("aa", "a"));
            assertTrue(solution.isMatch("xyssabc", "*a?c*"));
            assertFalse(solution.isMatch("", "?"));
            assertTrue(solution.isMatch("", "*"));
            assertFalse(solution.isMatch("aa", ""));
            assertFalse(solution.isMatch("aa", null));
            assertFalse(solution.isMatch("aa", "a"));
            assertTrue(solution.isMatch("aa", "a?"));
            assertFalse(solution.isMatch("a", "a?"));
            assertTrue(solution.isMatch("aa", "aa"));
            assertFalse(solution.isMatch("aaa", "aa"));
            assertTrue(solution.isMatch("aa", "*"));
            assertTrue(solution.isMatch("aa", "a*"));
            assertTrue(solution.isMatch("ab", "?*"));
            assertTrue(solution.isMatch("ab", "*?"));
            assertFalse(solution.isMatch("aab", "c*a*b"));
            assertTrue(solution.isMatch("cab", "c*a*b"));
            assertTrue(solution.isMatch("c ab", "c*a*b"));
            assertFalse(solution.isMatch("cab", "c?a*b"));
            assertTrue(solution.isMatch("cXab", "c?a*b"));
            assertTrue(solution.isMatch("c*ab", "c*a*b"));
            assertTrue(solution.isMatch("c?ab", "c*a*b"));
            assertTrue(solution.isMatch("c??ab", "c*a*b"));
            assertFalse(solution.isMatch("c??ab", "c?a*b"));
            assertFalse(solution.isMatch("aab", "aa*ab"));
            assertTrue(solution.isMatch("aaab", "aa*ab"));
            assertTrue(solution.isMatch("aabab", "aa*ab"));
            assertTrue(solution.isMatch("aa-ab-ab", "aa*ab"));
            // первый случай
            assertTrue(solution.isMatch("xassabc", "*a?c*"));
            assertTrue(solution.isMatch("cdgiescdfi", "*cd?i*"));
            assertTrue(solution.isMatch("abefcdgiescdfimde", "ab*cd?i*de"));
            // второй случай
            assertTrue(solution.isMatch("-a-cc-", "*a?c*"));
            assertFalse(solution.isMatch("bbaabbbabbbbabbbaaabababbbabbababbbabaaabbbbaabaabaaaa", "*b*b*a*abbaab*aba*"));
            assertFalse(solution.isMatch("bbaabbbabbbbabbbaaabababbbabbababbbabaaabbbbaabaabaaaa", "*b**b*a**abbaab*aba***"));
//            System.out.println("----------------------------");
            assertTrue(solution.isMatch("aaabbaabbaab", "*aabbaa*aab"));
        }
    }

    @Test
    public void leftToken() throws Exception {
        WildcardMatchingSolution solution = new WildcardMatchingSolution();

        assertEquals("c", solution.leftToken("c*a"));
        assertEquals("*", solution.leftToken("*a"));
        assertEquals("a", solution.leftToken("a"));
        assertEquals("azz", solution.leftToken("azz"));
        assertEquals("azz", solution.leftToken("azz*"));
        assertEquals("?", solution.leftToken("?*"));
        assertEquals("", solution.leftToken(""));
    }

    @Test
    public void rightToken() throws Exception {
        WildcardMatchingSolution solution = new WildcardMatchingSolution();

        assertEquals("a", solution.rightToken("c*a"));
        assertEquals("*", solution.rightToken("c*"));
        assertEquals("c", solution.rightToken("c"));
        assertEquals("", solution.rightToken(""));
        assertEquals("xxx", solution.rightToken("xxx"));
        assertEquals("xxx", solution.rightToken("*xxx"));
        assertEquals("*", solution.rightToken("*"));
        assertEquals("?", solution.rightToken("?"));
    }

    @Test
    public void testSubMatch() {
        WildcardMatchingSolution solution = new WildcardMatchingSolution();

        assertTrue(solution.testSubMatch("-a--a-c", false, "a?c", false));
    }

    @Test
    public void stringContainsMask() {
        WildcardMatchingSolution solution = new WildcardMatchingSolution();

        assertTrue(solution.stringContainsMask("abcdef", "c?e"));
        assertTrue(solution.stringContainsMask("abcde", "c?e"));
        assertTrue(solution.stringContainsMask("acbcdef", "c?e"));
        assertTrue(solution.stringContainsMask("cde", "c?e"));
    }

    @Test
    public void indexOfMask() {
        WildcardMatchingOptimizationsSolution solution = new WildcardMatchingOptimizationsSolution();

        assertEquals(2, solution.indexOfMask("abcdef", "c?e"));
        assertEquals(2, solution.indexOfMask("abcde", "c?e"));
        assertEquals(3, solution.indexOfMask("acbcdef", "c?e"));
        assertEquals(0, solution.indexOfMask("cde", "c?e"));
        assertEquals(-1, solution.indexOfMask("cdf", "c?e"));
    }

    @Test
    public void lastIndexOfMask() {
        WildcardMatchingOptimizationsSolution solution = new WildcardMatchingOptimizationsSolution();

        assertEquals(6, solution.lastIndexOfMask("acxeabcdef", "c?e"));
        assertEquals(2, solution.lastIndexOfMask("abcdef", "c?e"));
        assertEquals(2, solution.lastIndexOfMask("abcde", "c?e"));
        assertEquals(3, solution.lastIndexOfMask("acbcdef", "c?e"));
        assertEquals(0, solution.lastIndexOfMask("cde", "c?e"));
        assertEquals(-1, solution.lastIndexOfMask("cdf", "c?e"));
    }

    @Test
    public void startsWithMask() {
        WildcardMatchingOptimizationsSolution solution = new WildcardMatchingOptimizationsSolution();

        assertTrue(solution.startsWithMask("abcdef", "abc"));
        assertTrue(solution.startsWithMask("abcdef", "ab?"));
        assertTrue(solution.startsWithMask("abcdef", "a?c"));
        assertTrue(solution.startsWithMask("abcdef", "?bc"));
        assertTrue(solution.startsWithMask("abcdef", "?b?"));
        assertTrue(solution.startsWithMask("abcdef", "abcdef"));
        assertTrue(solution.startsWithMask("abcdef", "??????"));
        assertFalse(solution.startsWithMask("abcdef", "???????"));
    }

    @Test
    public void endsWithMask() {
        WildcardMatchingOptimizationsSolution solution = new WildcardMatchingOptimizationsSolution();

        assertTrue(solution.endsWithMask("abcdef", "def"));
        assertTrue(solution.endsWithMask("abcdef", "de?"));
        assertTrue(solution.endsWithMask("abcdef", "d?f"));
        assertTrue(solution.endsWithMask("abcdef", "?ef"));
        assertTrue(solution.endsWithMask("abcdef", "?e?"));
        assertTrue(solution.endsWithMask("abcdef", "abcdef"));
        assertTrue(solution.endsWithMask("abcdef", "??????"));
        assertFalse(solution.endsWithMask("abcdef", "???????"));
    }

    @Test
    public void equalsMask() {
        WildcardMatchingOptimizationsSolution solution = new WildcardMatchingOptimizationsSolution();

        assertTrue(solution.equalsMask("", ""));
        assertTrue(solution.equalsMask("abc", "abc"));
        assertTrue(solution.equalsMask("abc", "a?c"));
        assertTrue(solution.equalsMask("abc", "ab?"));
        assertTrue(solution.equalsMask("abc", "?b?"));
        assertTrue(solution.equalsMask("abc", "???"));
        assertFalse(solution.equalsMask("abc", "????"));
    }
}