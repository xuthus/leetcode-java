package ru.elcoder.leetcode.utils;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static int[] arrayOf(int... nums) {
        return nums;
    }

    public static String[] arrayOf(String... strings) {
        return strings;
    }

    public static <T> List<T> listOf(T... items) {
        return Arrays.asList(items);
    }

}
