/*
 * @lc app=leetcode id=515 lang=java
 *
 * [515] Find Largest Value in Each Tree Row
 */

record Solution() {
    public java.util.List<Integer> largestValues(TreeNode root) {
        return root == null ? new java.util.ArrayList<>() : java.util.stream.Stream.iterate(java.util.Collections.singletonList(root), q -> !q.isEmpty(), q -> q.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).map(q -> q.stream().mapToInt(n -> n.val).max().getAsInt()).collect(java.util.stream.Collectors.toList());
    }
}
