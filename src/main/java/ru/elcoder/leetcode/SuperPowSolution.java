package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 04.07.2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(56.15)
public class SuperPowSolution {
    private static int powerMod(int x, int power, int mod) {
        int result = 1;
        int mul = x % mod;
        while (power > 0) {
            if ((power & 1) == 1) {
                result = (result * mul) % mod;
            }
            mul = (mul * mul) % mod;
            power >>>= 1;
        }
        return result;
    }

    private static int powerModArray(int x, int[] power, int mod) {
        int mul = x % mod;
        int pow10 = mul;
        int result = powerMod(mul, power[power.length - 1], mod);
        for (int i = power.length - 2; i >= 0; i--) {
            pow10 = powerMod(pow10, 10, mod);
            result = result * powerMod(pow10, power[i], mod) % mod;
        }
        return result;
    }

    /*
    Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer
    given in the form of an array.

    Example1:
        a = 2
        b = [3]
        Result: 8
    Example2:
        a = 2
        b = [1,0]
        Result: 1024
    https://leetcode.com/problems/super-pow/
    */
    public int superPow(int a, int[] b) {
        return powerModArray(a, b, 1337);
    }
}
