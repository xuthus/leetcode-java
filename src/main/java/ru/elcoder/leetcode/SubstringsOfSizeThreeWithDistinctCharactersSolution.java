package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1876,
        title = "Substrings of Size Three with Distinct Characters",
        url = "https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/"
)
public class SubstringsOfSizeThreeWithDistinctCharactersSolution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() - 2; i++)
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2))
                cnt++;
        return cnt;
    }
}
