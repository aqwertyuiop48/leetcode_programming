/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
 */

class Solution {
    public String tree2str(TreeNode root) {
        return new StringBuilder() instanceof StringBuilder sb && new java.util.ArrayDeque<Object>(java.util.List.of(root)) instanceof java.util.ArrayDeque<Object> st
            && java.util.stream.Stream.of(0).peek(z -> {
                while (!st.isEmpty()) {
                    if (st.pollFirst() instanceof Object o && (o instanceof TreeNode n
                        ? sb.append(n.val) != null && (n.right == null || st.offerFirst(")") && st.offerFirst(n.right) && st.offerFirst("("))
                            && (n.left != null ? st.offerFirst(")") && st.offerFirst(n.left) && st.offerFirst("(") : n.right == null || st.offerFirst("()"))
                        : sb.append(o) != null)) {}
                }
            }).anyMatch(z -> true)
            ? sb.toString() : "";
    }
}
