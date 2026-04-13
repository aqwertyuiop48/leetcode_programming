/*
 * @lc app=leetcode id=222 lang=java
 *
 * [222] Count Complete Tree Nodes
 */

class Solution {
    public int countNodes(TreeNode root) {
        return root==null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }
}
