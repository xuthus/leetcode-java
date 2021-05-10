package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 133,
        title = "Clone Graph",
        url = "https://leetcode.com/problems/clone-graph/"
)
public class CloneGraphSolution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        return cloneGraph(node, new HashMap<>());
    }

    private Node cloneGraph(Node node, Map<Integer, Node> nodes) {
        if (nodes.containsKey(node.val))
            return nodes.get(node.val);
        Node result = new Node(node.val);
        nodes.put(node.val, result);
        for (Node neighbor: node.neighbors)
            result.neighbors.add(cloneGraph(neighbor, nodes));
        return result;
    }

    // Definition for a Node.
    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
