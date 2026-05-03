/*
 * @lc app=leetcode id=1080 lang=java
 *
 * [1080] Insufficient Nodes in Root to Leaf Paths
 */

class Solution {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return root == null ? null : (root.left == null && root.right == null ? (root.val < limit ? null : root) : ((root.left = sufficientSubset(root.left, limit - root.val)) == root.left & (root.right = sufficientSubset(root.right, limit - root.val)) == root.right ? (root.left == null && root.right == null ? null : root) : null));
    }
}
