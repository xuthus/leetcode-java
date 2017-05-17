package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 17.05.2017.
 */
public class CountPrimesSolutionTest {

    @Test
    public void testCountPrimes() throws Exception {
        CountPrimesSolution solution = new CountPrimesSolution();

        assertEquals(0, solution.countPrimes(2));
        assertEquals(1, solution.countPrimes(3));
        assertEquals(new int[]{2, 3}.length, solution.countPrimes(5));
        assertEquals(4, solution.countPrimes(10));
        assertEquals(15, solution.countPrimes(50));
    }
}