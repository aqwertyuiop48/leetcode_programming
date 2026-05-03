/*
 * @lc app=leetcode id=1315 lang=java
 *
 * [1315] Sum of Nodes with Even-Valued Grandparent
 */

class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return java.util.stream.Stream.iterate(java.util.Collections.singletonList(new Object[]{root, null, null}), q -> !q.isEmpty(), q -> q.stream().flatMap(arr -> java.util.stream.Stream.of(new Object[]{((TreeNode)arr[0]).left, arr[0], arr[1]}, new Object[]{((TreeNode)arr[0]).right, arr[0], arr[1]})).filter(arr -> arr[0] != null).collect(java.util.stream.Collectors.toList())).flatMap(java.util.List::stream).filter(arr -> arr[2] != null && ((TreeNode)arr[2]).val % 2 == 0).mapToInt(arr -> ((TreeNode)arr[0]).val).sum();
    }
}
