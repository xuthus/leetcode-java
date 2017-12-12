package ru.elcoder.leetcode.models;

import java.util.HashMap;
import java.util.Map;

public class RandomListNode {
    public int label;
    public RandomListNode next, random;

    public RandomListNode(int x) {
        this.label = x;
    }

    public static RandomListNode fromArray(int[][] listArray) {
        RandomListNode[] nodes = new RandomListNode[listArray.length];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new RandomListNode(listArray[i][0]);
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        for (int i = 0; i < nodes.length; i++) {
            nodes[i].random = nodes[listArray[i][1]];
        }
        return nodes[0];
    }

    public static int[][] toArray(RandomListNode list) {
        Map<RandomListNode, Integer> map = new HashMap<>();
        RandomListNode node = list;
        int i = 0;
        while (node != null) {
            map.put(node, i);
            i++;
            node = node.next;
        }
        node = list;
        int[][] res = new int[map.size()][2];
        i = 0;
        while (node != null) {
            res[i][0] = node.label;
            if (node.random != null) {
                res[i][1] = map.get(node.random);
            } else {
                res[i][1] = -1;
            }
            i++;
            node = node.next;
        }
        return res;
    }
}
