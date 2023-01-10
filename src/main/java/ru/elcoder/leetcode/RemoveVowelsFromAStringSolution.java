package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1119,
        title = "Remove Vowels from a String",
        url = "https://leetcode.com/problems/remove-vowels-from-a-string/"
)
public class RemoveVowelsFromAStringSolution {
    static boolean[] isVowel = new boolean[127];

    static {
        isVowel['a'] = true;
        for (char c : new char[]{'e', 'i', 'o', 'u'}) {
            isVowel[c] = true;
        }
    }

    public String removeVowels(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isVowel[c]) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
