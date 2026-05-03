/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 */

record Solution() {
    public java.util.List<java.util.List<Integer>> levelOrder(Node root) {
        return root == null ? java.util.Collections.emptyList() : java.util.stream.Stream.iterate(java.util.Collections.singletonList(root), q -> !q.isEmpty(), q -> q.stream().flatMap(n -> n.children.stream()).collect(java.util.stream.Collectors.toList())).map(q -> q.stream().map(n -> n.val).collect(java.util.stream.Collectors.toList())).filter(l -> !l.isEmpty()).collect(java.util.stream.Collectors.toList());
    }
}
