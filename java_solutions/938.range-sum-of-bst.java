/*
 * @lc app=leetcode id=938 lang=java
 *
 * [938] Range Sum of BST
 */

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return root == null ? 0 : (root.val < low ? rangeSumBST(root.right, low, high) : (root.val > high ? rangeSumBST(root.left, low, high) : root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)));
    }
}
