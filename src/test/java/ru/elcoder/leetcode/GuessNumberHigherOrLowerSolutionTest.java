package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class GuessNumberHigherOrLowerSolutionTest extends TestCase {

    public void testGuessApi() {
        MyGuessNumberHigherOrLowerSolution solution = new MyGuessNumberHigherOrLowerSolution(6);

        int result = solution.guess(7);

        assertThat(result).isEqualTo(-1);

        result = solution.guess(5);

        assertThat(result).isEqualTo(1);

        result = solution.guess(6);

        assertThat(result).isEqualTo(0);
    }

    public void testGuessNumber() {
        GuessNumberHigherOrLowerSolution solution = new MyGuessNumberHigherOrLowerSolution(6);

        int guess = solution.guessNumber(10);

        assertThat(guess).isEqualTo(6);

        guess = solution.guessNumber(6);

        assertThat(guess).isEqualTo(6);

        guess = solution.guessNumber(7);

        assertThat(guess).isEqualTo(6);

        solution = new MyGuessNumberHigherOrLowerSolution(1);

        guess = solution.guessNumber(10);

        assertThat(guess).isEqualTo(1);

        guess = solution.guessNumber(1);

        assertThat(guess).isEqualTo(1);

        solution = new MyGuessNumberHigherOrLowerSolution(1702766719);

        guess = solution.guessNumber(2126753390);

        assertThat(guess).isEqualTo(1702766719);
    }

    private static class MyGuessNumberHigherOrLowerSolution extends GuessNumberHigherOrLowerSolution {
        private final int guess;

        private MyGuessNumberHigherOrLowerSolution(int guess) {
            this.guess = guess;
        }

        @Override
        protected int guess(int n) {
            return Integer.compare(guess, n);
        }
    }
}