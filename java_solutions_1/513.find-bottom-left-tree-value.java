/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
 */

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        return java.util.stream.Stream.of(0).map(_v -> new java.util.LinkedList<TreeNode>()).peek(q -> q.offer(root)).map(q -> java.util.stream.Stream.generate(q::poll).takeWhile(n -> n != null).peek(n -> java.util.stream.Stream.of(0).filter(_x -> n.right != null).forEach(_x -> q.offer(n.right))).peek(n -> java.util.stream.Stream.of(0).filter(_x -> n.left != null).forEach(_x -> q.offer(n.left))).reduce((a, b) -> b).get().val).findFirst().get();
    }
}
