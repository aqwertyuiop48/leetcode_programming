/*
 * @lc app=leetcode id=2331 lang=java
 *
 * [2331] Evaluate Boolean Binary Tree
 */

class Solution {
    public boolean evaluateTree(TreeNode root) {
        return new java.util.function.Function[1] instanceof java.util.function.Function[] f && (f[0] = n -> ((TreeNode)n).val == 0 ? false : (((TreeNode)n).val == 1 ? true : (((TreeNode)n).val == 2 ? ((boolean)f[0].apply(((TreeNode)n).left) || (boolean)f[0].apply(((TreeNode)n).right)) : ((boolean)f[0].apply(((TreeNode)n).left) && (boolean)f[0].apply(((TreeNode)n).right))))) != null ? (boolean)f[0].apply(root) : false;
    }
}
