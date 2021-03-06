package ru.elcoder.leetcode;


import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

@Difficulty(DifficultyLevel.Hard)
@BeatsPercent(46.34)
public class WildcardMatchingSolution {
    /*
    Implement wildcard pattern matching with support for '?' and '*'.

    '?' Matches any single character.
    '*' Matches any sequence of characters (including the empty sequence).

    The matching should cover the entire input string (not partial).

    The function prototype should be:
    bool isMatch(const char *s, const char *p)

    Some examples:
    isMatch("aa","a") → false
    isMatch("aa","aa") → true
    isMatch("aaa","aa") → false
    isMatch("aa", "*") → true
    isMatch("aa", "a*") → true
    isMatch("ab", "?*") → true
    isMatch("aab", "c*a*b") → false

    https://leetcode.com/problems/wildcard-matching/
    */
    public boolean isMatch(String s, String p) {
        return testSubMatch(s, true, p, true);
    }

    boolean testSubMatch(String s, boolean leftStrict, String mask, boolean rightStrict) {
//        System.out.println("testSubMatch(), s: " + s + ", leftStrict: " + (leftStrict ? "Y" : "N") + ", mask: " + mask + ", rightStrict: " + (rightStrict ? "Y" : "N"));
        if (mask == null)
            return false;
        if (mask.length() == 0) {
            return s.length() == 0 || (leftStrict ^ rightStrict);
        }
        String leftToken = leftToken(mask);
        if (leftToken.equals("*"))
            return testSubMatch(s, false, mask.substring(1), rightStrict);
        if (leftToken.equals("?"))
            return s.length() != 0 && testSubMatch(s.substring(1), leftStrict, mask.substring(1), rightStrict);
        if (leftToken.equals(mask)) {
            boolean match = s.contains(mask);
            if (match && leftStrict)
                match = match && s.startsWith(mask);
            if (match && rightStrict)
                match = match && s.endsWith(mask);
            if (match && leftStrict && rightStrict)
                match = match && s.equals(mask);
            return match;
        }
        String rightToken = rightToken(mask);
        if (rightToken.equals("*"))
            return testSubMatch(s, leftStrict, mask.substring(0, mask.length() - 1), false);
        if (rightToken.equals("?"))
            return s.length() != 0 && testSubMatch(s.substring(0, s.length() - 1), leftStrict, mask.substring(0, mask.length() - 1), rightStrict);

        if (leftStrict)
            return s.startsWith(leftToken) && testSubMatch(s.substring(leftToken.length()), true, mask.substring(leftToken.length()), rightStrict);
        if (rightStrict)
            return s.endsWith(rightToken) && testSubMatch(s.substring(0, s.length() - rightToken.length()), leftStrict, mask.substring(0, mask.length() - rightToken.length()), true);

        // leftStrict == false && rightStrict == false
        if (mask.indexOf('*') < 0 && mask.indexOf('?') >= 0) {
            // случай bbb?ccc?ddd - ищем вхождение сканированием строки
            return stringContainsMask(s, mask);
        }

        int leftStart = s.indexOf(leftToken) + leftToken.length();
        if (leftStart < leftToken.length())
            return false;
        int rightStart = s.lastIndexOf(rightToken);
        if (rightStart < leftStart)
            return false;
        mask = mask.substring(leftToken.length(), mask.length() - rightToken.length());
        return testSubMatch(s.substring(leftStart, rightStart), true, mask, true);
    }

    // случай bbb?ccc?ddd - ищем вхождение сканированием строки
    boolean stringContainsMask(String s, String mask) {
//        System.out.println("stringContainsMask(): s: " + s + ", mask: " + mask);
        char[] chars = s.toCharArray();
        int lastPos = chars.length - mask.length() + 1;
        for (int i = 0; i < lastPos; i++) {
            boolean found = true;
            for (int j = 0; j < mask.length(); j++) {
                if (mask.charAt(j) != '?' && mask.charAt(j) != chars[i + j]) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }
        return false;
    }

    String rightToken(String mask) {
        for (int i = mask.length() - 1; i >= 0; i--) {
            char c = mask.charAt(i);
            if (c == '*' || c == '?') {
                if (i == mask.length() - 1)
                    return c == '*' ? "*" : "?";
                else
                    return mask.substring(i + 1);
            }
        }
        return mask;
    }

    String leftToken(String mask) {
        for (int i = 0; i < mask.length(); i++) {
            char c = mask.charAt(i);
            if (c == '*' || c == '?') {
                if (i == 0)
                    return c == '*' ? "*" : "?";
                else
                    return mask.substring(0, i);
            }
        }
        return mask;
    }
}
