/*
 * @lc app=leetcode id=814 lang=java
 *
 * [814] Binary Tree Pruning
 */

record Solution() {
    public TreeNode pruneTree(TreeNode root) {
        return root == null ? null : java.util.Optional.of(root).peek(n -> n.left = pruneTree(n.left)).peek(n -> n.right = pruneTree(n.right)).filter(n -> n.val == 1 || n.left != null || n.right != null).orElse(null);
    }
}
