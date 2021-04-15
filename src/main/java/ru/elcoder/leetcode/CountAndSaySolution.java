package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 38,
        title = "Count and Say",
        url = "https://leetcode.com/problems/count-and-say/"
)
public class CountAndSaySolution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        return say(countAndSay(n - 1));
    }

    private String say(String number) {
        final StringBuilder sb = new StringBuilder();
        int p1 = 0;
        int p2 = p1 + 1;
        while (p2 < number.length()) {
            if (number.charAt(p2) != number.charAt(p1)) {
                sb.append(p2 - p1);
                sb.append(number.charAt(p1));
                p1 = p2;
            }
            p2++;
        }
        sb.append(p2 - p1);
        sb.append(number.charAt(p1));
        return sb.toString();
    }
}
