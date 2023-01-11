package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 408,
        title = "Valid Word Abbreviation",
        url = "https://leetcode.com/problems/valid-word-abbreviation/"
)
public class ValidWordAbbreviationSolution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int cnt = 0;
        int subst = 0;
        for (int i = 0; i < abbr.length(); i++) {
            char c = abbr.charAt(i);
            if (c >= '0' && c <= '9') {
                if (subst == 0 && c == '0') {
                    return false;
                }
                subst = subst * 10 + c - '0';
            } else {
                if (subst > 0) {
                    cnt += subst;
                    subst = 0;
                }
                if (cnt >= word.length() || c != word.charAt(cnt)) {
                    return false;
                }
                cnt++;
            }
        }
        cnt += subst;
        return cnt == word.length();
    }
}
