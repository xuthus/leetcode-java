package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MaximumBagsWithFullCapacityOfRocksSolutionTest extends TestCase {

    public void testMaximumBags() {
        MaximumBagsWithFullCapacityOfRocksSolution solution = new MaximumBagsWithFullCapacityOfRocksSolution();

        assertThat(solution.maximumBags(arrayOf(1, 2), arrayOf(1, 2), 10))
                .isEqualTo(2);
        assertThat(solution.maximumBags(arrayOf(2,3,4,5), arrayOf(1,2,4,4), 2))
                .isEqualTo(3);
        assertThat(solution.maximumBags(arrayOf(10,2,2), arrayOf(2,2,0), 100))
                .isEqualTo(3);
        assertThat(solution.maximumBags(arrayOf(10,2,2), arrayOf(10,2,2), 100))
                .isEqualTo(3);
        assertThat(solution.maximumBags(arrayOf(10,2,2,200), arrayOf(10,2,2,0), 100))
                .isEqualTo(3);
        assertThat(solution.maximumBags(arrayOf(10,2,2,200), arrayOf(10,2,2,100), 100))
                .isEqualTo(4);
    }
}