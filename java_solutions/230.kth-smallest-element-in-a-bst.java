/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        return Optional.of(((Function<TreeNode, Stream<Integer>>[]) new Function[1]))
            .filter(f -> (f[0] = n -> n == null ? Stream.empty() : Stream.of(Stream.of(n.left).flatMap(f[0]), Stream.of(n.val), Stream.of(n.right).flatMap(f[0])).flatMap(s -> s)) != null)
            .map(f -> f[0].apply(root).skip(k - 1).findFirst().get())
            .get();
    }
}
