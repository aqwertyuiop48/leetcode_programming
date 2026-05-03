/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

class Solution {
    public Node cloneGraph(Node node) {
        return node == null ? null : java.util.stream.Stream.<java.util.function.Function<Node, Node>[]>of(new java.util.function.Function[1]).map(f -> java.util.stream.Stream.of(new java.util.IdentityHashMap<Node, Node>()).map(m -> java.util.stream.Stream.of(f[0] = (java.util.function.Function<Node, Node>) (n -> m.containsKey(n) ? m.get(n) : java.util.stream.Stream.of(new Node(n.val)).peek(c -> m.put(n, c)).peek(c -> n.neighbors.forEach(x -> c.neighbors.add(f[0].apply(x)))).findFirst().get())).findFirst().get().apply(node)).findFirst().get()).findFirst().get();
    }
}
