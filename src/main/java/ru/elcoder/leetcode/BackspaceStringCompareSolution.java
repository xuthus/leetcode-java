package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 844,
        title = "Backspace String Compare",
        url = "https://leetcode.com/problems/backspace-string-compare/"
)
public class BackspaceStringCompareSolution {
    public boolean backspaceCompare(String s, String t) {
        return compact(s).equals(compact(t));
    }

    private String compact(String s) {
        int bs = 0;
        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (chars[i] == '#')
                bs++;
            else if (bs > 0) {
                chars[i] = '#';
                bs--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars)
            if (c != '#')
                sb.append(c);
        return sb.toString();
    }
}
