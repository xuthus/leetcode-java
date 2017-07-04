package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 04.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(15.05)
public class NumberOf1BitsSolution {
    /*
    Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as
    the Hamming weight).
    For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function
    should return 3.

    https://leetcode.com/problems/number-of-1-bits/
    */

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        n = ((n & 0b10101010101010101010101010101010) >>> 1) + (n & 0b01010101010101010101010101010101);
        n = ((n & 0b11001100110011001100110011001100) >>> 2) + (n & 0b00110011001100110011001100110011);
        n = ((n & 0xF0F0F0F0) >>> 4) + (n & 0x0F0F0F0F);
        n = ((n & 0xFF00FF00) >>> 8) + (n & 0x00FF00FF);
        n = (n >>> 16) + (n & 0xFFFF);
        return n;
    }
}
