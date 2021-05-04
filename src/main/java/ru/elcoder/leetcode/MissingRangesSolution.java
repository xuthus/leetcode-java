package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 163,
        title = "Missing Ranges",
        url = "https://leetcode.com/problems/missing-ranges/"
)
public class MissingRangesSolution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new LinkedList<>();
        if (nums.length == 0) {
            if (lower <= upper) addRange(result, lower, upper);
        } else {
            if (lower < nums[0]) addRange(result, lower, nums[0] - 1);
            for (int i = 0; i < nums.length - 1; i++)
                if (nums[i] + 1 < nums[i + 1]) addRange(result, nums[i] + 1, nums[i + 1] - 1);
            if (nums[nums.length - 1] < upper) addRange(result, nums[nums.length - 1] + 1, upper);
        }
        return result;
    }

    private void addRange(List<String> result, int lower, int upper) {
        if (lower > upper)
            return;
        if (lower == upper)
            result.add("" + lower);
        else
            result.add(Integer.toString(lower) + "->" + Integer.toString(upper));
    }
}
