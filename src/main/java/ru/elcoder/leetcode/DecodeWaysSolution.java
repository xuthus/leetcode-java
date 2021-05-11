package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 91,
        title = "Decode Ways",
        url = "https://leetcode.com/problems/decode-ways/"
)
public class DecodeWaysSolution {
    public int numDecodings(String s) {
        return numDecodingsMemoized(s, 0, new HashMap<>());
    }

    private int numDecodingsMemoized(String s, int pos, Map<Integer, Integer> memo) {
        if (pos >= s.length())
            return 1;
        if (s.charAt(pos) == '0')
            return 0;
        if (pos == s.length() - 1)
            return 1;
        if (memo.containsKey(pos))
            return memo.get(pos);
        int result =
                numDecodingsMemoized(s, pos + 1, memo)
                        + (isValid2DigitsNumber(s, pos) ? numDecodingsMemoized(s, pos + 2, memo) : 0);
        memo.put(pos, result);
        return result;
    }

    private boolean isValid2DigitsNumber(String s, int pos) {
        int num = ((s.charAt(pos) - '1' + 1) * 10) + s.charAt(pos + 1) - '1' + 1;
        return num < 27;
    }
}
