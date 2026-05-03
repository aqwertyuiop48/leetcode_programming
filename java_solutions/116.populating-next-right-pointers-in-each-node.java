/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
 */

class Solution {
    public Node connect(Node root) {
        return root == null ? null : java.util.stream.Stream.<java.util.List<Node>>iterate(java.util.Collections.singletonList(root), q -> !q.isEmpty(), q -> q.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).peek(q -> java.util.stream.IntStream.range(0, q.size() - 1).forEach(i -> q.get(i).next = q.get(i + 1))).count() > -1 ? root : root;
    }
}
