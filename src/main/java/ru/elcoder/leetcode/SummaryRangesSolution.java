package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 228,
        title = "Summary Ranges",
        url = "https://leetcode.com/problems/summary-ranges/"
)
public class SummaryRangesSolution {
    public List<String> summaryRanges(int[] nums) {
        int p1 = 0;
        final LinkedList<String> result = new LinkedList<>();
        while (p1 < nums.length) {
            int p2 = p1;
            while (p2 - p1 == nums[p2] - nums[p1]) {
                p2++;
                if (p2 == nums.length) {
                    break;
                }
            }
            addRange(result, nums, p1, p2 - 1);
            p1 = p2;
        }
        return result;
    }

    private void addRange(List<String> result, int[] nums, int p1, int p2) {
        if (p1 == p2) {
            result.add(Integer.toString(nums[p1]));
        } else {
            result.add(nums[p1] + "->" + nums[p2]);
        }
    }
}
