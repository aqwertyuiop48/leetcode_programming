/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 */

class Solution {
    public java.util.List<java.util.List<Integer>> pathSum(TreeNode root, int sum) {
        return java.util.stream.Stream.<java.util.function.Function<Object[], Boolean>[]>of(new java.util.function.Function[1]).map(f -> java.util.stream.Stream.of(f[0] = (java.util.function.Function<Object[], Boolean>) (a -> a[0] == null ? true : java.util.stream.Stream.of(((java.util.List<Integer>)a[2]).add(((TreeNode)a[0]).val)).map(dummy -> ((TreeNode)a[0]).left == null && ((TreeNode)a[0]).right == null && (int)a[1] == ((TreeNode)a[0]).val ? ((java.util.List<java.util.List<Integer>>)a[3]).add(new java.util.ArrayList<>((java.util.List<Integer>)a[2])) : f[0].apply(new Object[]{((TreeNode)a[0]).left, (int)a[1] - ((TreeNode)a[0]).val, a[2], a[3]}) && f[0].apply(new Object[]{((TreeNode)a[0]).right, (int)a[1] - ((TreeNode)a[0]).val, a[2], a[3]})).map(dummy -> ((java.util.List<Integer>)a[2]).remove(((java.util.List<Integer>)a[2]).size() - 1)).findFirst().get())).findFirst().get()).map(func -> java.util.stream.Stream.of(new java.util.ArrayList<java.util.List<Integer>>()).peek(res -> func.apply(new Object[]{root, sum, new java.util.ArrayList<Integer>(), res})).findFirst().get()).findFirst().get();
    }
}
