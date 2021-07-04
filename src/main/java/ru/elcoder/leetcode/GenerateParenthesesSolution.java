package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 22,
        title = "Generate Parentheses",
        url = "https://leetcode.com/problems/generate-parentheses/"
)
public class GenerateParenthesesSolution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        char[] chars = new char[n << 1];
        addStrings(res, chars, 0, 0);
        return res;
    }

    private void addStrings(List<String> list, char[] chars, int pos, int sum) {
        if (sum > (chars.length - sum) || sum < 0)
            return;
        if (pos == chars.length && sum == 0)
            list.add(new String(chars));
        if (pos < chars.length) {
            chars[pos] = '(';
            addStrings(list, chars, pos + 1, sum + 1);
            chars[pos] = ')';
            addStrings(list, chars, pos + 1, sum - 1);
        }
    }
}
