package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 504,
        title = "Base 7",
        url = "https://leetcode.com/problems/base-7/"
)
public class Base7Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int sign = num < 0 ? -1 : 1;
        num = sign * num;

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }
        if (sign == -1) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
