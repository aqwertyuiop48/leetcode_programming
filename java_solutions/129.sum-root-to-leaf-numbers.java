/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
 */

class Solution {
    public int sumNumbers(TreeNode root) {
        return root == null ? 0 : java.util.stream.Stream.iterate(java.util.Collections.singletonList(new Object[]{root, root.val}), q -> !q.isEmpty(), q -> q.stream().flatMap(arr -> ((TreeNode)arr[0]).left == null && ((TreeNode)arr[0]).right == null ? java.util.stream.Stream.empty() : java.util.stream.Stream.of(((TreeNode)arr[0]).left, ((TreeNode)arr[0]).right).filter(java.util.Objects::nonNull).map(child -> new Object[]{child, (int)arr[1] * 10 + child.val})).collect(java.util.stream.Collectors.toList())).flatMap(java.util.Collection::stream).filter(arr -> ((TreeNode)arr[0]).left == null && ((TreeNode)arr[0]).right == null).mapToInt(arr -> (int)arr[1]).sum();
    }
}
