package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 495,
        title = "Teemo Attacking",
        url = "https://leetcode.com/problems/teemo-attacking/"
)
public class TeemoAttackingSolution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisoned = 0;
        int prevEnd = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            int attack = timeSeries[i];
            if (prevEnd > attack) {
                poisoned += attack - prevEnd + duration;
            } else {
                poisoned += duration;
            }
            prevEnd = attack + duration;
        }

        return poisoned;
    }
}
