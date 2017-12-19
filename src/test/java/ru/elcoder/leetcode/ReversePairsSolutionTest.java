package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.timer.Timer;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ReversePairsSolutionTest {
    @Test
    public void reversePairs() throws Exception {
        ReversePairsSolution solution = new ReversePairsSolution();

        assertEquals(2, solution.reversePairs(arrayOf(1, 3, 2, 3, 1)));
        assertEquals(3, solution.reversePairs(arrayOf(2, 4, 3, 5, 1)));
        assertEquals(0, solution.reversePairs(arrayOf(2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647)));
        assertEquals(0, solution.reversePairs(arrayOf(2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647)));
        assertEquals(0, solution.reversePairs(arrayOf(2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647)));
        int[] nums = new int[30000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(0, 10000);
        }
        Timer timer = new Timer();
        timer.start();
        solution.reversePairs(nums);
        System.out.println(timer.finish());
    }

}