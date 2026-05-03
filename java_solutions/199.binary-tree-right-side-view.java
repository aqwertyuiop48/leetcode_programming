/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 */

class Solution {
    public java.util.List<Integer> rightSideView(TreeNode root) {
        return root == null ? java.util.Collections.emptyList() : java.util.stream.Stream.<java.util.List<TreeNode>>iterate(java.util.Collections.singletonList(root), q -> !q.isEmpty(), q -> q.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).map(q -> q.get(q.size() - 1).val).collect(java.util.stream.Collectors.toList());
    }
}
