package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 30.06.2017.
 */
public class RepeatedSubstringPatternSolutionTest {

    public static final int LOOPS = 1; //1000000;

    @Test
    public void repeatedPattern() throws Exception {
        RepeatedSubstringPatternSolution solution = new RepeatedSubstringPatternSolution();
        assertTrue(solution.repeatedPattern(2, "abab"));
    }

    @Test
    public void repeatedSubstringPattern() throws Exception {
        RepeatedSubstringPatternSolution solution = new RepeatedSubstringPatternSolution();

        long startAt = System.currentTimeMillis();
        for (int i = 0; i < LOOPS; i++) {
            assertFalse(solution.repeatedSubstringPattern(""));
            assertFalse(solution.repeatedSubstringPattern("a"));
            assertFalse(solution.repeatedSubstringPattern("qwertyuiopasdfghjklzxcvbnmmnbvcxzasdfghjklpoiuytrewqqazwsxedcrfvtgbyhnujmikol"));
            assertTrue(solution.repeatedSubstringPattern("abab"));
            assertTrue(solution.repeatedSubstringPattern("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc"));
            assertFalse(solution.repeatedSubstringPattern("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabe"));
            assertTrue(solution.repeatedSubstringPattern("sergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergey"));
            assertFalse(solution.repeatedSubstringPattern("aba"));
        }
//        System.out.println("not optimized duration: " + (System.currentTimeMillis() - startAt));
    }

    @Test
    public void repeatedSubstringPatternOptimized() throws Exception {
        RepeatedSubstringPatternOptimizedSolution solution = new RepeatedSubstringPatternOptimizedSolution();

        long startAt = System.currentTimeMillis();
        for (int i = 0; i < LOOPS; i++) {
            assertFalse(solution.repeatedSubstringPattern(""));
            assertFalse(solution.repeatedSubstringPattern("a"));
            assertFalse(solution.repeatedSubstringPattern("qwertyuiopasdfghjklzxcvbnmmnbvcxzasdfghjklpoiuytrewqqazwsxedcrfvtgbyhnujmikol"));
            assertTrue(solution.repeatedSubstringPattern("abab"));
            assertTrue(solution.repeatedSubstringPattern("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc"));
            assertFalse(solution.repeatedSubstringPattern("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabe"));
            assertTrue(solution.repeatedSubstringPattern("sergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergey"));
            assertFalse(solution.repeatedSubstringPattern("aba"));
        }
//        System.out.println("optimized duration: " + (System.currentTimeMillis() - startAt));
    }

}