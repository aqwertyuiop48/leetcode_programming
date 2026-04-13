/*
 * @lc app=leetcode id=965 lang=java
 *
 * [965] Univalued Binary Tree
 */

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return root == null || ((root.left == null || (root.left.val == root.val && isUnivalTree(root.left))) && (root.right == null || (root.right.val == root.val && isUnivalTree(root.right))));
    }
}
