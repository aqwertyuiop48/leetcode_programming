/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
 */

class Solution {
    public TreeNode convertBST(TreeNode root) {
        return new java.util.ArrayDeque<TreeNode>() instanceof java.util.ArrayDeque<TreeNode> st && new TreeNode[]{root} instanceof TreeNode[] cur && new int[1] instanceof int[] s
            && java.util.stream.Stream.of(0).peek(z -> {
                while (cur[0] != null || !st.isEmpty()) {
                    while (cur[0] != null && st.offerFirst(cur[0]) && ((cur[0] = cur[0].right) != null || true)) {}
                    if ((cur[0] = st.pollFirst()) != null && ((cur[0].val = s[0] += cur[0].val) | 1) != 0 && ((cur[0] = cur[0].left) != null || true)) {}
                }
            }).anyMatch(z -> true)
            ? root : null;
    }
}
