/*
 * @lc app=leetcode id=897 lang=java
 *
 * [897] Increasing Order Search Tree
 */

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, java.util.stream.Stream<Integer>>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, java.util.stream.Stream<Integer>>> f
            && f.getAndSet(n -> n == null ? java.util.stream.Stream.<Integer>empty()
                : java.util.stream.Stream.concat(java.util.stream.Stream.concat(f.get().apply(n.left), java.util.stream.Stream.of(n.val)), f.get().apply(n.right))) == null
            ? f.get().apply(root).toList().reversed().stream().reduce((TreeNode) null, (nx, v) -> new TreeNode(v, null, nx), (a, b) -> a) : null;
    }
}
