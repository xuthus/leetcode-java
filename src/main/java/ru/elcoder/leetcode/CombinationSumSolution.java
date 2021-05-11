package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 39,
        title = "Combination Sum",
        url = "https://leetcode.com/problems/combination-sum/"
)
public class CombinationSumSolution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        findCombinations(candidates, target, list, 0);
        return list;
    }

    private void findCombinations(int[] candidates, int goal, List<List<Integer>> list, int start) {
        if (start >= candidates.length)
            return;
        for (int i = start; i < candidates.length; i++) {
            int target = goal;
            while (target > 0) {
                if (candidates[i] == target) {
                    list.add(Arrays.asList(target));
                    break;
                }
                if (candidates[i] > target) {
                    return;
                }
                target = target - candidates[i];
                List<List<Integer>> sublist = new ArrayList<>();
                findCombinations(candidates, target, sublist, start + 1);
                for (List<Integer> ints : sublist) {
                    List<Integer> res = new ArrayList<>(ints);
                    res.add(candidates[i]);
                    list.add(res);
                }
            }
        }
    }
}
