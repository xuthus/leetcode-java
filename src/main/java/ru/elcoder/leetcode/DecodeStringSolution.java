package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 349,
        title = "Decode String",
        url = "https://leetcode.com/problems/decode-string/"
)
public class DecodeStringSolution {
    int pos;

    public String decodeString(String s) {
        pos = 0;
        return decodeSubstring(s);
    }

    public String decodeSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int len = 0;

        while (pos < s.length()) {
            char c = s.charAt(pos++);
            if (isDigit(c))
                len = addDigit(len, c);
            else if (isLetter(c))
                sb.append(c);
            else if (c == '[') {
                sb.append(repeat(decodeSubstring(s), len));
                len = 0;
            } else
                break;
        }
        return sb.toString();
    }

    boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    boolean isLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    int addDigit(int len, char c) {
        return len * 10 + (c - '0');
    }

    String repeat(String s, int count) {
        StringBuilder sb = new StringBuilder();
        while (count-- > 0) {
            sb.append(s);
        }
        return sb.toString();
    }
}
