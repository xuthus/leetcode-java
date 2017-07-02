package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.timer.Timer;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 02.07.2017.
 */
public class PowSolutionTest {
    @Test
    public void myPow() throws Exception {
        PowSolution solution = new PowSolution();

        assertEquals(Math.pow(1.5, -2), solution.myPow(1.5, -2), 0.01);

        assertEquals(Math.pow(0.0, 2), solution.myPow(0.0, 2), 0.01);
        assertEquals(Math.pow(0.0, 0), solution.myPow(0.0, 0), 0.01);

        assertEquals(16.0, solution.myPow(4.0, 2), 0.01);
        assertEquals(Math.pow(1.1, 17), solution.myPow(1.1, 17), 0.01);
        assertEquals(Math.pow(Math.PI, 17), solution.myPow(Math.PI, 17), 0.01);

        solution.myPow(1.00000, -2147483648);
    }

    @Test
    public void performanceTest() {
        final int LOOPS = 1; //1000000;

        PowSolution solution = new PowSolution();

        Timer timer = new Timer();
        timer.start();
        for (int i = 0; i < LOOPS; i++)
            for (int j = 1; j < 100; j++)
                solution.myPowLongs(1.1, j);
        System.out.println("non-optimized pow() duration, ms: " + timer.finish());
        timer.start();
        for (int i = 0; i < LOOPS; i++)
            for (int j = 1; j < 100; j++)
                solution.myPow(1.1, j);
        System.out.println("optimized pow() duration, ms: " + timer.finish());
    }

}