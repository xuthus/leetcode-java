package ru.elcoder.leetcode;

import junit.framework.TestCase;
import ru.elcoder.leetcode.utils.Utils;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class DailyTemperaturesSolutionTest extends TestCase {

    public void testDailyTemperatures() {
        DailyTemperaturesSolution solution = new DailyTemperaturesSolution();

        assertThat(solution.dailyTemperatures(arrayOf(73, 74, 75, 71, 69, 72, 76, 73)))
                .containsExactly(1, 1, 4, 2, 1, 1, 0, 0);
        assertThat(solution.dailyTemperatures(arrayOf(73, 74, 75, 71, 69, 72, 76, 73, 76, 72, 69, 71, 75, 74, 73)))
                .containsExactly(1, 1, 4, 2, 1, 1, 0, 1, 0, 3, 1, 1, 0, 0, 0);
        assertThat(solution.dailyTemperatures(arrayOf(30, 40, 50, 60))).containsExactly(1, 1, 1, 0);
        assertThat(solution.dailyTemperatures(arrayOf(30, 40, 50))).containsExactly(1, 1, 0);
    }

    public void testDailyTemperaturesTime() {
        DailyTemperaturesSolution solution = new DailyTemperaturesSolution();
        int[] ints = Arrays.stream(Utils.readStringFromResources("temp.txt").split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        solution.dailyTemperatures(ints);
    }
}