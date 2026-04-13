/*
 * @lc app=leetcode id=559 lang=java
 *
 * [559] Maximum Depth of N-ary Tree
 */

class Solution {
    public int maxDepth(Node root) {
        return root == null ? 0 : 1 + root.children.stream().mapToInt(this::maxDepth).max().orElse(0);
    }
}
