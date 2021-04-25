package ru.elcoder.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class OddEvenJumpsSolution {
    public int oddEvenJumps(int[] arr) {
        TreeMap<Integer, Integer> positions = new TreeMap<>();
        positions.put(arr[arr.length - 1], arr.length - 1);
        boolean[] odds = new boolean[arr.length];
        boolean[] evens = new boolean[arr.length];
        odds[odds.length - 1] = true;
        evens[evens.length - 1] = true;
        for (int i = arr.length - 2; i >= 0; i--) {  // O(N)
            final Map.Entry<Integer, Integer> ceil = positions.ceilingEntry(arr[i]);  // O(logN)
            final Map.Entry<Integer, Integer> floor = positions.floorEntry(arr[i]);   // O(logN)
            if (ceil != null) odds[i] = evens[ceil.getValue()];
            if (floor != null) evens[i] = odds[floor.getValue()];
            positions.put(arr[i], i);
        }
        int good = 0;
        for (boolean odd : odds)
            if (odd) good++;
        return good;
    }
}
