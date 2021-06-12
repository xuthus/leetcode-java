package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1844,
        title = "Replace All Digits with Characters",
        url = "https://leetcode.com/problems/replace-all-digits-with-characters/"
)
public class ReplaceAllDigitsWithCharactersSolution {
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i += 2)
            chars[i + 1] = (char) (chars[i] + chars[i + 1] - '0');
        return new String(chars);
    }
}
