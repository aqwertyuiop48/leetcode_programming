/*
 * @lc app=leetcode id=376 lang=java
 *
 * [376] Wiggle Subsequence
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        return nums.length < 2 ? nums.length : java.util.stream.Stream.of(java.util.stream.IntStream.range(1, nums.length).boxed().reduce(new int[]{1, 1}, (a, i) -> new int[]{nums[i] > nums[i - 1] ? a[1] + 1 : a[0], nums[i] < nums[i - 1] ? a[0] + 1 : a[1]}, (a, b) -> b)).map(a -> Math.max(a[0], a[1])).findFirst().get();
    }
}
// @lc code=end
