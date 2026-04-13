/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

class Solution {
    public int maxDepth(TreeNode root) {
        return root==null ? 0 : 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
