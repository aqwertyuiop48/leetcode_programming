/*
 * @lc app=leetcode id=863 lang=java
 *
 * [863] All Nodes Distance K in Binary Tree
 */

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        return new java.util.HashMap<TreeNode, TreeNode>() instanceof java.util.HashMap<TreeNode, TreeNode> par && new java.util.ArrayList<TreeNode>(java.util.List.of(root)) instanceof java.util.ArrayList<TreeNode> all
            && new java.util.ArrayDeque<TreeNode>(java.util.List.of(root)) instanceof java.util.ArrayDeque<TreeNode> q0
            && java.util.stream.Stream.generate(q0::poll).takeWhile(java.util.Objects::nonNull)
                .peek(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull).allMatch(c -> par.put(c, n) == null && q0.add(c) && all.add(c))).allMatch(x -> true)
            && all.stream().filter(n -> n.val == target.val).findFirst().get() instanceof TreeNode t && new java.util.HashSet<TreeNode>(java.util.List.of(t)) instanceof java.util.HashSet<TreeNode> seen
            ? java.util.stream.Stream.iterate(java.util.List.of(t), f -> f.stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right, par.get(n)).filter(java.util.Objects::nonNull)).filter(seen::add).toList())
                .skip(k).findFirst().get().stream().map(n -> n.val).toList()
            : null;
    }
}
