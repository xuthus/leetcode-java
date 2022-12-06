package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 374,
        title = "Guess Number Higher or Lower",
        url = "https://leetcode.com/problems/guess-number-higher-or-lower/"
)
public class GuessNumberHigherOrLowerSolution {
    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */
    public int guessNumber(int n) {
        return guessNumber(1, n);
    }

    private int guessNumber(long min, long max) {
        int attempt = (int) ((min + max) >> 1);
        int result = guess(attempt);
        switch (result) {
            case 0:
                return attempt;
            case -1:  // less
                return guessNumber(min, attempt - 1);
            case 1:
                return guessNumber(attempt + 1, max);
        }
        return 0;
    }

    protected int guess(int n) {
        return -1;
    }
}
