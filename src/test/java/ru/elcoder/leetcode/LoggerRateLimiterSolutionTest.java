package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.LoggerRateLimiterSolution.*;

public class LoggerRateLimiterSolutionTest {
    @Test
    public void rateLimiterTest() {
        Logger logger = new Logger();
        assertTrue(logger.shouldPrintMessage(1, "foo"));
        assertFalse(logger.shouldPrintMessage(2, "foo"));
        assertTrue(logger.shouldPrintMessage(11, "foo"));
        assertTrue(logger.shouldPrintMessage(12, "bar"));
        assertFalse(logger.shouldPrintMessage(15, "bar"));
        assertTrue(logger.shouldPrintMessage(25, "foo"));
    }
}