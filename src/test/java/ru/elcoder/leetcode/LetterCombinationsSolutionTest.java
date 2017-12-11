package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 09.12.2017.
 */
public class LetterCombinationsSolutionTest {

    @Test
    public void letterCombinations() {
        runTestCases(new LetterCombinationsSolution());
        runTestCases(new LetterCombinationsOptimizedSolution());
    }

    private void runTestCases(LetterCombinations solution) {
        List<String> list = solution.letterCombinations("23");
        Collections.sort(list);
        assertEquals(9, list.size());
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", Arrays.toString(list.toArray()));
        list = solution.letterCombinations("12131");
        Collections.sort(list);
        assertEquals(9, list.size());
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", Arrays.toString(list.toArray()));
        list = solution.letterCombinations("1213100");
        assertEquals(9, list.size());
        list = solution.letterCombinations("1213109");
        assertEquals(36, list.size());
    }
}