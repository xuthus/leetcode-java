package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * <pre>
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *      Input: strs = ["flower","flow","flight"]
 *      Output: "fl"
 *
 * Example 2:
 *      Input: strs = ["dog","racecar","car"]
 *      Output: ""
 *      Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *
 *      0 <= strs.length <= 200
 *      0 <= strs[i].length <= 200
 *      strs[i] consists of only lower-case English letters.
 *
 * https://leetcode.com/problems/longest-common-prefix/
 * </pre>
 */
@Difficulty(DifficultyLevel.Easy)
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        if (strs.length > 1) {
            for (int i = 1; i < strs.length; i++) {
                prefix = findPrefix(prefix, strs[i]);
                if (prefix.length() == 0) {
                    return prefix;
                }
            }
        }
        return prefix;
    }

    private String findPrefix(String str1, String str2) {
        final int max = Math.min(str1.length(), str2.length());
        for (int i = 0; i < max; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, max);
    }
}
