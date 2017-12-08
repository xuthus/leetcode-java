package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

@Difficulty(DifficultyLevel.Hard)
@BeatsPercent(81.16)
public class WildcardMatchingOptimizationsSolution extends WildcardMatchingSolution {

    public boolean isMatch(String s, String p) {
        return testSubMatch(s, true, p, true);
    }

    boolean stringContainsMask(String s, String mask) {
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

    String leftToken(String mask) {
        for (int i = 0; i < mask.length(); i++) {
            if (mask.charAt(i) == '*') {
                if (i == 0)
                    return "*";
                else
                    return mask.substring(0, i);
            }
        }
        return mask;
    }

    String rightToken(String mask) {
        for (int i = mask.length() - 1; i >= 0; i--) {
            if (mask.charAt(i) == '*') {
                if (i == mask.length() - 1)
                    return "*";
                else
                    return mask.substring(i + 1);
            }
        }
        return mask;
    }

    boolean testSubMatch(String s, boolean leftStrict, String mask, boolean rightStrict) {
        if (mask == null)
            return false;
        if (mask.length() == 0) {
            return s.length() == 0 || (leftStrict ^ rightStrict);
        }
        String leftToken = leftToken(mask);
        if (leftToken.equals("*"))
            return testSubMatch(s, false, mask.substring(1), rightStrict);
        if (leftToken.equals(mask)) {
            boolean match = stringContainsMask(s, mask);
            if (match && leftStrict)
                match = startsWithMask(s, mask);
            if (match && rightStrict)
                match = endsWithMask(s, mask);
            if (match && leftStrict && rightStrict)
                match = equalsMask(s, mask);
            return match;
        }
        String rightToken = rightToken(mask);
        if (rightToken.equals("*"))
            return testSubMatch(s, leftStrict, mask.substring(0, mask.length() - 1), false);

        if (leftStrict)
            return startsWithMask(s, leftToken) && testSubMatch(s.substring(leftToken.length()), true, mask.substring(leftToken.length()), rightStrict);
        if (rightStrict)
            return endsWithMask(s, rightToken) && testSubMatch(s.substring(0, s.length() - rightToken.length()), leftStrict, mask.substring(0, mask.length() - rightToken.length()), true);

        // leftStrict == false && rightStrict == false
        if (mask.indexOf('*') < 0 && mask.indexOf('?') >= 0) {
            // случай bbb?ccc?ddd - ищем вхождение сканированием строки
            return stringContainsMask(s, mask);
        }

        int leftStart = indexOfMask(s, leftToken) + leftToken.length();
        if (leftStart < leftToken.length())
            return false;
        int rightStart = lastIndexOfMask(s, rightToken);
        if (rightStart < leftStart)
            return false;
        mask = mask.substring(leftToken.length(), mask.length() - rightToken.length());
        return testSubMatch(s.substring(leftStart, rightStart), true, mask, true);
    }

    boolean equalsMask(String s, String mask) {
        if (mask.length() != s.length())
            return false;
        for (int i = 0; i < mask.length(); i++)
            if (mask.charAt(i) != '?' && mask.charAt(i) != s.charAt(i))
                return false;
        return true;
    }

    int lastIndexOfMask(String s, String mask) {
        char[] chars = s.toCharArray();
        int lastPos = chars.length - mask.length();
        for (int i = lastPos; i >= 0; i--) {
            boolean found = true;
            for (int j = 0; j < mask.length(); j++) {
                if (mask.charAt(j) != '?' && mask.charAt(j) != chars[i + j]) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
        return -1;
    }

    int indexOfMask(String s, String mask) {
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
            if (found) return i;
        }
        return -1;
    }

    boolean endsWithMask(String s, String mask) {
        if (mask.length() > s.length())
            return false;
        for (int i = mask.length() - 1, j = s.length() - 1; i >= 0; i--, j--)
            if (mask.charAt(i) != '?' && mask.charAt(i) != s.charAt(j))
                return false;
        return true;
    }

    boolean startsWithMask(String s, String mask) {
        if (mask.length() > s.length())
            return false;
        for (int i = 0; i < mask.length(); i++)
            if (mask.charAt(i) != '?' && mask.charAt(i) != s.charAt(i))
                return false;
        return true;
    }
}
