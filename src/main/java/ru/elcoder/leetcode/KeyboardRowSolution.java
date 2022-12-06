package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 500,
        title = "Keyboard Row",
        url = "https://leetcode.com/problems/keyboard-row/"
)
public class KeyboardRowSolution {

    private static final Map<Character, Integer> MAPPING;

    static {
        MAPPING = new HashMap<>(31);
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                MAPPING.put(c, i);
            }
        }
    }

    public String[] findWords(String[] words) {
        return Arrays.stream(words)
                .filter(this::canBeTypedInARow)
                .toArray(String[]::new);
    }

    private boolean canBeTypedInARow(String word) {
        if (word.length() <= 1) {
            return true;
        }
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        int row = MAPPING.get(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (MAPPING.get(c) != row) {
                return false;
            }
        }
        return true;
    }
}
