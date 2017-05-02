package ru.elcoder.leetcode;

/**
 * Created by xuthus on 27.04.2017.
 */
public class ValidNumberSolution {

    public boolean isNumber(String s) {
        if (s == null || s.length() == 0 || s.trim().length() == 0)
            return false;

        s = s.toLowerCase().trim();

        if (s.indexOf('e') == -1)
            return isReal(s);

        if (s.endsWith("e") || (s.indexOf('e') != s.lastIndexOf('e')))
            return false;
        String[] parts = s.trim().split("e");
        if (parts.length != 2)
            return false;
        return isReal(parts[0]) && (parts.length == 1 || isSignedInteger(parts[1], false));
    }

    public boolean isReal(String s) {
        if (s == null || s.trim().length() == 0)
            return false;
        if (s.indexOf('.') == -1)  // 3
            return isSignedInteger(s, false);
        if (s.charAt(0) == '.')  // .3
            return isInteger(s.substring(1));
        if (s.indexOf('.') != s.lastIndexOf('.'))
            return false;
        String[] parts = s.split("\\.");
        if (parts.length > 2) // 3.3.3
            return false;
        return isSignedInteger(parts[0], parts.length == 2) && (parts.length == 1 || isInteger(parts[1]));
    }

    public boolean isInteger(String s) {
        if (s == null || s.trim().length() == 0)
            return false;
        char[] ch = s.toCharArray();
        int pos = 0;
        long result = 0;
        while (pos < ch.length) {
            if (!between(ch[pos], '0', '9'))
                return false;
            result = result * 10 + ch[pos] - '0';
            if (result > (Long.MAX_VALUE / 10))
                return false;
            pos++;
        }
        return true;
    }

    public boolean isSignedInteger(String s, boolean canBeEmpty) {
        if (s == null || s.trim().length() == 0)
            return false;
        char[] ch = s.toCharArray();
        int pos = 0;
        if (ch[pos] == '+' || ch[pos] == '-') pos++;
        if (pos >= ch.length && !canBeEmpty)
            return false;
        long result = 0;
        while (pos < ch.length) {
            if (!between(ch[pos], '0', '9'))
                return false;
            result = result * 10 + ch[pos] - '0';
            if (result > (Long.MAX_VALUE / 10))
                return false;
            pos++;
        }
        return true;
    }

    private boolean between(char c, char fromCh, char toCh) {
        return c >= fromCh && c <= toCh;
    }
}
