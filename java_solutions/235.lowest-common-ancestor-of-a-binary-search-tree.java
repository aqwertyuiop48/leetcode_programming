/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return (root.val > p.val && root.val > q.val) ? lowestCommonAncestor(root.left, p, q) : (root.val < p.val && root.val < q.val) ? lowestCommonAncestor(root.right, p, q) : root;
    }
}
