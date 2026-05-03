/*
 * @lc app=leetcode id=1022 lang=java
 *
 * [1022] Sum of Root To Leaf Binary Numbers
 */

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return java.util.stream.Stream.iterate(java.util.Collections.singletonList(new Object[]{root, root.val}), list -> !list.isEmpty(), list -> list.stream().flatMap(arr -> java.util.stream.Stream.of(((TreeNode)arr[0]).left != null ? new Object[]{((TreeNode)arr[0]).left, ((int)arr[1] << 1) | ((TreeNode)arr[0]).left.val} : null, ((TreeNode)arr[0]).right != null ? new Object[]{((TreeNode)arr[0]).right, ((int)arr[1] << 1) | ((TreeNode)arr[0]).right.val} : null).filter(java.util.Objects::nonNull)).collect(java.util.stream.Collectors.toList())).flatMap(java.util.Collection::stream).filter(arr -> ((TreeNode)arr[0]).left == null && ((TreeNode)arr[0]).right == null).mapToInt(arr -> (int)arr[1]).sum();
    }
}
