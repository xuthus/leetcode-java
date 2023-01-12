package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MaximumIceCreamBarsSolutionTest extends TestCase {

    public void testMaxIceCreamQuickSort() {
        MaximumIceCreamBarsSolution solution = new MaximumIceCreamBarsSolution();

        assertThat(solution.maxIceCream(arrayOf(1, 1), 7)).isEqualTo(2);
        assertThat(solution.maxIceCream(arrayOf(11), 7)).isEqualTo(0);
        assertThat(solution.maxIceCream(arrayOf(4, 4, 1, 1), 7)).isEqualTo(3);
        assertThat(solution.maxIceCream(arrayOf(4, 4, 1, 1, 1), 7)).isEqualTo(4);
    }

    public void testMaxIceCreamCountingSort() {
        MaximumIceCreamBarsCountingSortSolution solution = new MaximumIceCreamBarsCountingSortSolution();

        assertThat(solution.maxIceCream(arrayOf(1, 1), 7)).isEqualTo(2);
        assertThat(solution.maxIceCream(arrayOf(11), 7)).isEqualTo(0);
        assertThat(solution.maxIceCream(arrayOf(4, 4, 1, 1), 7)).isEqualTo(3);
        assertThat(solution.maxIceCream(arrayOf(4, 4, 1, 1, 1), 7)).isEqualTo(4);
    }

}
