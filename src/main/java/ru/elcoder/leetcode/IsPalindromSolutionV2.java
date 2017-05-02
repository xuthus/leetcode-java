package ru.elcoder.leetcode;

/**
 * Created by xuthus on 30.04.2017.
 */
public class IsPalindromSolutionV2 {

    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0 || x % 10 == 0)
            return false;
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return (x == y || x == y / 10);
    }
}
