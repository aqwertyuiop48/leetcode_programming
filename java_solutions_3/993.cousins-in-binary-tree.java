/*
 * @lc app=leetcode id=993 lang=java
 *
 * [993] Cousins in Binary Tree
 */

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        return java.util.stream.Stream.iterate(java.util.List.<TreeNode[]>of(new TreeNode[]{root, null}), l -> !l.isEmpty(),
                l -> l.stream().flatMap(e -> java.util.stream.Stream.of(e[0].left, e[0].right).filter(java.util.Objects::nonNull).map(c -> new TreeNode[]{c, e[0]})).toList())
            .anyMatch(l -> l.stream().filter(e -> e[0].val == x || e[0].val == y).toList() instanceof java.util.List<TreeNode[]> m && m.size() == 2 && m.get(0)[1] != m.get(1)[1]);
    }
}
