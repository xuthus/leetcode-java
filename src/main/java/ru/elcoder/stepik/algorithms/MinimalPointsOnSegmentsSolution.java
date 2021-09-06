package ru.elcoder.stepik.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimalPointsOnSegmentsSolution {
    public static void main(String[] args) {
        final MinimalPointsOnSegmentsSolution solution = new MinimalPointsOnSegmentsSolution();
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] segments = new int[n][];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            segments[i] = new int[]{a, b};
        }
        final int[] points = solution.minimalPoints(segments);
        System.out.println(points.length);
        System.out.println(IntStream.of(points).mapToObj(i -> i+"").collect(Collectors.joining(" ")));
    }

    int[] minimalPoints(int[][] segments) {
        Arrays.sort(segments, Comparator.comparingInt(s -> s[1]));
        List<Integer> points = new ArrayList<>();
        int last = segments[0][1];
        points.add(last);
        for (int i = 1; i < segments.length; i++) {
            if (last < segments[i][0]) {
                last = segments[i][1];
                points.add(last);
            }
        }
        return points.stream().mapToInt(value -> value).toArray();
    }
}
