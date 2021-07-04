package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 29,
        title = "Divide Two Integers",
        url = "https://leetcode.com/problems/divide-two-integers/"
)
public class DivideTwoIntegersSolution {
    public int divide(int dividend, int divisor) {
        long res = 0;
        long ldividend = -neg(dividend);
        long ldivisor = -neg(divisor);
        int sign = dividend < 0 ? -1 : 1;
        sign = divisor < 0 ? -sign : sign;
        while (ldividend >= ldivisor) {
            int shift = 0;
            while (ldividend >= (ldivisor << shift))
                shift++;
            shift--;
            res += (1L << shift);
            ldividend = ldividend - (ldivisor << shift);
        }
        res = sign < 0 ? -res : res;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        return (int) res;
    }

    private long neg(long n) {
        return n < 0 ? n : -n;
    }
}
