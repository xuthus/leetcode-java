package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashSet;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 217,
        title = "Contains Duplicate",
        url = "https://leetcode.com/problems/contains-duplicate/"
)
public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> counters = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!counters.add(num)) {
                return true;
            }
        }
        return false;
    }
}
