package ru.elcoder.stepik.algorithms.quicksort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.*;
import static ru.elcoder.stepik.algorithms.quicksort.PointsSolution.*;

public class PointsSolutionTest {

    @Test
    public void searchStarted() {
        final Area[] areas = new Area[5];
        areas[0] = new Area(1, 2);
        areas[1] = new Area(3, 4);
        areas[2] = new Area(5, 6);
        areas[3] = new Area(7, 8);
        areas[4] = new Area(9, 10);

        for (int i = 0; i < 12; i++) {
            assertEquals(searchStartedNaive(i, areas), PointsSolution.searchStartedQuick(i, areas));
        }
    }

    @Test
    public void searchFinished() {
        final Area[] areas = new Area[5];
        areas[0] = new Area(1, 2);
        areas[1] = new Area(3, 4);
        areas[2] = new Area(5, 6);
        areas[3] = new Area(7, 8);
        areas[4] = new Area(9, 10);

        assertEquals(searchFinishedNaive(4, areas), PointsSolution.searchFinishedQuick(4, areas));
        for (int i = 0; i < 12; i++) {
            System.out.println(i);
            assertEquals(searchFinishedNaive(i, areas), PointsSolution.searchFinishedQuick(i, areas));
        }
    }

    @Test
    public void owningAreasCount_1() {
        final Area[] areasFrom = new Area[1];
        areasFrom[0] = new Area(3, 7);

        final Area[] areasTo = prepareArrays(areasFrom);

        assertEquals(0, PointsSolution.owningAreasCount(10, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(1, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(5, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(3, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(7, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(8, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(2, areasFrom, areasTo));
    }

    @Test
    public void owningAreasCount_repeating() {
        final Area[] areasFrom = new Area[3];
        areasFrom[0] = new Area(3, 7);
        areasFrom[1] = new Area(3, 7);
        areasFrom[2] = new Area(3, 7);

        final Area[] areasTo = prepareArrays(areasFrom);

        assertEquals(0, PointsSolution.owningAreasCount(10, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(1, areasFrom, areasTo));
        assertEquals(3, PointsSolution.owningAreasCount(5, areasFrom, areasTo));
        assertEquals(3, PointsSolution.owningAreasCount(3, areasFrom, areasTo));
        assertEquals(3, PointsSolution.owningAreasCount(7, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(8, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(2, areasFrom, areasTo));
    }

    @Test
    public void owningAreasCount_2() {
        final Area[] areasFrom = new Area[2];
        areasFrom[0] = new Area(3, 7);
        areasFrom[1] = new Area(9, 10);

        final Area[] areasTo = prepareArrays(areasFrom);

        assertEquals(1, PointsSolution.owningAreasCount(10, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(1, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(5, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(3, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(7, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(8, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(2, areasFrom, areasTo));
    }

    @Test
    public void owningAreasCount_2_overlapping() {
        final Area[] areasFrom = new Area[2];
        areasFrom[0] = new Area(3, 9);
        areasFrom[1] = new Area(7, 10);

        final Area[] areasTo = prepareArrays(areasFrom);

        assertEquals(1, PointsSolution.owningAreasCount(10, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(1, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(5, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(3, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(7, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(8, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(9, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(2, areasFrom, areasTo));
    }

    @Test
    public void owningAreasCount_2_touching() {
        final Area[] areasFrom = new Area[2];
        areasFrom[0] = new Area(3, 8);
        areasFrom[1] = new Area(8, 10);

        final Area[] areasTo = prepareArrays(areasFrom);

        assertEquals(1, PointsSolution.owningAreasCount(10, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(1, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(5, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(3, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(7, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(8, areasFrom, areasTo));
        assertEquals(1, PointsSolution.owningAreasCount(9, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(2, areasFrom, areasTo));
    }

    @Test
    public void owningAreasCount_2_touching_repeating() {
        final Area[] areasFrom = new Area[4];
        areasFrom[0] = new Area(3, 8);
        areasFrom[1] = new Area(8, 10);
        areasFrom[2] = new Area(3, 8);
        areasFrom[3] = new Area(8, 10);

        final Area[] areasTo = prepareArrays(areasFrom);

        assertEquals(2, PointsSolution.owningAreasCount(10, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(1, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(5, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(3, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(7, areasFrom, areasTo));
        assertEquals(4, PointsSolution.owningAreasCount(8, areasFrom, areasTo));
        assertEquals(2, PointsSolution.owningAreasCount(9, areasFrom, areasTo));
        assertEquals(0, PointsSolution.owningAreasCount(2, areasFrom, areasTo));
    }

    public static int searchStartedNaive(int point, Area[] areas) {
        // naive scan
        for (int i = 0; i < areas.length; i++) {
            if (areas[i].from > point) {
                return i;
            }
        }
        return areas.length;
    }

    public static int searchFinishedNaive(int point, Area[] areas) {
        // naive scan
        for (int i = areas.length - 1; i >= 0; i--) {
            if (areas[i].to < point) {
                return i + 1;
            }
        }
        return 0;
    }

    private Area[] prepareArrays(Area[] areasFrom) {
        final Area[] areasTo = Arrays.copyOf(areasFrom, areasFrom.length);
        Arrays.sort(areasFrom, Comparator.comparingInt(o -> o.from));
        Arrays.sort(areasTo, Comparator.comparingInt(o -> o.to));
        return areasTo;
    }
}