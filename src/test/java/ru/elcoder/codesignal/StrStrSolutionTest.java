package ru.elcoder.codesignal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrStrSolutionTest {

    @Test
    public void strstr() {
        final StrStrSolution solution = new StrStrSolution();
        assertEquals(-1, solution.strstr("abcd", "qw"));
        assertEquals(-1, solution.strstr("abcd", "cde"));
        assertEquals(-1, solution.strstr("abcd", "bce"));
        assertEquals(0, solution.strstr("abcd", "abc"));
        assertEquals(1, solution.strstr("abcd", "bc"));
        assertEquals(2, solution.strstr("abcd", "cd"));
    }
}
