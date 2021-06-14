package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1826,
        title = "Faulty Sensor",
        url = "https://leetcode.com/problems/faulty-sensor/"
)
public class FaultySensorSolution {
    public int badSensor(int[] sensor1, int[] sensor2) {
        for (int i = 0; i < sensor1.length; i++)
            if (sensor1[i] != sensor2[i]) {
                for (int j = i + 1; j < sensor2.length; j++)
                    if (sensor1[j - 1] != sensor2[j])
                        return 2;
                for (int j = i + 1; j < sensor2.length; j++)
                    if (sensor1[j] != sensor2[j-1])
                        return 1;
                return -1;
            }
        return -1;
    }
}
