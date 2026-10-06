/*
 * @lc app=leetcode id=623 lang=java
 *
 * [623] Add One Row to Tree
 */

class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return depth == 1 ? new TreeNode(val, root, null) : root == null ? null
            : depth == 2 ? new TreeNode(root.val, new TreeNode(val, root.left, null), new TreeNode(val, null, root.right))
            : new TreeNode(root.val, addOneRow(root.left, val, depth - 1), addOneRow(root.right, val, depth - 1));
    }
}
