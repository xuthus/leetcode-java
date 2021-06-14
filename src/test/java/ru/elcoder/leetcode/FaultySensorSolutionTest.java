package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FaultySensorSolutionTest {

    @Test
    public void badSensor() {
        FaultySensorSolution solution = new FaultySensorSolution();
        assertEquals(2, solution.badSensor(
                arrayOf(2, 3, 4, 5),
                arrayOf(2, 4, 5, 7)
        ));
        assertEquals(1, solution.badSensor(
                arrayOf(2, 4, 5, 3),
                arrayOf(2, 3, 4, 5)
        ));
        assertEquals(-1, solution.badSensor(
                arrayOf(2, 3, 4, 3),
                arrayOf(2, 3, 4, 5)
        ));
    }
}