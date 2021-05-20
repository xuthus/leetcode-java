package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 261,
        title = "Graph Valid Tree",
        url = "https://leetcode.com/problems/graph-valid-tree/"
)
public class GraphValidTreeSolution {
    public boolean validTree(int n, int[][] edges) {
        if (n == 1)
            return true;
        if (edges.length == 0) {
            return false;
        }
        Map<Integer, List<Integer>> nodes = new HashMap<>();
        int[] marks = new int[n];
        for (int[] edge : edges) {
            nodes.computeIfAbsent(edge[0], x -> new LinkedList()).add(edge[1]);
            nodes.computeIfAbsent(edge[1], x -> new LinkedList()).add(edge[0]);
        }
        marks[edges[0][0]] = -1;
        if (!traverse(nodes, edges[0][0], -1, marks))
            return false;
        for (int mark : marks)
            if (mark != -1)
                return false;
        return true;
    }

    private boolean traverse(Map<Integer, List<Integer>> nodes, int node, int prev, int[] marks) {
        final List<Integer> neighbors = nodes.get(node);
        for (Integer neighbor : neighbors) {
            if (neighbor != prev) {
                if (marks[neighbor] == -1)
                    return false;
                marks[neighbor] = -1;
                if (!traverse(nodes, neighbor, node, marks))
                    return false;
            }
        }
        return true;
    }
}
