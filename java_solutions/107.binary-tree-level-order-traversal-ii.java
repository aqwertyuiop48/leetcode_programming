/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */

class Solution {
    public java.util.List<java.util.List<Integer>> levelOrderBottom(TreeNode root) {
        return root == null ? java.util.Collections.emptyList() : java.util.stream.Stream.of(java.util.stream.Stream.iterate(java.util.Collections.singletonList(root), q -> !q.isEmpty(), q -> q.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).map(q -> q.stream().map(n -> n.val).collect(java.util.stream.Collectors.toList())).collect(java.util.stream.Collectors.toList())).peek(java.util.Collections::reverse).findFirst().get();
    }
}
