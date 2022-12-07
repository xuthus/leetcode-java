package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ContainsDuplicateIISolutionTest extends TestCase {

    public void testContainsNearbyDuplicate() {
        ContainsDuplicateIISolution solution = new ContainsDuplicateIISolution();

        assertThat(solution.containsNearbyDuplicate(arrayOf(1, 2, 3, 1), 3)).isTrue();

        assertThat(solution.containsNearbyDuplicate(arrayOf(1, 2, 3, 4), 2)).isFalse();
        assertThat(solution.containsNearbyDuplicate(arrayOf(1, 2, 1, 4), 3)).isTrue();
        assertThat(solution.containsNearbyDuplicate(arrayOf(7, 3, 1, 4, 5, 9, 1, 2, 1, 4), 3)).isTrue();
        assertThat(solution.containsNearbyDuplicate(arrayOf(1, 2, 1, 4), 2)).isTrue();
        assertThat(solution.containsNearbyDuplicate(arrayOf(1, 0, 1, 1), 1)).isTrue();
        assertThat(solution.containsNearbyDuplicate(arrayOf(1, 2, 3, 1, 2, 3), 2)).isFalse();
        assertThat(solution.containsNearbyDuplicate(arrayOf(1, 2, 3, 1, 2, 3), 20)).isTrue();
    }
}