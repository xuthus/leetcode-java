package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class PathSumIISolutionTest {

    @Test
    public void pathSum1() {
        final PathSumIISolution solution = new PathSumIISolution();
        final List<List<Integer>> paths = solution.pathSum(new TreeNode(5), 5);
        assertEquals(1, paths.size());
        assertArrayEquals(arrayOf(5), paths.get(0).stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void pathSum2() {
        final PathSumIISolution solution = new PathSumIISolution();
        final List<List<Integer>> paths = solution.pathSum(
                new TreeNode(5,
                        new TreeNode(10),
                        null),
                5);
        assertEquals(0, paths.size());
    }

    @Test
    public void pathSum3() {
        final PathSumIISolution solution = new PathSumIISolution();
        final List<List<Integer>> paths = solution.pathSum(
                new TreeNode(5,
                        new TreeNode(10),
                        null),
                15);
        assertEquals(1, paths.size());
        assertArrayEquals(arrayOf(5, 10), paths.get(0).stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void pathSum4() {
        final PathSumIISolution solution = new PathSumIISolution();
        final List<List<Integer>> paths = solution.pathSum(
                new TreeNode(5,
                        new TreeNode(10, null, new TreeNode(18)),
                        new TreeNode(20,
                                new TreeNode(7),
                                new TreeNode(8))),
                33);
        assertEquals(2, paths.size());
        assertArrayEquals(arrayOf(5, 10, 18), paths.get(0).stream().mapToInt(i -> i).toArray());
        assertArrayEquals(arrayOf(5, 20, 8), paths.get(1).stream().mapToInt(i -> i).toArray());
    }
}