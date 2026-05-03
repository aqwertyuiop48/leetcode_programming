/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
 */

class Solution {
    public void recoverTree(TreeNode root) {
        if (java.util.stream.Stream.<java.util.function.Function<Object[], Boolean>[]>of(new java.util.function.Function[1]).map(f -> java.util.stream.Stream.of(f[0] = (java.util.function.Function<Object[], Boolean>) (a -> a[0] == null ? true : (f[0].apply(new Object[]{((TreeNode)a[0]).left, a[1]}) && ((java.util.List<TreeNode>)a[1]).add((TreeNode)a[0]) && f[0].apply(new Object[]{((TreeNode)a[0]).right, a[1]})))).findFirst().get()).map(func -> java.util.stream.Stream.of(new java.util.ArrayList<TreeNode>()).peek(list -> func.apply(new Object[]{root, list})).peek(list -> java.util.stream.Stream.of(list.stream().mapToInt(n -> n.val).sorted().toArray()).forEach(sorted -> java.util.stream.IntStream.range(0, list.size()).forEach(i -> list.get(i).val = sorted[i]))).count() > -1).count() > -1) return;
    }
}
