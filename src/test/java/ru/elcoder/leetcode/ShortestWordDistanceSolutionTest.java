package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ShortestWordDistanceSolutionTest extends TestCase {

    public void testShortestDistance() {
        ShortestWordDistanceSolution solution = new ShortestWordDistanceSolution();

        assertThat(solution.shortestDistance(arrayOf("practice", "makes", "perfect", "coding", "makes"), "coding", "practice")).isEqualTo(3);
        assertThat(solution.shortestDistance(arrayOf("practice", "makes", "perfect", "coding", "makes", "practice"), "coding", "practice")).isEqualTo(2);
        assertThat(solution.shortestDistance(arrayOf("practice", "makes", "perfect", "coding", "makes", "practice", "practice"), "coding", "practice")).isEqualTo(2);
        assertThat(solution.shortestDistance(arrayOf("practice", "makes", "perfect", "coding", "makes", "practice", "practice", "coding"), "coding", "practice")).isEqualTo(1);
        assertThat(solution.shortestDistance(arrayOf("practice", "makes", "perfect", "coding", "makes"), "makes", "coding")).isEqualTo(1);
    }

}
