/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        return root == null ? Collections.emptyList() : Stream.concat(Stream.of(root.val), Stream.concat(preorderTraversal(root.left).stream(), preorderTraversal(root.right).stream())).toList();
    }
}
