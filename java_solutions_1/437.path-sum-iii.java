/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
 */

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<Long, Integer>(), new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<TreeNode, Long, Integer>>()}).peek(a -> ((java.util.Map<Long, Integer>) a[0]).put(0L, 1)).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<TreeNode, Long, Integer>>) a[1]).set((node, currSum) -> node == null ? 0 : java.util.stream.Stream.of(currSum + node.val).map(nextSum -> java.util.stream.Stream.of(((java.util.Map<Long, Integer>) a[0]).getOrDefault(nextSum - targetSum, 0)).peek(_v -> ((java.util.Map<Long, Integer>) a[0]).put(nextSum, ((java.util.Map<Long, Integer>) a[0]).getOrDefault(nextSum, 0) + 1)).map(res -> res + ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<TreeNode, Long, Integer>>) a[1]).get().apply(node.left, nextSum) + ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<TreeNode, Long, Integer>>) a[1]).get().apply(node.right, nextSum)).peek(_v -> ((java.util.Map<Long, Integer>) a[0]).put(nextSum, ((java.util.Map<Long, Integer>) a[0]).get(nextSum) - 1)).findFirst().get()).findFirst().get())).map(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<TreeNode, Long, Integer>>) a[1]).get().apply(root, 0L)).findFirst().get();
    }
}
