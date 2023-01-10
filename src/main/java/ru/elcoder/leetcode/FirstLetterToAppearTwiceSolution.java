package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashSet;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 2351,
        title = "First Letter to Appear Twice",
        url = "https://leetcode.com/problems/first-letter-to-appear-twice/"
)
public class FirstLetterToAppearTwiceSolution {
    public char repeatedCharacter(String s) {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!letters.add(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return '\0';
    }
}
