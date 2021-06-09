package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1880,
        title = "Check if Word Equals Summation of Two Words",
        url = "https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/"
)
public class CheckIfWordEqualsSummationOfTwoWordsSolution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return strToInt(firstWord) + strToInt(secondWord) == strToInt(targetWord);
    }

    private int strToInt(String num) {
        int res = 0;
        for (int i = 0; i < num.length(); i++)
            res = (res * 10) + num.charAt(i) - 'a';
        return res;
    }
}
