package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 724,
        title = "Find Pivot Index",
        url = "https://leetcode.com/problems/find-pivot-index/"
)
public class FindPivotIndexSolution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] sumRight = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }
        int sumLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft == sumRight[i]) {
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}
