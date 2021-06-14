package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1816,
        title = "Truncate Sentence",
        url = "https://leetcode.com/problems/truncate-sentence/"
)
public class TruncateSentenceSolution {
    public String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ') {
                k--;
                if (k == 0)
                    return s.substring(0, i);
            }
        return s;
    }
}
