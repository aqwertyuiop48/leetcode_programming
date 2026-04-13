/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null || q == null ? p == q : p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
