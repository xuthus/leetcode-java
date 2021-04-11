package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Leetcode(
        number = 599,
        difficulty = DifficultyLevel.Easy,
        title = "Minimum Index Sum of Two Lists",
        url = "https://leetcode.com/problems/minimum-index-sum-of-two-lists/"
)
public class MinimumIndexSumOfTwoListsSolution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1 == null || list1.length == 0 || list2 == null || list2.length == 0) {
            return new String[0];
        }
        Map<String, Integer> positions = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            positions.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length && i <= min; i++) {
            Integer position = positions.get(list2[i]);
            if (position != null) {
                position = position + i;
                if (position < min) {
                    min = position;
                    result.clear();
                    result.add(list2[i]);
                } else if (position == min) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
