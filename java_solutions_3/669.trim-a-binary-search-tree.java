/*
 * @lc app=leetcode id=669 lang=java
 *
 * [669] Trim a Binary Search Tree
 */

class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return root == null ? null : root.val < low ? trimBST(root.right, low, high) : root.val > high ? trimBST(root.left, low, high)
            : new TreeNode(root.val, trimBST(root.left, low, high), trimBST(root.right, low, high));
    }
}
