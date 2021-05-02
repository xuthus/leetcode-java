package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ExpressiveWordsSolutionTest {

    @Test
    public void expressiveWords() {
        final ExpressiveWordsSolution solution = new ExpressiveWordsSolution();
        assertEquals(1, solution.expressiveWords("heeeelloooo", arrayOf("hello", "hi", "helo")));
        assertEquals(2, solution.expressiveWords("zzzzyyyyy", arrayOf("zzyy", "zy", "zyz")));
        assertEquals(4, solution.expressiveWords("zzzzyyyyy", arrayOf("zzyy", "zy", "zyy", "zzy")));
        assertEquals(1, solution.expressiveWords("zzyy", arrayOf("zzyy", "zy", "zyy", "zzy")));
    }
}