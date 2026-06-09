/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
 */

class Solution {
    public int[] findMode(TreeNode root) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Integer, Integer>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).set(n -> java.util.stream.Stream.of(n).filter(x -> x != null).peek(x -> ((java.util.Map<Integer, Integer>) a[0]).put(x.val, ((java.util.Map<Integer, Integer>) a[0]).getOrDefault(x.val, 0) + 1)).peek(x -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(x.left)).forEach(x -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(x.right)))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>) a[1]).get().accept(root)).map(a -> java.util.stream.Stream.of(((java.util.Map<Integer, Integer>) a[0]).values().stream().max(Integer::compare).orElse(0)).map(max -> ((java.util.Map<Integer, Integer>) a[0]).entrySet().stream().filter(e -> e.getValue().equals(max)).mapToInt(java.util.Map.Entry::getKey).toArray()).findFirst().get()).findFirst().get();
    }
}
