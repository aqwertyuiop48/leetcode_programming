/*
 * @lc app=leetcode id=515 lang=java
 *
 * [515] Find Largest Value in Each Tree Row
 */

class Solution {
    public java.util.List<Integer> largestValues(TreeNode root) {
        return root == null ? java.util.List.of() : java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.ArrayList<Integer>(), new java.util.LinkedList<TreeNode>()}).peek(a -> ((java.util.Queue<TreeNode>) a[1]).offer(root)).peek(a -> java.util.stream.Stream.iterate(0, _x -> !((java.util.Queue<TreeNode>) a[1]).isEmpty(), _x -> _x).forEach(_x -> java.util.stream.Stream.of(((java.util.Queue<TreeNode>) a[1]).size()).peek(size -> ((java.util.List<Integer>) a[0]).add(java.util.stream.IntStream.range(0, size).mapToObj(i -> ((java.util.Queue<TreeNode>) a[1]).poll()).peek(n -> java.util.stream.Stream.of(0).filter(_y -> n.left != null).forEach(_y -> ((java.util.Queue<TreeNode>) a[1]).offer(n.left))).peek(n -> java.util.stream.Stream.of(0).filter(_y -> n.right != null).forEach(_y -> ((java.util.Queue<TreeNode>) a[1]).offer(n.right))).mapToInt(n -> n.val).max().getAsInt())).forEach(_y -> {}))).map(a -> (java.util.List<Integer>) a[0]).findFirst().get();
    }
}
