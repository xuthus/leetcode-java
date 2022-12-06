package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 728,
        title = "Self Dividing Numbers",
        url = "https://leetcode.com/problems/self-dividing-numbers/"
)
public class SelfDividingNumbersSolution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isSelfDividing(int num) {
        int x = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || x % digit != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
