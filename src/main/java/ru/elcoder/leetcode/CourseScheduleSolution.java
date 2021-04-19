package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 207,
        title = "Course Schedule",
        url = "https://leetcode.com/problems/course-schedule/"
)
public class CourseScheduleSolution {
    // topological sort using BFS (Kahn's algorithm)
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] courses = new int[numCourses];
        int total = prerequisites.length;
        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            edges.computeIfAbsent(prerequisite[1], i -> new HashSet<>()).add(prerequisite[0]);
            courses[prerequisite[0]]++;
        }
        Queue<Integer> available = new LinkedList<>();
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == 0) {
                available.add(i);
            }
        }
        while (!available.isEmpty()) {
            final Integer course = available.poll();
            final Set<Integer> dependent = edges.get(course);
            if (dependent != null) {
                for (Integer depCourse : dependent) {
                    courses[depCourse]--;
                    total--;
                    if (courses[depCourse] == 0) {
                        available.add(depCourse);
                    }
                }
            }
        }
        return total == 0;
    }
}
