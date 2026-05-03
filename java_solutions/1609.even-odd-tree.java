/*
 * @lc app=leetcode id=1609 lang=java
 *
 * [1609] Even Odd Tree
 */

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        return new java.util.ArrayList<Integer>() instanceof java.util.List m && new java.util.function.BiFunction[1] instanceof java.util.function.BiFunction[] f && (f[0] = (n, l) -> n == null ? true : (((int)l == m.size() ? m.add(((TreeNode)n).val) : (((int)l % 2 == 0 ? ((TreeNode)n).val > (int)m.get((int)l) : ((TreeNode)n).val < (int)m.get((int)l)) && (m.set((int)l, ((TreeNode)n).val) != null | true))) && ((TreeNode)n).val % 2 != (int)l % 2 && (boolean)f[0].apply(((TreeNode)n).left, (int)l + 1) && (boolean)f[0].apply(((TreeNode)n).right, (int)l + 1))) != null ? (boolean)f[0].apply(root, 0) : false;
    }
}
