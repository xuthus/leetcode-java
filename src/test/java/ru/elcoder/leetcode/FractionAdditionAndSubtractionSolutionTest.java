package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 05.07.2017.
 */
public class FractionAdditionAndSubtractionSolutionTest {

    @Test
    public void testFractionAddition() throws Exception {
        FractionAdditionAndSubtractionSolution solution = new FractionAdditionAndSubtractionSolution();

        assertEquals("0/1", solution.fractionAddition("-1/2+1/2"));
        assertEquals("1/3", solution.fractionAddition("-1/2+1/2+1/3"));
        assertEquals("-1/6", solution.fractionAddition("1/3-1/2"));
        assertEquals("2/1", solution.fractionAddition("5/3+1/3"));
    }
}