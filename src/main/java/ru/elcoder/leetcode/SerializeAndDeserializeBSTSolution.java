package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 449,
        title = "Serialize and Deserialize BST",
        url = "https://leetcode.com/problems/serialize-and-deserialize-bst/"
)
public class SerializeAndDeserializeBSTSolution {
    public static class Codec {

        private int pos = 0;

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null)
                return null;
            final StringBuilder sb = new StringBuilder();
            serialize(root, sb);
            return sb.substring(0, sb.length() - 1);
        }

        private void serialize(TreeNode node, StringBuilder sb) {
            if (node == null)
                return;
            sb.append(node.val).append(',');
            serialize(node.left, sb);
            serialize(node.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            pos = 0;
            if (data == null)
                return null;
            final String[] strings = data.split(",");
            final int len = strings.length;
            final int[] nums = new int[len];
            for (int i = 0; i < len; i++)
                nums[i] = Integer.parseInt(strings[i]);
            return parseNode(nums, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        private TreeNode parseNode(int[] nums, int min, int max) {
            if (pos >= nums.length)
                return null;
            TreeNode node = new TreeNode(nums[pos]);
            pos++;
            if (pos >= nums.length) return node;
            if (nums[pos] > min && nums[pos] < node.val) {
                node.left = parseNode(nums, min, node.val);
            }
            if (pos >= nums.length) return node;
            if (nums[pos] < max && nums[pos] > node.val) {
                node.right = parseNode(nums, node.val, max);
            }
            return node;
        }
    }

}
