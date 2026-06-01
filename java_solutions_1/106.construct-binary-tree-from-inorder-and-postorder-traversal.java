/*
 * @lc app=leetcode id=106 lang=java
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
 */

// @lc code=start

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<int[], TreeNode>>()).peek(ref -> ref.set(a -> a[0] > a[1] ? null : java.util.stream.Stream.of(new TreeNode(postorder[a[2]])).peek(n -> java.util.stream.IntStream.rangeClosed(a[0], a[1]).filter(i -> inorder[i] == postorder[a[2]]).forEach(m -> java.util.stream.Stream.of(0).peek(_v -> n.left = ref.get().apply(new int[]{a[0], m - 1, a[2] - (a[1] - m) - 1})).forEach(_v -> n.right = ref.get().apply(new int[]{m + 1, a[1], a[2] - 1})))).findFirst().get())).map(ref -> ref.get().apply(new int[]{0, inorder.length - 1, postorder.length - 1})).findFirst().get();
    }
}
// @lc code=end

