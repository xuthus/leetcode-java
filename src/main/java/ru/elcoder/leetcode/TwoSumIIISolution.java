package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 170,
        title = "Two Sum III - Data structure design",
        url = "https://leetcode.com/problems/two-sum-iii-data-structure-design/"
)
public class TwoSumIIISolution {
    char[] nums = new char[200_000 + 1];

    /**
     * Initialize your data structure here.
     */
    public TwoSumIIISolution() {

    }

    /**
     * Add the number to an internal data structure..
     */
    public void add(int number) {
        nums[number + 100_000]++;
    }

    /**
     * Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        value = value + 200_000;
        for (int i = 0; i <= 200_000; i++)
            if (nums[i] > 0 && (value - i) >= 0 && (value - i) < 200_001 && nums[value - i] > 0) {
                if (i == value - i)
                    if (nums[i] > 1)
                        return true;
                    else
                        continue;
                return true;
            }
        return false;
    }
}
