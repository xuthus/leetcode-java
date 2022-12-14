package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 2096,
        title = "Step-By-Step Directions From a Binary Tree Node to Another",
        url = "https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/"
)
public class StepByStepDirectionsFromABinaryTreeNodeToAnotherSolution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder sb = new StringBuilder();
        findPath(root, startValue, sb);
        String rootToStart = sb.toString();
        sb.setLength(0);
        findPath(root, destValue, sb);
        String rootToDest = sb.toString();
        int i = 0;
        while (rootToStart.length() > i && rootToDest.length() > i && rootToStart.charAt(i) == rootToDest.charAt(i))
            i++;
        sb.setLength(0);
        for (int j = i; j < rootToStart.length(); j++) {
            sb.append('U');
        }
        sb.append(rootToDest, i, rootToDest.length());
        return sb.toString();
    }

    private boolean findPath(TreeNode node, int value, StringBuilder path) {
        if (node == null) {
            return false;
        }
        if (node.val == value) {
            return true;
        }
        int saveLength = path.length();
        path.append('L');
        if (findPath(node.left, value, path)) {
            return true;
        }
        path.setLength(saveLength);
        path.append('R');
        if (findPath(node.right, value, path)) {
            return true;
        }
        path.setLength(saveLength);
        return false;
    }
}
