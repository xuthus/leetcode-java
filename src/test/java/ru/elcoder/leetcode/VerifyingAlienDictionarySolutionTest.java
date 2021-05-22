package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class VerifyingAlienDictionarySolutionTest {

    @Test
    public void isAlienSorted() {
        VerifyingAlienDictionarySolution solution = new VerifyingAlienDictionarySolution();
        assertTrue(solution.isAlienSorted(
                arrayOf("hello", "leetcode"),
                "hlabcdefgijkmnopqrstuvwxyz"
        ));
        assertTrue(solution.isAlienSorted(
                arrayOf("hello", "hello"),
                "hlabcdefgijkmnopqrstuvwxyz"
        ));
        assertFalse(solution.isAlienSorted(
                arrayOf("word", "world", "row"),
                "worldabcefghijkmnpqstuvxyz"
        ));
    }
}