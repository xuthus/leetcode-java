package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheNumberOfFullRoundsYouHavePlayedSolutionTest {

    @Test
    public void numberOfRounds() {
        final TheNumberOfFullRoundsYouHavePlayedSolution solution = new TheNumberOfFullRoundsYouHavePlayedSolution();
        assertEquals(1, solution.numberOfRounds("12:01", "12:44"));
        assertEquals(40, solution.numberOfRounds("20:00", "06:00"));
        assertEquals(56, solution.numberOfRounds("06:00", "20:00"));
        assertEquals(0, solution.numberOfRounds("00:47", "00:57"));
        assertEquals(0, solution.numberOfRounds("00:01", "00:02"));
        assertEquals(0, solution.numberOfRounds("00:14", "00:16"));
    }

    @Test
    public void toInt() {
        final TheNumberOfFullRoundsYouHavePlayedSolution solution = new TheNumberOfFullRoundsYouHavePlayedSolution();
        assertEquals(60, solution.toInt("01:00"));
        assertEquals(0, solution.toInt("00:00"));
        assertEquals(23*60+59, solution.toInt("23:59"));
    }

    @Test
    public void startOfNearestRound() {
        final TheNumberOfFullRoundsYouHavePlayedSolution solution = new TheNumberOfFullRoundsYouHavePlayedSolution();
        assertEquals(0, solution.startOfNearestRound(0, true));
        assertEquals(15, solution.startOfNearestRound(1, true));
        assertEquals(15, solution.startOfNearestRound(14, true));
        assertEquals(15, solution.startOfNearestRound(15, true));
        assertEquals(30, solution.startOfNearestRound(16, true));
        assertEquals(60, solution.startOfNearestRound(59, true));

        assertEquals(-15, solution.startOfNearestRound(0, false));
        assertEquals(-15, solution.startOfNearestRound(1, false));
        assertEquals(-15, solution.startOfNearestRound(14, false));
        assertEquals(0, solution.startOfNearestRound(15, false));
        assertEquals(0, solution.startOfNearestRound(16, false));
        assertEquals(30, solution.startOfNearestRound(59, false));
    }
}
