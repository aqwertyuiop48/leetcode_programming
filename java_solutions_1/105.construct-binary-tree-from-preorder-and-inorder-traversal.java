/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */

// @lc code=start

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<int[], TreeNode>>()).peek(ref -> ref.set(a -> a[0] > a[1] ? null : java.util.stream.Stream.of(new TreeNode(preorder[a[2]])).peek(n -> java.util.stream.IntStream.rangeClosed(a[0], a[1]).filter(i -> inorder[i] == preorder[a[2]]).forEach(m -> java.util.stream.Stream.of(0).peek(_v -> n.left = ref.get().apply(new int[]{a[0], m - 1, a[2] + 1})).forEach(_v -> n.right = ref.get().apply(new int[]{m + 1, a[1], a[2] + m - a[0] + 1})))).findFirst().get())).map(ref -> ref.get().apply(new int[]{0, inorder.length - 1, 0})).findFirst().get();
    }
}
// @lc code=end

