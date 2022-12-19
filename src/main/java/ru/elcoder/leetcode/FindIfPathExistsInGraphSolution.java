package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1971,
        title = "Find if Path Exists in Graph",
        url = "https://leetcode.com/problems/find-if-path-exists-in-graph/"
)
public class FindIfPathExistsInGraphSolution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        Map<Integer, Set<Integer>> vertexEdges = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            Set<Integer> e = vertexEdges.computeIfAbsent(edges[i][0], k -> new HashSet<>());
            e.add(i);
            e = vertexEdges.computeIfAbsent(edges[i][1], k -> new HashSet<>());
            e.add(i);
        }
        Set<Integer> sourceEdges = vertexEdges.get(source);
        Set<Integer> visitedEdges = new HashSet<>();
        for (int sourceEdge : sourceEdges) {
            if (dfs(sourceEdge, vertexEdges, destination, visitedEdges, edges)) {
                return true;
            }
        }
        return false;
    }

    private boolean dfs(int edge, Map<Integer, Set<Integer>> vertexEdges, int destVertex, Set<Integer> visitedEdges, int[][] edges) {
        if (visitedEdges.contains(edge)) {
            return false;
        }
        visitedEdges.add(edge);
        int[] edgeVertices = edges[edge];
        if (edgeVertices[0] == destVertex || edgeVertices[1] == destVertex) {
            return true;
        }
        Set<Integer> e = vertexEdges.get(edgeVertices[0]);
        for (int sourceEdge : e) {
            if (dfs(sourceEdge, vertexEdges, destVertex, visitedEdges, edges)) {
                return true;
            }
        }
        e = vertexEdges.get(edgeVertices[1]);
        for (int sourceEdge : e) {
            if (dfs(sourceEdge, vertexEdges, destVertex, visitedEdges, edges)) {
                return true;
            }
        }
        return false;
    }
}
