package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.tools.Utils.array;

/**
 * Created by xuthus on 12.07.2017.
 */
public class MaximumProductOfThreeNumbersSolutionTest {
    @Test
    public void maximumProduct() throws Exception {
        MaximumProductOfThreeNumbersSolution solution = new MaximumProductOfThreeNumbersSolution();

        assertEquals(6, solution.maximumProduct(array(1, 2, 3)));
        assertEquals(12000, solution.maximumProduct(array(-1, -5, 1, 0, 2, -2, -6, 3, 1, 1, 4, -1, 1, -500)));
        assertEquals(6, solution.maximumProduct(array(1, 2, 3, -4)));
        assertEquals(720, solution.maximumProduct(array(-4, -3, -2, -1, 60)));
    }

}