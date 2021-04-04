package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 392,
        title = "Is Subsequence",
        url = "https://leetcode.com/problems/is-subsequence/"
)
public class IsSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        final int i = t.indexOf(s.charAt(0));
        return i >= 0 && isSubsequence(s.substring(1), t.substring(i + 1));
    }
}
