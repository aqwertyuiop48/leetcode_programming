/*
 * @lc app=leetcode id=1026 lang=java
 *
 * [1026] Maximum Difference Between Node and Ancestor
 */

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return java.util.stream.Stream.iterate(java.util.Collections.singletonList(new Object[]{root, root.val, root.val}), list -> !list.isEmpty(), list -> list.stream().flatMap(arr -> java.util.stream.Stream.of(((TreeNode)arr[0]).left != null ? new Object[]{((TreeNode)arr[0]).left, Math.min((int)arr[1], ((TreeNode)arr[0]).left.val), Math.max((int)arr[2], ((TreeNode)arr[0]).left.val)} : null, ((TreeNode)arr[0]).right != null ? new Object[]{((TreeNode)arr[0]).right, Math.min((int)arr[1], ((TreeNode)arr[0]).right.val), Math.max((int)arr[2], ((TreeNode)arr[0]).right.val)} : null).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).flatMap(java.util.Collection::stream).mapToInt(arr -> Math.max(Math.abs((int)arr[1] - ((TreeNode)arr[0]).val), Math.abs((int)arr[2] - ((TreeNode)arr[0]).val))).max().orElse(0);
    }
}
