package ru.elcoder.stepik.algorithms.huffman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * По данной непустой строке `s` длины не более 10^4, состоящей из строчных букв
 * латинского алфавита, постройте оптимальный беспрефиксный код.<br/>
 * 1. В первой строке выведите количество различных букв `k`, встречающихся в строке,
 * и размер получившейся закодированной строки.<br/>
 * 2. В следующих `k` строках запишите коды букв в формате "letter: code".<br/>
 * 3. В последней строке выведите закодированную строку.<br/>
 */
public class EncoderSolution {

    public static void main(String[] args) {
        final EncoderSolution solution = new EncoderSolution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (String line : solution.encode(str)) {
            System.out.println(line);
        }
    }

    public List<String> encode(String str) {
        final ArrayList<String> log = new ArrayList<>();
        final Map<Character, Integer> chars = new HashMap<>();
        for (char c : str.toCharArray()) {
            chars.merge(c, 1, Integer::sum);
        }
        final int k = chars.size();
        if (k == 0) {
            log.add("0 0");
            log.add("");
            return log;
        }
        PriorityQueue<CharPair> queue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            queue.offer(new CharPair(entry.getKey(), entry.getValue(), null, null));
        }
        CharPair root;
        while (true) {
            final CharPair ch1 = queue.poll();
            final CharPair ch2 = queue.poll();
            if (ch2 == null) {
                root = ch1;
                if (root.child0 == null) {
                    root.prefix = "1";
                }
                break;
            }
            ch1.parent = new CharPair('\0', ch1.count + ch2.count, ch1, ch2);
            ch2.parent = ch1.parent;
            queue.offer(ch1.parent);
        }

        // TODO: 12/9/2021 here better convert tree into hash map (char -> code), but Stepik accepted without this
        final StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray()) {
            res.append(encodeChar(c, root));
        }
        log.add(String.format("%s %s", k, res.length()));
        dumpTable(root, log);
        log.add(res.toString());
        return log;
    }

    private String encodeChar(char c, CharPair root) {
        if (root == null) {
            return null;
        }
        if (root.c == c) {
            return root.getCode();
        }
        String str = encodeChar(c, root.child0);
        if (str == null) {
            str = encodeChar(c, root.child1);
        }
        return str;
    }

    private void dumpTable(CharPair root, ArrayList<String> log) {
        if (root == null) {
            return;
        }
        if (root.child0 == null) {
            log.add(String.format("%s: %s", root.c, root.getCode()));
        } else {
            dumpTable(root.child0, log);
            dumpTable(root.child1, log);
        }
    }

    private static class CharPair implements Comparable<CharPair> {
        private final char c;

        private final int count;

        private final CharPair child0;

        private final CharPair child1;

        private CharPair parent;

        private String prefix = "";

        public CharPair(char c, int count, CharPair child0, CharPair child1) {
            this.c = c;
            this.count = count;
            this.child0 = child0;
            this.child1 = child1;
            if (child0 != null) {
                child0.prefix = "0";
            }
            if (child1 != null) {
                child1.prefix = "1";
            }
        }

        @Override
        public int compareTo(CharPair other) {
            final int compare = Integer.compare(this.count, other.count);
            return compare != 0 ? compare : Character.compare(this.c, other.c);
        }

        @Override
        public String toString() {
            return String.format("%s: %s", c, count);
        }

        public String getCode() {
            return (parent == null ? "" : parent.getCode()) + prefix;
        }
    }
}
