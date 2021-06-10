package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1854,
        title = "Maximum Population Year",
        url = "https://leetcode.com/problems/maximum-population-year/"
)
public class MaximumPopulationYearSolution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];
        for (int[] person: logs) {
            population[person[0] - 1950]++;
            population[person[1] - 1950]--;
        }
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int maxYear = 0;
        for (int year = 0; year < population.length; year++) {
            curr += population[year];
            if (curr > max) {
                max = curr;
                maxYear = year + 1950;
            }
        }
        return maxYear;
    }
}
