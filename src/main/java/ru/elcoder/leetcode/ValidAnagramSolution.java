package ru.elcoder.leetcode;

import java.util.Arrays;

/**
 * Created by xuthus on 03.05.2017.
 */
public class ValidAnagramSolution {
    /*
    Given two strings s and t, write a function to determine if t is an anagram of s.

    For example,
    s = "anagram", t = "nagaram", return true.
    s = "rat", t = "car", return false.

    Note:
    You may assume the string contains only lowercase alphabets.

    Follow up:
    What if the inputs contain unicode characters? How would you adapt your solution to such case?
     */

    /*
    My solution works slower than most others solutions,
    but it works with codepoints - characters occupying more than 1 char (2 bytes), for example emoticons symbols
     */
    public boolean isAnagram(String s, String t) {
        return Arrays.equals(sortCodepoints(s), sortCodepoints(t));
    }

    private int[] sortCodepoints(String str) {
        if (str == null)
            return new int[0];
        int[] points = str.codePoints().toArray();
        Arrays.sort(points);
        return points;
    }
}
