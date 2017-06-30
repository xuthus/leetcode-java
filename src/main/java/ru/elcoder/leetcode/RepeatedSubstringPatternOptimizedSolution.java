package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xuthus on 30.06.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(84.76)
public class RepeatedSubstringPatternOptimizedSolution {
    /*
    Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

    Example 1:
    Input: "abab"
    Output: True
    Explanation: It's the substring "ab" twice.

    Example 2:
    Input: "aba"
    Output: False

    Example 3:
    Input: "abcabcabcabc"
    Output: True
    Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)

    https://leetcode.com/problems/repeated-substring-pattern/
     */

    // will change len calculations -
    // from n = 2 to s.length while n < minPrevFoundDivisor do
    //     if (s.length % n == 0) {
    //         len = s.len / n;
    //         ...
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() <= 1) return false;

        int length = s.length();
        List<Integer> divisors = new LinkedList<>();
        int minLen = length;
        nextLen:
        for (int i = 2; i <= minLen; i++) {
            if (length % i == 0) {
                int len = length / i;
                minLen = len;
                for (Integer divisor : divisors) {
                    if (divisor % len == 0)
                        continue nextLen;
                }
                if (repeatedPattern(len, s))
                    return true;
                divisors.add(len);
            }
        }
        return false;
    }

    public boolean repeatedPattern(int len, String s) {
        for (int i = 0; i < len; i++) {
            int pos = len + i;
            while (pos < s.length()) {
                if (s.charAt(i) != s.charAt(pos))
                    return false;
                pos += len;
            }
        }
        return true;
    }
}
