/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

class Solution {
    public java.util.List<java.util.List<Integer>> levelOrder(TreeNode root) {
        return root == null ? java.util.Collections.emptyList() : java.util.stream.Stream.iterate(java.util.Collections.singletonList(root), q -> !q.isEmpty(), q -> q.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).map(q -> q.stream().map(n -> n.val).collect(java.util.stream.Collectors.toList())).collect(java.util.stream.Collectors.toList());
    }
}
