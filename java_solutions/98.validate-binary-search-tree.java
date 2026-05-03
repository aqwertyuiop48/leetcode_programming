/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return java.util.stream.Stream.<java.util.function.Function<Object[], Boolean>[]>of(new java.util.function.Function[1]).map(f -> java.util.stream.Stream.of(f[0] = (java.util.function.Function<Object[], Boolean>) (a -> a[0] == null ? true : ((a[1] == null || ((TreeNode)a[0]).val > (long)a[1]) && (a[2] == null || ((TreeNode)a[0]).val < (long)a[2]) && f[0].apply(new Object[]{((TreeNode)a[0]).left, a[1], (long)((TreeNode)a[0]).val}) && f[0].apply(new Object[]{((TreeNode)a[0]).right, (long)((TreeNode)a[0]).val, a[2]})))).findFirst().get()).findFirst().get().apply(new Object[]{root, null, null});
    }
}
