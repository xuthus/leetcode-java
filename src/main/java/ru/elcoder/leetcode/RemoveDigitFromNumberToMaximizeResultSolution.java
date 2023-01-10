package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 2259,
        title = "Remove Digit From Number to Maximize Result",
        url = "https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/"
)
public class RemoveDigitFromNumberToMaximizeResultSolution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number.length());
        int lastIndex = -1;
        for (int i = 0; i < number.length(); i++) {
            char d = number.charAt(i);
            if (d == digit) {
                lastIndex = i;
                if ((i == (number.length() - 1) || d < number.charAt(i + 1))) {
                    for (int j = i + 1; j < number.length(); j++) {
                        sb.append(number.charAt(j));
                    }
                    break;
                }
            }
            sb.append(d);
        }
        if (lastIndex > -1 && sb.length() == number.length()) {
            sb.deleteCharAt(lastIndex);
        }
        return sb.toString();
    }
}
