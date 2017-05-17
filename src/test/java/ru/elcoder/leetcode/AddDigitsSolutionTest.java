package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 17.05.2017.
 */
public class AddDigitsSolutionTest {

    @Test
    public void testAddDigits() throws Exception {
        AddDigitsSolution solution = new AddDigitsSolution();

        assertEquals(3, solution.addDigits(12));
        assertEquals(9, solution.addDigits(99));
        assertEquals(9, solution.addDigits(9999));
        assertEquals(3, solution.addDigits(9993));

        assertEquals(3, solution.addDigitsVedic(12));
        assertEquals(9, solution.addDigitsVedic(99));
        assertEquals(9, solution.addDigitsVedic(9999));
        assertEquals(3, solution.addDigitsVedic(9993));
    }
}