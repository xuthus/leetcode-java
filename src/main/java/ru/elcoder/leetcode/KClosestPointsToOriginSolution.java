package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.PriorityQueue;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 973,
        title = "K Closest Points to Origin",
        url = "https://leetcode.com/problems/k-closest-points-to-origin/"
)
public class KClosestPointsToOriginSolution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> nearest = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.distance, p1.distance));
        for (int[] point : points) {
            nearest.offer(new Point(point[0], point[1]));
            if (nearest.size() > k)
                nearest.poll();
        }
        int[][] res = new int[k][];
        int i = 0;
        while (!nearest.isEmpty()) {
            Point point = nearest.poll();
            res[i++] = new int[]{point.x, point.y};
        }
        return res;
    }

    static class Point {
        int x;

        int y;

        int distance;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.distance = x * x + y * y;
        }
    }
}
