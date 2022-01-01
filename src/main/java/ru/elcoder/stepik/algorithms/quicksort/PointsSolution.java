package ru.elcoder.stepik.algorithms.quicksort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PointsSolution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final Area[] areasFrom = new Area[n];
        for (int i = 0; i < n; i++) {
            areasFrom[i] = new Area(scanner.nextInt(), scanner.nextInt());
        }
        final Area[] areasTo = Arrays.copyOf(areasFrom, areasFrom.length);
        Arrays.sort(areasFrom, Comparator.comparingInt(o -> o.from));
        Arrays.sort(areasTo, Comparator.comparingInt(o -> o.to));

        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int point = scanner.nextInt();
            builder.append(owningAreasCount(point, areasFrom, areasTo)).append(' ');
        }

        System.out.println(builder.substring(0, builder.length() - 1));
    }

    public static int owningAreasCount(int point, Area[] areasFrom, Area[] areasTo) {
        int finished = searchFinishedQuick(point, areasTo);
        int started = searchStartedQuick(point, areasFrom);
        if (finished == -1 || started == -1) {
            return 0;
        }
        return started - finished;
    }

    public static int searchStartedQuick(int point, Area[] areas) {
        int l = 0;
        int r = areas.length - 1;
        if (areas[l].from > point) {
            return 0;
        }
        if (areas[r].from < point) {
            return r + 1;
        }
        while (l < r) {
            int m = (l + r) >> 1;
            if (areas[m].from > point) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return (areas[l].from > point) ? l : l + 1;
    }

    public static int searchFinishedQuick(int point, Area[] areas) {
        int l = 0;
        int r = areas.length - 1;
        if (areas[r].to < point) {
            return r + 1;
        }
        if (areas[l].to >= point) {
            return 0;
        }
        while (l < r) {
            int m = (l + r) >> 1;
            if (areas[m].to >= point) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return areas[l].to >= point ? l : l + 1;
    }

    static class Area {
        int from;

        int to;

        Area(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
