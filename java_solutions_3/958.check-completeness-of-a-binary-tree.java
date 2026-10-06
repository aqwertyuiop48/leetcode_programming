/*
 * @lc app=leetcode id=958 lang=java
 *
 * [958] Check Completeness of a Binary Tree
 */

class Solution {
    public boolean isCompleteTree(TreeNode root) {
        return java.util.stream.Stream.iterate(java.util.List.<Object[]>of(new Object[]{root, 1}), l -> !l.isEmpty(),
                l -> l.stream().flatMap(e -> java.util.stream.Stream.of(((TreeNode) e[0]).left == null ? null : new Object[]{((TreeNode) e[0]).left, Math.min(1000, 2 * (int) e[1])},
                    ((TreeNode) e[0]).right == null ? null : new Object[]{((TreeNode) e[0]).right, Math.min(1000, 2 * (int) e[1] + 1)}).filter(java.util.Objects::nonNull)).toList())
            .flatMap(java.util.List::stream).mapToInt(e -> (int) e[1]).summaryStatistics() instanceof java.util.IntSummaryStatistics st && st.getMax() == st.getCount();
    }
}
