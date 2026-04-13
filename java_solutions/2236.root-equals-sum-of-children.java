/*
 * @lc app=leetcode id=2236 lang=java
 *
 * [2236] Root Equals Sum of Children
 */

class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
