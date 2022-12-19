package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FindIfPathExistsInGraphSolutionTest extends TestCase {

    public void testValidPath() {
        FindIfPathExistsInGraphSolution solution = new FindIfPathExistsInGraphSolution();

        assertThat(solution.validPath(3, new int[][]{
                arrayOf(0, 1),
                arrayOf(1, 2),
                arrayOf(2, 0)
        }, 0, 2)).isTrue();
        assertThat(solution.validPath(6, new int[][]{
                arrayOf(0, 1),
                arrayOf(0, 2),
                arrayOf(3, 5),
                arrayOf(5, 4),
                arrayOf(4, 3)
        }, 0, 5)).isFalse();
        assertThat(solution.validPath(6, new int[][]{
                arrayOf(0, 1),
                arrayOf(0, 2),
                arrayOf(3, 5),
                arrayOf(5, 4),
                arrayOf(4, 3)
        }, 4, 5)).isTrue();
    }
}