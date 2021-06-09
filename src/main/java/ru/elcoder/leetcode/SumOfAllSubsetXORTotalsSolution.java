package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1863,
        title = "Sum of All Subset XOR Totals",
        url = "https://leetcode.com/problems/sum-of-all-subset-xor-totals/"
)
public class SumOfAllSubsetXORTotalsSolution {
    public int subsetXORSum(int[] nums) {
        boolean[] include = new boolean[nums.length];
        return subsetXORSum(include, nums, 0);
    }

    public int subsetXORSum(boolean[] include, int[] nums, int pos) {
        if (pos >= include.length) {
            int total = 0;
            for (int i = 0; i < nums.length; i++)
                if (include[i])
                    total = total ^ nums[i];
            return total;
        }
        include[pos] = false;
        int sum = subsetXORSum(include, nums, pos + 1);
        include[pos] = true;
        return sum + subsetXORSum(include, nums, pos + 1);
    }
}
