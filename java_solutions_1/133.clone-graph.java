/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start

class Solution {
    public Node cloneGraph(Node node) {
        return node == null ? null : java.util.stream.Stream.<Object[]>of(new Object[]{new java.util.HashMap<Node, Node>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Node, Node>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Node, Node>>) a[1]).set(n -> ((java.util.Map<Node, Node>) a[0]).containsKey(n) ? ((java.util.Map<Node, Node>) a[0]).get(n) : java.util.stream.Stream.of(new Node(n.val)).peek(c -> ((java.util.Map<Node, Node>) a[0]).put(n, c)).peek(c -> n.neighbors.forEach(neighbor -> c.neighbors.add(((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Node, Node>>) a[1]).get().apply(neighbor)))).findFirst().get())).map(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Node, Node>>) a[1]).get().apply(node)).findFirst().get();
    }
}
// @lc code=end

