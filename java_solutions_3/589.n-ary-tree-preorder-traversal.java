/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

class Solution {
    public List<Integer> preorder(Node root) {
        return new java.util.ArrayList<Integer>() instanceof java.util.ArrayList<Integer> res && new java.util.ArrayDeque<Node>(root == null ? java.util.List.<Node>of() : java.util.List.of(root)) instanceof java.util.ArrayDeque<Node> st
            && java.util.stream.Stream.generate(st::pollFirst).takeWhile(java.util.Objects::nonNull).peek(n -> res.add(n.val))
                .peek(n -> java.util.Optional.ofNullable(n.children).orElse(java.util.List.of()).reversed().forEach(st::offerFirst)).allMatch(x -> true)
            ? res : null;
    }
}
