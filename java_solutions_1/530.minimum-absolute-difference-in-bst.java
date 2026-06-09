/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
 */

class Solution {
    public int getMinimumDifference(TreeNode root) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[]{-1}, new int[]{Integer.MAX_VALUE}, new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[2]).set(n -> java.util.stream.Stream.of(0).filter(_x -> n != null).forEach(_x -> java.util.stream.Stream.of(0).peek(_y -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[2]).get().accept(n.left)).peek(_y -> java.util.stream.Stream.of(0).filter(_z -> ((int[]) a[0])[0] != -1).forEach(_z -> ((int[]) a[1])[0] = Math.min(((int[]) a[1])[0], n.val - ((int[]) a[0])[0]))).peek(_y -> ((int[]) a[0])[0] = n.val).forEach(_y -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[2]).get().accept(n.right))))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[2]).get().accept(root)).map(a -> ((int[]) a[1])[0]).findFirst().get();
    }
}
