package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 791,
        title = "Custom Sort String",
        url = "https://leetcode.com/problems/custom-sort-string/"
)
public class CustomSortStringSolution {
    public String customSortString(String order, String str) {
        if (order == null || order.length() == 0)
            return str;
        int[] pos = new int[26];
        char[] chars = order.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            pos[chars[i] - 'a'] = i + 1;  // all unordered characters will be before ordered
        }
        Character[] res = new Character[str.length()];
        int i = 0;
        for (char c : str.toCharArray()) {
            res[i++] = c;
        }
        Arrays.sort(res, Comparator.comparingInt(o -> pos[o - 'a']));
        final StringBuilder sb = new StringBuilder(res.length);
        for (Character c : res) {
            sb.append(c);
        }
        return sb.toString();
    }
}
