package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.DesignHitCounterSolution.ArrayHitCounter;
import static ru.elcoder.leetcode.DesignHitCounterSolution.HitCounter;

public class DesignHitCounterSolutionTest {

    @Test
    public void hit1() {
        HitCounter counter = new ArrayHitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        assertEquals(3, counter.getHits(4));
        counter.hit(300);
        assertEquals(4, counter.getHits(300));
        assertEquals(3, counter.getHits(301));
        assertEquals(2, counter.getHits(302));
        assertEquals(1, counter.getHits(303));
    }
}