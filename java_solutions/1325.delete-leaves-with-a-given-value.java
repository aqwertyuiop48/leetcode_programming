/*
 * @lc app=leetcode id=1325 lang=java
 *
 * [1325] Delete Leaves With a Given Value
 */

class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return root == null ? null : (root.left = removeLeafNodes(root.left, target)) == (root.right = removeLeafNodes(root.right, target)) && root.left == null && root.val == target ? null : root;
    }
}
