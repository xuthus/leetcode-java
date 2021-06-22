package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1904,
        title = "The Number of Full Rounds You Have Played",
        url = "https://leetcode.com/problems/the-number-of-full-rounds-you-have-played/"
)
public class TheNumberOfFullRoundsYouHavePlayedSolution {
    public int numberOfRounds(String startTime, String finishTime) {
        int startRound = toInt(startTime);
        int finishRound = toInt(finishTime);
        if (finishRound < startRound)
            finishRound += 24 * 60;
        startRound = startOfNearestRound(startRound, true);
        finishRound = startOfNearestRound(finishRound, false);
        if (finishRound < startRound)
            return 0;
        return (finishRound - startRound) / 15 + 1;
    }

    int toInt(String time) {
        int h = (time.charAt(0) - '0') * 10 + time.charAt(1) - '0';
        int m = (time.charAt(3) - '0') * 10 + time.charAt(4) - '0';
        return h * 60 + m;
    }

    int startOfNearestRound(int time, boolean start) {
        int m = time; // + (start ? 0 : -14);
        int res = m / 15 + (m % 15 == 0 && start ? 0 : 1) - (!start ? 2 : 0);
        return res * 15;
    }
}
