package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.*;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 39,
        title = "Combination Sum",
        url = "https://leetcode.com/problems/combination-sum/"
)
public class CombinationSumSolution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinations(candidates, 0, target, new HashMap<>((target * candidates.length) << 4 ));
    }

    private List<List<Integer>> combinations(int[] candidates, int pos, int target, Map<Integer, List<List<Integer>>> memo) {
        if (pos >= candidates.length || target < candidates[pos])
            return Collections.emptyList();
        int key = (target << 10) + pos;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        LinkedList<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> numbers = new LinkedList<>();
        while (target > 0) {
            List<List<Integer>> res = combinations(candidates, pos + 1, target, memo);
            for (List<Integer> list : res) {
                List<Integer> newList = new LinkedList<>(numbers);
                newList.addAll(list);
                result.add(newList);
            }
            target -= candidates[pos];
            LinkedList<Integer> tmp = new LinkedList<>();
            tmp.add(candidates[pos]);
            tmp.addAll(numbers);
            numbers = tmp;
        }
        if (target == 0)
            result.add(numbers);
        memo.put(key, result);
        return result;
    }
}
