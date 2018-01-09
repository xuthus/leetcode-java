package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.timer.Timer;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ReversePairsSolutionTest {

    public static final int COUNTS = 4; //40000;

    @Test
    public void reversePairs() throws Exception {
        ReversePairsSolution solution = new ReversePairsSolution();

        assertEquals(2, solution.reversePairs(arrayOf(1, 3, 2, 3, 1)));
        assertEquals(3, solution.reversePairs(arrayOf(2, 4, 3, 5, 1)));
        assertEquals(0, solution.reversePairs(arrayOf(2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647)));
        assertEquals(1, solution.reversePairs(arrayOf(-5, -5)));
        int[] nums = new int[COUNTS];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(0, 10000);
        }
        Timer timer = new Timer();
        timer.start();
        solution.reversePairs(nums);
        System.out.println(timer.finish());
    }

    @Test
    public void reversePairsOptimized() throws Exception {
        ReversePairsSolution solution = new ReversePairsSolution();

        assertEquals(3, solution.reversePairsOptimized(arrayOf(2, 4, 3, 5, 1)));
        assertEquals(2, solution.reversePairsOptimized(arrayOf(1, 3, 2, 3, 1)));
        assertEquals(0, solution.reversePairsOptimized(arrayOf(2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647)));
        assertEquals(1, solution.reversePairsOptimized(arrayOf(-5, -5)));
        //compare naive and optimized
        int[] nums = new int[500];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(0, 10000);
        }
//        assertEquals(solution.reversePairs(nums), solution.reversePairsOptimized(nums));

        nums = new int[COUNTS];
        for (int i = 0; i < nums.length; i++) {
//            nums[i] = ThreadLocalRandom.current().nextInt(0, 10000);
            nums[i] = i;
        }
        Timer timer = new Timer();
        timer.start();
        solution.reversePairsOptimized(nums);
        System.out.println(timer.finish());

/*
        nums = new int[COUNTS];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(0, 10000);
//            nums[i] = i;
        }
        timer = new Timer();
        timer.start();
        solution.reversePairsOptimized(nums);
        System.out.println(timer.finish());
*/
    }

    @Test
    public void reversePairsOptimizedBig() throws Exception {
        long start = System.currentTimeMillis();
        ReversePairsSolution solution = new ReversePairsSolution();

        //compare naive and optimized
        int count = 50; //50000;
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(0, 10000);
        }
        System.out.println(System.currentTimeMillis() - start);
        solution.reversePairsOptimized(nums);
        System.out.println(System.currentTimeMillis() - start);
        assertEquals(solution.reversePairs(nums), solution.reversePairsOptimized(nums));
    }

}