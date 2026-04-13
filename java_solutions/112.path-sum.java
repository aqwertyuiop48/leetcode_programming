/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return root==null ? false : root.left == null && root.right == null ? targetSum - root.val ==0 : hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val) ;
    }
}
