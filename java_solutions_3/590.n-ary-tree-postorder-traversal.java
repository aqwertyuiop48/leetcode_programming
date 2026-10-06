/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
 */

class Solution {
    public List<Integer> postorder(Node root) {
        return new java.util.ArrayList<Integer>() instanceof java.util.ArrayList<Integer> res && new java.util.ArrayDeque<Node>(root == null ? java.util.List.<Node>of() : java.util.List.of(root)) instanceof java.util.ArrayDeque<Node> st
            && java.util.stream.Stream.generate(st::pollFirst).takeWhile(java.util.Objects::nonNull).peek(n -> res.add(n.val))
                .peek(n -> java.util.Optional.ofNullable(n.children).orElse(java.util.List.of()).forEach(st::offerFirst)).allMatch(x -> true)
            ? res.reversed() : null;
    }
}
