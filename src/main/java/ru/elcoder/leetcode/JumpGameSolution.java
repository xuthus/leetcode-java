package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 55,
        title = "Jump Game",
        url = "https://leetcode.com/problems/jump-game/"
)
public class JumpGameSolution {
    public boolean canJump(int[] nums) {
        return isAccessible(nums, nums.length - 1, new HashMap<>());
    }

    private boolean isAccessible(int[] nums, int pos, Map<Integer, Boolean> memo) {
        if (pos == 0) {
            memo.put(pos, true);
            return true;
        }
        if (memo.containsKey(pos))
            return memo.get(pos);
        for (int i = pos - 1; i >= 0; i--)
            if (nums[i] + i >= pos) {
                boolean accessible = isAccessible(nums, i, memo);
                if (accessible) {
                    memo.put(pos, true);
                    return true;
                }
            }
        memo.put(pos, false);
        return false;
    }
}
