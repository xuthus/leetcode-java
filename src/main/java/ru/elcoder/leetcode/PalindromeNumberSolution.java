package ru.elcoder.leetcode;

/**
 * Created by xuthus on 03.05.2017.
 */
public class PalindromeNumberSolution {
    /*
    Determine whether an integer is a palindrome. Do this without extra space.
    https://leetcode.com/problems/palindrome-number/
    */
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0)
            return x == 0;
        int y = 0;  // extra space
        while (x > y) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return (x == y || x == y / 10);
    }
}
