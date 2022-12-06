package ru.elcoder.leetcode;

import junit.framework.TestCase;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FindKClosestElementsSolutionTest extends TestCase {

    public void testFindClosestElements() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();

        List<Integer> nums = solution.findClosestElements(arrayOf(1, 2, 3, 4, 5), 4, 3);
        assertThat(nums).containsExactlyInAnyOrder(1, 2, 3, 4);

        nums = solution.findClosestElements(arrayOf(1, 2, 3, 4, 5), 4, -1);
        assertThat(nums).containsExactlyInAnyOrder(1, 2, 3, 4);

        nums = solution.findClosestElements(arrayOf(1, 2, 3, 4, 5), 4, 10);
        assertThat(nums).containsExactlyInAnyOrder(2, 3, 4, 5);

        nums = solution.findClosestElements(arrayOf(1, 2, 3, 4, 5), 1, 4);
        assertThat(nums).containsExactlyInAnyOrder(4);

        nums = solution.findClosestElements(arrayOf(1, 1, 1, 1, 1, 6, 7), 3, 2);
        assertThat(nums).containsExactlyInAnyOrder(1, 1, 1);

        nums = solution.findClosestElements(arrayOf(1, 1, 1, 1), 4, 2);
        assertThat(nums).containsExactlyInAnyOrder(1, 1, 1, 1);

        nums = solution.findClosestElements(arrayOf(1, 1, 1, 1), 4, 0);
        assertThat(nums).containsExactlyInAnyOrder(1, 1, 1, 1);

        nums = solution.findClosestElements(arrayOf(1, 1, 1, 1), 4, 1);
        assertThat(nums).containsExactlyInAnyOrder(1, 1, 1, 1);
    }
}