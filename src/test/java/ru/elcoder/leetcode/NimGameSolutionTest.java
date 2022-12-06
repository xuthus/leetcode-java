package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class NimGameSolutionTest extends TestCase {

    public void testCanWinNim() {
        NimGameSolution solution = new NimGameSolution();

        boolean canWin = solution.canWinNim(4);

        assertThat(canWin).isFalse();

        canWin = solution.canWinNim(1);

        assertThat(canWin).isTrue();

        canWin = solution.canWinNim(2);

        assertThat(canWin).isTrue();

        canWin = solution.canWinNim(3);

        assertThat(canWin).isTrue();

        canWin = solution.canWinNim(5);

        assertThat(canWin).isTrue();

        canWin = solution.canWinNim(6);

        assertThat(canWin).isTrue();
    }
}