package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 12.07.2017.
 */
public class WordBreakSolutionTest {

    @Test
    public void wordBreak() throws Exception {
        WordBreakSolution solution = new WordBreakSolution();

        assertTrue(solution.wordBreak("bccdbacdbdacddabbaaaadababadad", list("cbc", "bcda", "adb", "ddca", "bad", "bbb",
                "dad", "dac", "ba", "aa", "bd", "abab", "bb", "dbda", "cb", "caccc", "d", "dd", "aadb", "cc", "b", "bcc",
                "bcd", "cd", "cbca", "bbd", "ddd", "dabb", "ab", "acd", "a", "bbcc", "cdcbd", "cada", "dbca", "ac",
                "abacd", "cba", "cdb", "dbac", "aada", "cdcda", "cdc", "dbc", "dbcb", "bdb", "ddbdd", "cadaa", "ddbc",
                "babb")));

        assertFalse(solution.wordBreak("leetcodeleets", list("leet", "code")));
        assertTrue(solution.wordBreak("bombeebom", list("bom", "bee")));
        assertTrue(solution.wordBreak("hastalavista", list("vista", "hasta", "la")));
        assertFalse(solution.wordBreak("z", list("vista", "hasta", "la")));
        assertFalse(solution.wordBreak("z", null));
        assertFalse(solution.wordBreak(null, list("vista", "hasta", "la")));
        assertTrue(solution.wordBreak("abc", list("d", "c", "a", "b")));
        assertFalse(solution.wordBreak("abc", list("d", "c", "a", "be")));
        assertTrue(solution.wordBreak("abc", list("d", "c", "a", "b", "")));
        assertTrue(solution.wordBreak("abc", list("d", "c", "a", "b", "b")));
        assertTrue(solution.wordBreak("abcd", list("a", "abc", "b", "cd")));
        assertTrue(solution.wordBreak("abcd", list("a", "abc", "b", "cd", "ab")));

        assertFalse(solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                list("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")));
    }

    @Test
    public void wordBreak() throws Exception {
        WordBreakSolution solution = new WordBreakSolution();

        assertTrue(solution.wordBreak("bccdbacdbdacddabbaaaadababadad", list("cbc", "bcda", "adb", "ddca", "bad", "bbb",
                "dad", "dac", "ba", "aa", "bd", "abab", "bb", "dbda", "cb", "caccc", "d", "dd", "aadb", "cc", "b", "bcc",
                "bcd", "cd", "cbca", "bbd", "ddd", "dabb", "ab", "acd", "a", "bbcc", "cdcbd", "cada", "dbca", "ac",
                "abacd", "cba", "cdb", "dbac", "aada", "cdcda", "cdc", "dbc", "dbcb", "bdb", "ddbdd", "cadaa", "ddbc",
                "babb")));

        assertFalse(solution.wordBreak("leetcodeleets", list("leet", "code")));
        assertTrue(solution.wordBreak("bombeebom", list("bom", "bee")));
        assertTrue(solution.wordBreak("hastalavista", list("vista", "hasta", "la")));
        assertFalse(solution.wordBreak("z", list("vista", "hasta", "la")));
        assertFalse(solution.wordBreak("z", null));
        assertFalse(solution.wordBreak(null, list("vista", "hasta", "la")));
        assertTrue(solution.wordBreak("abc", list("d", "c", "a", "b")));
        assertFalse(solution.wordBreak("abc", list("d", "c", "a", "be")));
        assertTrue(solution.wordBreak("abc", list("d", "c", "a", "b", "")));
        assertTrue(solution.wordBreak("abc", list("d", "c", "a", "b", "b")));
        assertTrue(solution.wordBreak("abcd", list("a", "abc", "b", "cd")));
        assertTrue(solution.wordBreak("abcd", list("a", "abc", "b", "cd", "ab")));

        assertFalse(solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                list("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")));
    }

    private static List<String> list(String... arrayOfStrings) {
        return Arrays.asList(arrayOfStrings);
    }
}