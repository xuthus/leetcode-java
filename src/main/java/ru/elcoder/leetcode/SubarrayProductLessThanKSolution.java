package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 713,
        title = "Subarray Product Less Than K",
        url = "https://leetcode.com/problems/subarray-product-less-than-k/"
)
public class SubarrayProductLessThanKSolution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return lessThan(nums, 0, k, new HashMap<>(), new HashMap<>());
    }

    private int lessThan(int[] nums, int pos, int k, Map<Integer, Integer> memo, Map<Long, Integer> memo2) {
        if (pos >= nums.length)
            return 0;
        if (memo.containsKey(pos))
            return memo.get(pos);
        int res = startingWith(nums, pos, k, 1, memo2)
                + lessThan(nums, pos + 1, k, memo, memo2);
        memo.put(pos, res);
        return res;
    }

    private int startingWith(int[] nums, int pos, int k, int prod, Map<Long, Integer> memo) {
        if (pos >= nums.length)
            return 0;
        long key = (((long)prod) << 16) + pos;
        if (memo.containsKey(key))
            return memo.get(key);
        prod = nums[pos] * prod;
        int res = 0;
        if (prod < k)
            res = 1 + startingWith(nums, pos + 1, k, prod, memo);
        memo.put(key, res);
        return res;
    }
}
