package ru.elcoder.leetcode;

/**
 * Created by xuthus on 30.04.2017.
 */
public class IsPalindromSolution {
    /*
    Determine whether an integer is a palindrome. Do this without extra space.
    https://leetcode.com/problems/palindrome-number/
    */
    public boolean isPalindrome(int x) {
        int t = x;
        if (x < 0)
            return false;
        long y = 0; //extra space
        while (x > 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return t == y;
    }
}
