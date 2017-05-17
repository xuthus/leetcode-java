package ru.elcoder.leetcode;

/**
 * Created by xuthus on 17.05.2017.
 */
public class AddDigitsSolution {
    /*
    Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

    For example:

    Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

    Follow up:
    Could you do it without any loop/recursion in O(1) runtime?
    https://leetcode.com/problems/add-digits/
     */
    public int addDigits(int num) {
        return num > 10 ? addDigits(num / 10 + num % 10) : num;
    }

    // with hints ))
    public int addDigitsVedic(int num) {
        num %= 9;
        return num == 0 ? 9 : num;
    }
}
