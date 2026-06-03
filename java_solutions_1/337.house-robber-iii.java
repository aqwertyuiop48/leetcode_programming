/*
 * @lc app=leetcode id=337 lang=java
 *
 * [337] House Robber III
 */

// @lc code=start

class Solution {
    public int rob(TreeNode root) {
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, int[]>>()).peek(ref -> ref.set(n -> n == null ? new int[2] : java.util.stream.Stream.of(0).map(_v -> new int[][]{ref.get().apply(n.left), ref.get().apply(n.right)}).map(a -> new int[]{Math.max(a[0][0], a[0][1]) + Math.max(a[1][0], a[1][1]), n.val + a[0][0] + a[1][0]}).findFirst().get())).map(ref -> ref.get().apply(root)).map(a -> Math.max(a[0], a[1])).findFirst().get();
    }
}
// @lc code=end
