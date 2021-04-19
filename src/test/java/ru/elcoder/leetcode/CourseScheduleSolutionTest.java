package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class CourseScheduleSolutionTest {

    @Test
    public void canFinish1() {
        final CourseScheduleSolution solution = new CourseScheduleSolution();
        assertTrue(solution.canFinish(2, new int[][]{
                arrayOf(1, 0)
        }));
    }

    @Test
    public void canFinish2() {
        final CourseScheduleSolution solution = new CourseScheduleSolution();
        assertFalse(solution.canFinish(2, new int[][]{
                arrayOf(1, 0),
                arrayOf(0, 1)
        }));
    }

    @Test
    public void canFinish3() {
        final CourseScheduleSolution solution = new CourseScheduleSolution();
        assertFalse(solution.canFinish(5, new int[][]{
                arrayOf(1, 0),
                arrayOf(0, 1),
                arrayOf(2, 1),
                arrayOf(3, 1),
                arrayOf(4, 3)
        }));
    }

    @Test
    public void canFinish4() {
        final CourseScheduleSolution solution = new CourseScheduleSolution();
        assertTrue(solution.canFinish(5, new int[][]{
                arrayOf(1, 0),
                arrayOf(2, 1),
                arrayOf(3, 1),
                arrayOf(4, 3)
        }));
    }
}
