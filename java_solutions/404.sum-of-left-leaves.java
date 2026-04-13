/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
 */

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return root == null ? 0 : (root.left != null && root.left.left == null && root.left.right == null ? root.left.val : 0) + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
