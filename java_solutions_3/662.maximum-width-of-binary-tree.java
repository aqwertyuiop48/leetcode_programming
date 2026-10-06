/*
 * @lc app=leetcode id=662 lang=java
 *
 * [662] Maximum Width of Binary Tree
 */

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        return (int) java.util.stream.Stream.iterate(java.util.List.<Object[]>of(new Object[]{root, 0L}), l -> !l.isEmpty(),
                l -> l.stream().flatMap(e -> java.util.stream.Stream.of(((TreeNode) e[0]).left == null ? null : new Object[]{((TreeNode) e[0]).left, 2 * ((long) e[1] - (long) l.get(0)[1])},
                    ((TreeNode) e[0]).right == null ? null : new Object[]{((TreeNode) e[0]).right, 2 * ((long) e[1] - (long) l.get(0)[1]) + 1}).filter(java.util.Objects::nonNull)).toList())
            .mapToLong(l -> (long) l.get(l.size() - 1)[1] - (long) l.get(0)[1] + 1).max().getAsLong();
    }
}
