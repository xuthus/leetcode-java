package ru.elcoder.leetcode;

public class ExpressiveWordsSolution {
    public int expressiveWords(String S, String[] words) {
        char[] chars = S.toCharArray();
        char[] counts = new char[chars.length << 1];
        char lastChar = '*';
        char count = 0;
        int i = 0;
        int result = 0;
        for (char c : chars) {
            if (c != lastChar) {
                if (count > 0) {
                    counts[i++] = lastChar;
                    counts[i++] = count;
                }
                lastChar = c;
                count = 0;
            }
            count++;
        }
        counts[i++] = lastChar;
        counts[i] = count;
        int lastI = i;
        for (String word : words) {
            lastChar = '*';
            count = 0;
            i = 0;
            chars = word.toCharArray();
            boolean skip = false;
            for (char c : chars) {
                if (c != lastChar) {
                    if (count > 0) {
                        if (counts[i++] != lastChar) {
                            skip = true;
                            break;
                        }
                        char need = counts[i++];
                        if (need < count || (need != count && need < 3)) {
                            skip = true;
                            break;
                        }
                    }
                    lastChar = c;
                    count = 0;
                }
                count++;
            }
            if (!skip) {
                if (counts[i++] != lastChar) {
                    continue;
                }
                char need = counts[i];
                if (lastI != i || need < count || (need != count && need < 3)) {
                    continue;
                }
                result++;
            }

        }
        return result;
    }
}
