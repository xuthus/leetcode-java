package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 40,
        title = "Combination Sum II",
        url = "https://leetcode.com/problems/combination-sum-ii/"
)
public class CombinationSumIISolution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new LinkedList<>();
        findCombinations(target, res, candidates, 0, new ArrayList<>());
        return res;
    }

    private void findCombinations(int target, List<List<Integer>> res, int[] candidates, int pos, List<Integer> numbers) {
        for (int i = pos; i < candidates.length; i++) {
            if (i > pos && candidates[i] == candidates[i - 1])
                continue;
            if (target == candidates[i]) {
                numbers.add(candidates[i]);
                res.add(new ArrayList<>(numbers));
                numbers.remove(numbers.size() - 1);
                continue;
            }
            if (target < candidates[i])
                break;
            numbers.add(candidates[i]);
            findCombinations(target - candidates[i], res, candidates, i + 1, numbers);
            numbers.remove(numbers.size() - 1);
        }
    }
}
