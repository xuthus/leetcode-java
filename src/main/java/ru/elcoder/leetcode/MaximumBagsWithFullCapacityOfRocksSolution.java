package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 2279,
        title = "Maximum Bags With Full Capacity of Rocks",
        url = "https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/"
)
public class MaximumBagsWithFullCapacityOfRocksSolution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        // capacity = capacity - rocks
        for (int i = 0; i < capacity.length; i++)
            capacity[i] -= rocks[i];
        // sort capacity
        Arrays.sort(capacity);
        // fill from the least and count at the same time
        int res = 0;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] == 0) {
                res++;
            } else if (capacity[i] <= additionalRocks) {
                res++;
                additionalRocks -= capacity[i];
            } else {
                break;
            }
        }
        return res;
    }
}
