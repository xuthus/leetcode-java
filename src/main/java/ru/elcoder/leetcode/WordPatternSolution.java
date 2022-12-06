package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 290,
        title = "Word Pattern",
        url = "https://leetcode.com/problems/word-pattern/"
)
public class WordPatternSolution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> dictionary = new HashMap<>();
        Set<String> usedWords = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];
            if (dictionary.containsKey(patternChar)) {
                if (!dictionary.get(patternChar).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }
                dictionary.put(patternChar, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}
