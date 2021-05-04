package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 763,
        title = "Partition Labels",
        url = "https://leetcode.com/problems/partition-labels/"
)
public class PartitionLabelsSolution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new LinkedList<>();
        int[] right = new int[255];
        for (int i = S.length() - 1; i >= 0; i--)
            if (right[S.charAt(i)] == 0)
                right[S.charAt(i)] = i;
        int start = 0, end = -1;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, right[S.charAt(i)]);
            if (i >= end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
