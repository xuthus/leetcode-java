package ru.elcoder.codesignal;

public class StrStrSolution {
    int strstr(String s, String x) {
        for (int i = 0; i < s.length() - x.length() + 1; i++) {
            if (s.charAt(i) == x.charAt(0)) {
                int j = -1;
                for (j = 1; j < x.length(); j++) {
                    if (s.charAt(i + j) != x.charAt(j)) {
                        break;
                    }
                }
                if (j == x.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
