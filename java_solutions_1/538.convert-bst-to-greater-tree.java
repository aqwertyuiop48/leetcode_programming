/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
 */

class Solution {
    public TreeNode convertBST(TreeNode root) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[]{0}, new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).set(n -> java.util.stream.Stream.of(n).filter(x -> x != null).peek(x -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(x.right)).peek(x -> x.val = (((int[]) a[0])[0] += x.val)).forEach(x -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(x.left)))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(root)).map(a -> root).findFirst().orElse(null);
    }
}
