/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
 */

record Solution() {
    public int findBottomLeftValue(TreeNode root) {
        return java.util.stream.Stream.iterate(java.util.Collections.singletonList(root), q -> !q.isEmpty(), q -> q.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).filter(q -> !q.isEmpty()).reduce((a, b) -> b).get().get(0).val;
    }
}
