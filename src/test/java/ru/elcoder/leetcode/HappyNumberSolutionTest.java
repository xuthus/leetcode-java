package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 17.05.2017.
 */
public class HappyNumberSolutionTest {

    public static void main(String[] args) {
        HappyNumberSolution solution = new HappyNumberSolution();
        System.out.println("Happy numbers:");
        for (int i = 0; i < 1000; i++) {
            if (solution.isHappy(i))
                System.out.println(i);
        }
    }

    @Test
    public void testIsHappy() throws Exception {
        HappyNumberSolution solution = new HappyNumberSolution();

        assertTrue(solution.isHappy(-7));
        assertTrue(solution.isHappy(1));
        assertTrue(solution.isHappy(7));
        assertTrue(solution.isHappy(19));
        assertTrue(solution.isHappy(32));
        assertTrue(solution.isHappy(68));
        assertTrue(solution.isHappy(836));
        assertFalse(solution.isHappy(20));
        assertFalse(solution.isHappy(803));
    }
}