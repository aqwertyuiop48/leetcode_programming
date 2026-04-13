/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
 */

class Solution {
    public void flatten(TreeNode root) {
        Optional.ofNullable(root).ifPresent(r -> Stream.iterate( List.of(r), l -> !l.isEmpty(), l -> Stream.concat( Stream.of(l.getFirst().left, l.getFirst().right) .filter(Objects::nonNull), l.stream().skip(1) ).toList() ) .map(List::getFirst) .map(n -> n.val) .skip(1) .reduce(r, (curr, val) -> (curr.left = null) == null ? (curr.right = new TreeNode(val)) : null, (a, b) -> a ) );
    }
}
