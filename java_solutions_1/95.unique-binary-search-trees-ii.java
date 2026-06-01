/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
 */

// @lc code=start

class Solution {
    public java.util.List<TreeNode> generateTrees(int n) {
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, java.util.List<TreeNode>>>()).peek(ref -> ref.set((start, end) -> start > end ? java.util.Arrays.asList((TreeNode) null) : java.util.stream.IntStream.rangeClosed(start, end).boxed().flatMap(i -> ref.get().apply(start, i - 1).stream().flatMap(left -> ref.get().apply(i + 1, end).stream().map(right -> new TreeNode(i, left, right)))).collect(java.util.stream.Collectors.toList()))).map(ref -> ref.get().apply(1, n)).findFirst().get();
    }
}
// @lc code=end

