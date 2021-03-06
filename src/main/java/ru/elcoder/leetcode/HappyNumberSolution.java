package ru.elcoder.leetcode;

import java.util.HashSet;

/**
 * Created by xuthus on 17.05.2017.
 */
public class HappyNumberSolution {
    /*
    Write an algorithm to determine if a number is "happy".

    A happy number is a number defined by the following process: Starting with any positive integer, replace
    the number by the sum of the squares of its digits, and repeat the process until the number equals 1
    (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for
    which this process ends in 1 are happy numbers.

    Example: 19 is a happy number

    1^2 + 9^2 = 82
    8^2 + 2^2 = 68
    6^2 + 8^2 = 100
    1^2 + 0^2 + 0^2 = 1
    https://leetcode.com/problems/happy-number/
     */
    public boolean isHappy(int n) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        while (n != 1) {
            int sum = 0;
            do {
                int d = n % 10;
                sum += d * d;
                n = n / 10;
            } while (n > 0);
            if (numbers.contains(sum))
                return false;
            numbers.add(sum);
            n = sum;
        }
        return true;
    }

}
