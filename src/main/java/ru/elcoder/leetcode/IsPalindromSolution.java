package ru.elcoder.leetcode;

/**
 * Created by xuthus on 30.04.2017.
 */
public class IsPalindromSolution {

    public boolean isPalindrome(int x) {
        int t = x;
        if (x < 0)
            return false;
        long y = 0;
        while (x > 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return t == y;
    }
}
