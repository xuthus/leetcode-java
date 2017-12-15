package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.timer.Timer;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 02.07.2017.
 */
public class SqrtSolutionTest {
    @Test
    public void mySqrtByDivide() throws Exception {
        SqrtByDivideSolution solution = new SqrtByDivideSolution();

        assertEquals(4, solution.mySqrt(16));
        assertEquals(4, solution.mySqrt(17));
        assertEquals((int) Math.sqrt(Integer.MAX_VALUE), solution.mySqrt(Integer.MAX_VALUE));
        for (int i = 0; i < 1000; i++) {
            assertEquals((int) Math.sqrt(i), solution.mySqrt(i));
        }
    }

    @Test
    public void mySqrtByDiff() throws Exception {
        SqrtByDiffSolution solution = new SqrtByDiffSolution();

        assertEquals(4, solution.mySqrt(16));
        assertEquals(4, solution.mySqrt(17));
        assertEquals((int) Math.sqrt(Integer.MAX_VALUE), solution.mySqrt(Integer.MAX_VALUE));
        for (int i = 0; i < 1000; i++) {
            assertEquals((int) Math.sqrt(i), solution.mySqrt(i));
        }
    }

    @Test
    public void performanceTest() {
        SqrtByDiffSolution diffSolution = new SqrtByDiffSolution();
        SqrtByDivideSolution divSolution = new SqrtByDivideSolution();
        final int LOOPS = 1; //100000000;
        Timer timer = new Timer();
        timer.start();
        for (int i = 0; i < LOOPS; i++)
            diffSolution.mySqrt(i);
//        System.out.println("diff sqrt duration, ms: " + timer.finish());
        timer.start();
        for (int i = 0; i < LOOPS; i++)
            divSolution.mySqrt(i);
//        System.out.println("div sqrt duration, ms: " + timer.finish());
    }
}