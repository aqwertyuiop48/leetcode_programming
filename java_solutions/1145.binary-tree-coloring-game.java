/*
 * @lc app=leetcode id=1145 lang=java
 *
 * [1145] Binary Tree Coloring Game
 */

class Solution {
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        return new int[2] instanceof int[] v && new java.util.function.ToIntFunction[1] instanceof java.util.function.ToIntFunction[] f && (f[0] = node -> node == null ? 0 : (new int[]{f[0].applyAsInt(((TreeNode)node).left), f[0].applyAsInt(((TreeNode)node).right)} instanceof int[] c ? (((TreeNode)node).val == x ? (((v[0] = c[0]) | 1) != 0 && ((v[1] = c[1]) | 1) != 0 ? c[0] + c[1] + 1 : 0) : c[0] + c[1] + 1) : 0)) != null && f[0].applyAsInt(root) > 0 ? (v[0] > n / 2 || v[1] > n / 2 || n - v[0] - v[1] - 1 > n / 2) : false;
    }
}
