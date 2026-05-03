/*
 * @lc app=leetcode id=1457 lang=java
 *
 * [1457] Pseudo-Palindromic Paths in a Binary Tree
 */

class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        return (int) java.util.Optional.of(new java.util.function.BiFunction[1])
            .filter(a -> (a[0] = (java.util.function.BiFunction<TreeNode, Integer, Integer>) (n, m) -> n == null ? 0 : (n.left == null && n.right == null ? (Integer.bitCount(m ^ (1 << n.val)) <= 1 ? 1 : 0) : (int) (Integer) ((java.util.function.BiFunction) a[0]).apply(n.left, m ^ (1 << n.val)) + (int) (Integer) ((java.util.function.BiFunction) a[0]).apply(n.right, m ^ (1 << n.val)))) != null)
            .map(a -> (Integer) ((java.util.function.BiFunction) a[0]).apply(root, 0))
            .get();
    }
}
