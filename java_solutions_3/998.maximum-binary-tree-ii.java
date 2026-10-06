/*
 * @lc app=leetcode id=998 lang=java
 *
 * [998] Maximum Binary Tree II
 */

class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        return root == null || val > root.val ? new TreeNode(val, root, null) : new TreeNode(root.val, root.left, insertIntoMaxTree(root.right, val));
    }
}
