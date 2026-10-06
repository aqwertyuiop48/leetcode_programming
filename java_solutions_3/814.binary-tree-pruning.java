/*
 * @lc app=leetcode id=814 lang=java
 *
 * [814] Binary Tree Pruning
 */

class Solution {
    public TreeNode pruneTree(TreeNode root) {
        return root == null ? null : java.util.Optional.of(new TreeNode(root.val, pruneTree(root.left), pruneTree(root.right))).filter(r -> r.left != null || r.right != null || r.val != 0).orElse(null);
    }
}
