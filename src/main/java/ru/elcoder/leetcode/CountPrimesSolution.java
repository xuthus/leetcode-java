package ru.elcoder.leetcode;

/**
 * Created by xuthus on 17.05.2017.
 */
public class CountPrimesSolution {
    /*
    Count the number of prime numbers less than a non-negative number, n.
    https://leetcode.com/problems/count-primes/
     */

    public int countPrimes(int n) {
        byte[] nums = new byte[n];
        for (n = 2; n < nums.length / 2 + 1; n++)
            if (nums[n] == 0) {
                int num = n + n;
                while (num < nums.length) {
                    nums[num] = 1;
                    num += n;
                }
            }
        int cnt = 0;
        for (n = 2; n < nums.length; n++)
            if (nums[n] == 0)
                cnt++;
        return cnt;
    }
}
