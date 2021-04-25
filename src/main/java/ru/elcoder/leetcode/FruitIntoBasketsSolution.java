package ru.elcoder.leetcode;

public class FruitIntoBasketsSolution {
    public int totalFruit(int[] tree) {
        int max = 1;
        int t1 = tree[0];
        int t2 = tree[0];
        int t1From = 0;
        int t1To = 0;
        int t2From = 0;
        int t2To = -1;
        for (int i = 1; i < tree.length; i++) {
            if (tree[i] == t1) {
                t1To = i;
                continue;
            }
            if (tree[i] == t2) {
                t2To = i;
                continue;
            }
            int len = Math.max(t2To, t1To) - t1From + 1;
            if (len > max) max = len;
            if (t2To > t1To) {
                t1 = t2;
                t1From = t1To + 1;
                t1To = t2To;
            } else {
                t1From = t2To + 1;
            }
            t2From = i;
            t2To = i;
            t2 = tree[i];
        }
        int len = Math.max(t2To, t1To) - t1From + 1;
        if (len > max) max = len;
        return max;
    }
}
