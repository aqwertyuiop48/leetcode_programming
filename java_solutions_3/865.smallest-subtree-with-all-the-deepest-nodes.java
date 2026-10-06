/*
 * @lc app=leetcode id=865 lang=java
 *
 * [865] Smallest Subtree with all the Deepest Nodes
 */

class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Object[]>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Object[]>> f
            && f.getAndSet(n -> n == null ? new Object[]{0, null} : java.util.Optional.of(f.get().apply(n.left))
                .map(l -> java.util.Optional.of(f.get().apply(n.right))
                    .map(r -> (int) l[0] > (int) r[0] ? new Object[]{(int) l[0] + 1, l[1]} : (int) l[0] < (int) r[0] ? new Object[]{(int) r[0] + 1, r[1]} : new Object[]{(int) l[0] + 1, n}).get()).get()) == null
            ? (TreeNode) f.get().apply(root)[1] : null;
    }
}
