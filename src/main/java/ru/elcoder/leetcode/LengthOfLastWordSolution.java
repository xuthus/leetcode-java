package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * <pre>
 * Given a string s consists of some words separated by spaces, return the length of the last word in the string.
 * If the last word does not exist, return 0.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example 1:
 *   Input: s = "Hello World"
 *   Output: 5
 *
 * Example 2:
 *   Input: s = " "
 *   Output: 0
 *
 * Constraints:
 *   1 <= s.length <= 104
 *   s consists of only English letters and spaces ' '.
 * </pre>
 * https://leetcode.com/problems/length-of-last-word/
 */
@Difficulty(DifficultyLevel.Easy)
public class LengthOfLastWordSolution {

    /**
     * non-effective due to using regular expressions
     */
    public int lengthOfLastWordNaive(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        final String[] ss = s.split(" ");
        return ss.length > 0 ? ss[ss.length - 1].length() : 0;
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int lastNonBlankPosition = s.length() - 1;
        while (lastNonBlankPosition >= 0 && s.charAt(lastNonBlankPosition) == ' ') {
            lastNonBlankPosition--;
        }
        if (lastNonBlankPosition < 0) {
            return 0;
        }
        return lastNonBlankPosition - s.lastIndexOf(' ', lastNonBlankPosition);
    }
}
