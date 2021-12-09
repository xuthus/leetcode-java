package ru.elcoder.stepik.algorithms.huffman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DecoderSolution {
    public static void main(String[] args) {
        final DecoderSolution solution = new DecoderSolution();

        Scanner scanner = new Scanner(System.in);
        final int k = scanner.nextInt();
        final int len = scanner.nextInt();
        scanner.nextLine();
        List<CharFrequency> chars = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String[] line = scanner.nextLine().split(":");
            chars.add(new CharFrequency(line[0].charAt(0), line[1].trim()));
        }
        final String encoded = scanner.nextLine();
        chars.sort(CharFrequency::compareTo);
        System.out.println(solution.decode(encoded, 0, chars));
    }

    public String decode(String encoded, int pos, List<CharFrequency> chars) {
        if (pos >= encoded.length()) {
            return "";
        }
        final StringBuilder builder = new StringBuilder();
        while (true) {
            builder.append(encoded.charAt(pos++));
            final int idx = Collections.binarySearch(chars, new CharFrequency('\0', builder.toString()));
            if (idx >= 0) {
                return chars.get(idx).c + decode(encoded, pos, chars);
            }
        }
    }

    static class CharFrequency implements Comparable<CharFrequency> {
        private char c;

        private String code;

        public CharFrequency(char c, String code) {
            this.c = c;
            this.code = code;
        }

        @Override
        public int compareTo(CharFrequency other) {
            return code.compareTo(other.code);
        }

        @Override
        public String toString() {
            return String.format("%s: %s", c, code);
        }
    }
}
