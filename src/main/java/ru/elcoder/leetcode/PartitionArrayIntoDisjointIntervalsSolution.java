package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 915,
        title = "Partition Array into Disjoint Intervals",
        url = "https://leetcode.com/problems/partition-array-into-disjoint-intervals/"
)
public class PartitionArrayIntoDisjointIntervalsSolution {
    public int partitionDisjoint(int[] nums) {
        // 2 <= nums.length <= 30000, so no corner case!
        int[] mins = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for (int i = nums.length - 2; i >= 0; i--) {
            min = Math.min(min, nums[i + 1]);
            mins[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (max <= mins[i]) {
                if (i < nums.length - 1)
                    return i + 1;
                return nums.length;
            }
        }
        return -1;
    }
}
