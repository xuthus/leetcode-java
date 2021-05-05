package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1041,
        title = "Robot Bounded In Circle",
        url = "https://leetcode.com/problems/robot-bounded-in-circle/"
)
public class RobotBoundedInCircleSolution {
    public boolean isRobotBounded(String instructions) {
        int dx = 0;
        int dy = 1;
        int x = 0, y = 0, t = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < instructions.length(); j++)
                switch (instructions.charAt(j)) {
                    case 'G':
                        x += dx;
                        y += dy;
                        break;
                    case 'L':
                        if (dx == 0) {
                            dx = -dy;
                            dy = 0;
                        } else {
                            dy = dx;
                            dx = 0;
                        }
                        break;
                    case 'R':
                        if (dx == 0) {
                            dx = dy;
                            dy = 0;
                        } else {
                            dy = -dx;
                            dx = 0;
                        }
                        break;
                }
            if (x == 0 && y == 0)
                return true;
        }
        return false; // unreachable
    }
}
