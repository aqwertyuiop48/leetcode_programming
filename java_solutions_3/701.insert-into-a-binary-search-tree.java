/*
 * @lc app=leetcode id=701 lang=java
 *
 * [701] Insert into a Binary Search Tree
 */

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return root == null ? new TreeNode(val) : val < root.val ? new TreeNode(root.val, insertIntoBST(root.left, val), root.right)
            : new TreeNode(root.val, root.left, insertIntoBST(root.right, val));
    }
}
