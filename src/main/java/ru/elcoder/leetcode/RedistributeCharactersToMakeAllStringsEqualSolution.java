package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1897,
        title = "Redistribute Characters to Make All Strings Equal",
        url = "https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/"
)
public class RedistributeCharactersToMakeAllStringsEqualSolution {
    public boolean makeEqual(String[] words) {
        int[] chars = new int[127];
        int wlen = words.length;
        for (int i = 0; i < wlen; i++)
            for (int j = 0; j < words[i].length(); j++)
                chars[words[i].charAt(j)]++;

        for (int i = 0; i < chars.length; i++)
            if (chars[i] > 0 && chars[i] % wlen != 0)
                return false;
        return true;
    }
}
