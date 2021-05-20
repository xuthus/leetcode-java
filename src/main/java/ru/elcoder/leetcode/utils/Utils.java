package ru.elcoder.leetcode.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
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

    public static String repeatChar(char c, int len) {
        final StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static int[] toIntArray(List<Integer> integers) {
        return integers.stream().mapToInt(i -> i).toArray();
    }

    public static String readStringFromResources(String resourceName) {
        byte[] buf = new byte[1024];
        try (
                InputStream in = Utils.class.getClassLoader().getResourceAsStream(resourceName);
                ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {
            int read;
            while ((read = in.read(buf)) > 0) {
                baos.write(buf, 0, read);
            }
            return baos.toString();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
