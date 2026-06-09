/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[]{0}, new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).set(n -> n == null ? 0 : java.util.stream.Stream.of(new int[]{((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).get().apply(n.left), ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).get().apply(n.right)}).peek(lr -> ((int[]) a[0])[0] = Math.max(((int[]) a[0])[0], lr[0] + lr[1])).map(lr -> Math.max(lr[0], lr[1]) + 1).findFirst().get())).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).get().apply(root)).map(a -> ((int[]) a[0])[0]).findFirst().get();
    }
}
