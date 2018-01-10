package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.Arrays;

@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(87.46)
public class LongestSubstringWithoutRepeatingCharactersSolution {
    /*
    Given a string, find the length of the longest substring without repeating characters.

    Examples:

    Given "abcabcbb", the answer is "abc", which the length is 3.

    Given "bbbbb", the answer is "b", with the length of 1.

    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

    https://leetcode.com/problems/longest-substring-without-repeating-characters/
    */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) return 0;
        int[] positions = new int[128];
        Arrays.fill(positions, -1);
        int maxLength = 0;
        int startPos = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (positions[ch] >= startPos) {
                int length = i - startPos;
                if (length > maxLength) {
                    maxLength = length;
                }
                startPos = positions[ch] + 1;
            }
            positions[ch] = i;
        }
        int length = s.length() - startPos;
        if (length > maxLength) {
            maxLength = length;
        }
        return maxLength;
    }

}
