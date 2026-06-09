/*
 * @lc app=leetcode id=508 lang=java
 *
 * [508] Most Frequent Subtree Sum
 */

class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Integer, Integer>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).set(n -> n == null ? 0 : java.util.stream.Stream.of(n.val + ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).get().apply(n.left) + ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).get().apply(n.right)).peek(sum -> ((java.util.Map<Integer, Integer>) a[0]).put(sum, ((java.util.Map<Integer, Integer>) a[0]).getOrDefault(sum, 0) + 1)).findFirst().get())).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<TreeNode, Integer>>) a[1]).get().apply(root)).map(a -> java.util.stream.Stream.of(((java.util.Map<Integer, Integer>) a[0]).values().stream().max(Integer::compare).orElse(0)).map(max -> ((java.util.Map<Integer, Integer>) a[0]).entrySet().stream().filter(e -> e.getValue().equals(max)).mapToInt(java.util.Map.Entry::getKey).toArray()).findFirst().get()).findFirst().get();
    }
}
