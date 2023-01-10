package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 387,
        title = "First Unique Character in a String",
        url = "https://leetcode.com/problems/first-unique-character-in-a-string/"
)
public class FirstUniqueCharacterInAStringSolution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> pos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!pos.containsKey(s.charAt(i))) {
                pos.put(s.charAt(i), i);
            } else {
                pos.put(s.charAt(i), -1);
            }
        }
        int res = Integer.MAX_VALUE;
        Collection<Integer> poses = pos.values();
        for (int i : poses) {
            if (i != -1) {
                res = Math.min(res, i);
            }
        }
        if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;

    }
}
