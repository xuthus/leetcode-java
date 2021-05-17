package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 323,
        title = "Number of Connected Components in an Undirected Graph",
        url = "https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/"
)
public class NumberOfConnectedComponentsInUndirectedGraphSolution {
    public int countComponents(int n, int[][] edges) {
        if (n == 1)
            return 1;
        if (edges.length == 0)
            return n;
        Map<Integer, List<Integer>> nodes = new HashMap<>(n);
        int[] marks = new int[n];
        for (int[] edge : edges) {
            nodes.computeIfAbsent(edge[0], x -> new LinkedList()).add(edge[1]);
            nodes.computeIfAbsent(edge[1], x -> new LinkedList()).add(edge[0]);
        }
        int cnt = 0;
        for (int[] edge: edges) {
            if (marks[edge[0]] == 0) {
                cnt--;
                marks[edge[0]] = cnt;
                traverse(nodes, edge[0], -1, marks, cnt);
            }
        }
        for (int mark : marks)
            if (mark >= 0)
                cnt--;
        return -cnt;
    }

    private void traverse(Map<Integer, List<Integer>> nodes, int node, int prev, int[] marks, int mark) {
        final List<Integer> neighbors = nodes.get(node);
        for (Integer neighbor : neighbors) {
            if (neighbor != prev) {
                if (marks[neighbor] != 0)
                    continue;
                marks[neighbor] = mark;
                traverse(nodes, neighbor, node, marks, mark);
            }
        }
    }
}
