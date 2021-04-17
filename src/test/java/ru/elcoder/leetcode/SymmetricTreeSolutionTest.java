package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SymmetricTreeSolutionTest {

    @Test
    public void isSymmetric1() {
        final SymmetricTreeSolution solution = new SymmetricTreeSolution();
        assertTrue(solution.isSymmetric(new TreeNode(10)));
    }

    @Test
    public void isSymmetric2() {
        final SymmetricTreeSolution solution = new SymmetricTreeSolution();
        assertTrue(solution.isSymmetric(
                new TreeNode(10,
                        new TreeNode(5),
                        new TreeNode(5)
                )
        ));
    }

    @Test
    public void isSymmetric3() {
        final SymmetricTreeSolution solution = new SymmetricTreeSolution();
        assertFalse(solution.isSymmetric(
                new TreeNode(10,
                        new TreeNode(4),
                        new TreeNode(5)
                )
        ));
    }

    @Test
    public void isSymmetric4() {
        final SymmetricTreeSolution solution = new SymmetricTreeSolution();
        assertFalse(solution.isSymmetric(
                new TreeNode(10,
                        new TreeNode(5,
                                null,
                                new TreeNode(10)
                        ),
                        new TreeNode(5,
                                null,
                                new TreeNode(10)
                        )
                )
        ));
    }

    @Test
    public void isSymmetric5() {
        final SymmetricTreeSolution solution = new SymmetricTreeSolution();
        assertTrue(solution.isSymmetric(
                new TreeNode(10,
                        new TreeNode(5,
                                null,
                                new TreeNode(10)
                        ),
                        new TreeNode(5,
                                new TreeNode(10),
                                null
                        )
                )
        ));
    }
}