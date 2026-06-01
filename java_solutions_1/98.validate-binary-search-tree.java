/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

// @lc code=start

class Solution {
    public boolean isValidBST(TreeNode root) {
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Object[], Boolean>>()).peek(ref -> ref.set(args -> ((TreeNode)args[0]) == null ? true : (((TreeNode)args[0]).val <= (Long)args[1] || ((TreeNode)args[0]).val >= (Long)args[2] ? false : ref.get().apply(new Object[]{((TreeNode)args[0]).left, (Long)args[1], (long)((TreeNode)args[0]).val}) && ref.get().apply(new Object[]{((TreeNode)args[0]).right, (long)((TreeNode)args[0]).val, (Long)args[2]})))).map(ref -> ref.get().apply(new Object[]{root, Long.MIN_VALUE, Long.MAX_VALUE})).findFirst().get();
    }
}
// @lc code=end

