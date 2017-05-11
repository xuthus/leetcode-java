package ru.elcoder.leetcode;

/**
 * Created by xuthus on 05.05.2017.
 */
public class StrStrSolution {
    /*
    Implement strStr().

    Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    https://leetcode.com/problems/implement-strstr
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length())
            return -1;
        if (needle.length() == 0)
            return 0;
        char[] hc = haystack.toCharArray();
        char[] nc = needle.toCharArray();
        int maxPos = hc.length - nc.length;
        for (int i = 0; i <= maxPos; i++) {
            if (hc[i] == nc[0]) {
                int j;
                for (j = 1; j < nc.length; j++)
                    if (hc[i + j] != nc[j])
                        break;
                if (j == nc.length)
                    return i;
            }
        }
        return -1;
    }
}
