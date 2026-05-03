/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
 */

class Solution {
    public java.util.List<java.util.List<Integer>> zigzagLevelOrder(TreeNode root) {
        return root == null ? java.util.Collections.emptyList() : java.util.stream.Stream.iterate(new Object[]{java.util.Collections.singletonList(root), 0}, s -> !((java.util.List<TreeNode>)s[0]).isEmpty(), s -> new Object[]{((java.util.List<TreeNode>)s[0]).stream().flatMap(n -> java.util.stream.Stream.of(n.left, n.right).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList()), (int)s[1] + 1}).map(s -> java.util.stream.Stream.of(((java.util.List<TreeNode>)s[0]).stream().map(n -> n.val).collect(java.util.stream.Collectors.toList())).map(l -> (int)s[1] % 2 == 1 ? java.util.stream.Stream.of(l).peek(java.util.Collections::reverse).findFirst().get() : l).findFirst().get()).collect(java.util.stream.Collectors.toList());
    }
}
