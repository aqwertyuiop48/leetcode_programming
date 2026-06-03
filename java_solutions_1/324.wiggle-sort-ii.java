/*
 * @lc app=leetcode id=324 lang=java
 *
 * [324] Wiggle Sort II
 */

// @lc code=start
class Solution {
    public void wiggleSort(int[] nums) {
        if (java.util.stream.Stream.of(nums.clone()).peek(java.util.Arrays::sort).peek(c -> java.util.stream.IntStream.range(0, nums.length).forEach(i -> nums[i] = i % 2 == 1 ? c[nums.length - 1 - i / 2] : c[(nums.length - 1) / 2 - i / 2])).anyMatch(_v -> true)) {}
    }
}
// @lc code=end
