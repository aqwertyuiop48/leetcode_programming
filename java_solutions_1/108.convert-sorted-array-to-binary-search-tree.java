/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, TreeNode>>()).peek(ref -> ref.set((l, r) -> l > r ? null : java.util.stream.Stream.of(l + (r - l) / 2).map(m -> new TreeNode(nums[m], ref.get().apply(l, m - 1), ref.get().apply(m + 1, r))).findFirst().get())).map(ref -> ref.get().apply(0, nums.length - 1)).findFirst().get();
    }
}
// @lc code=end

