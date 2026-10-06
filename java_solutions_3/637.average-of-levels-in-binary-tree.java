/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
 */

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        return java.util.stream.Stream.iterate(java.util.List.of(root), l -> !l.isEmpty(),
                l -> l.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right)).filter(java.util.Objects::nonNull).toList())
            .map(l -> l.stream().mapToLong(n -> n.val).average().getAsDouble()).toList();
    }
}
