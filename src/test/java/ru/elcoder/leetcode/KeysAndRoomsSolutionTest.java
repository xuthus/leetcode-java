package ru.elcoder.leetcode;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class KeysAndRoomsSolutionTest extends TestCase {

    public void testCanVisitAllRooms() {
        KeysAndRoomsSolution solution = new KeysAndRoomsSolution();

        assertThat(solution.canVisitAllRooms(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Collections.emptyList()
        ))).isTrue();
        assertThat(solution.canVisitAllRooms(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 0, 1),
                Arrays.asList(2),
                Arrays.asList(0)
        ))).isFalse();
        assertThat(solution.canVisitAllRooms(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 0, 1),
                Arrays.asList(2),
                Arrays.asList(0,2)
        ))).isTrue();
    }
}