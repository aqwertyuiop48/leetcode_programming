/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
 */

// @lc code=start

class Solution {
    public void recoverTree(TreeNode root) {
        java.util.stream.Stream.of(new Object[][]{{new TreeNode[3], new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>()}}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).set(node -> java.util.stream.Stream.of(node).filter(n -> n != null).peek(n -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(n.left)).peek(n -> ((TreeNode[]) a[0])[1] = ((TreeNode[]) a[0])[0] != null && ((TreeNode[]) a[0])[0].val > n.val && ((TreeNode[]) a[0])[1] == null ? ((TreeNode[]) a[0])[0] : ((TreeNode[]) a[0])[1]).peek(n -> ((TreeNode[]) a[0])[2] = ((TreeNode[]) a[0])[0] != null && ((TreeNode[]) a[0])[0].val > n.val ? n : ((TreeNode[]) a[0])[2]).peek(n -> ((TreeNode[]) a[0])[0] = n).forEach(n -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(n.right)))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(root)).forEach(a -> java.util.stream.Stream.of(((TreeNode[]) a[0])[1].val).peek(v -> ((TreeNode[]) a[0])[1].val = ((TreeNode[]) a[0])[2].val).forEach(v -> ((TreeNode[]) a[0])[2].val = v));
    }
}
// @lc code=end

