package ru.elcoder.leetcode;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by xuthus on 05.05.2017.
 */
public class StrStrSolution {
    /*
    Implement strStr().

    Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    https://leetcode.com/problems/implement-strstr
     */

    public StringSearchAlgorithm algorithm = StringSearchAlgorithm.NAIVE;

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length())
            return -1;
        if (needle.length() == 0)
            return 0;

        switch (algorithm) {
            case NAIVE:
                return strStrNaive(haystack, needle);
            case HORSPOOL:
                return strStrUsingHorspool(haystack, needle);
            default:
                throw new NotImplementedException();
        }
    }

    private int strStrNaive(String haystack, String needle) {
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

    // search using Boyer–Moore–Horspool algorithm
    private int strStrUsingHorspool(String haystack, String needle) {
        char[] hc = haystack.toCharArray();
        char[] nc = needle.toCharArray();
        int[] shifts = new int[256];   // only ASCII symbols!
        for (int i = 0; i < nc.length - 1; i++) {
            shifts[nc[i]] = i + 1;
        }
        int maxPos = hc.length - nc.length;
        int ncLen = nc.length - 1;
        for (int i = 0; i <= maxPos; ) {
            for (int j = ncLen; j >= 0; j--) {
                char c = hc[i + j];
                if (c != nc[j]) {
                    i = i + (nc.length - shifts[c]);
                    break;
                }
                if (j == 0)
                    return i;
            }
        }
        return -1;
    }

    public enum StringSearchAlgorithm {
        NAIVE,
        HORSPOOL,
        BOYER_MOORE, // todo
        KNUTH_MORRIS_PRATT // todo
    }

}
