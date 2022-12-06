package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 292,
        title = "Nim Game",
        url = "https://leetcode.com/problems/nim-game/"
)
public class NimGameSolution {
    public boolean canWinNim(int n) {
        return n % 4 != 0; // ¯\_(ツ)_/¯
    }
}
