/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        return Optional.of(new long[]{Arrays.stream(nums, 0, k).sum()}).map(s -> IntStream.range(k, nums.length).mapToLong(i -> s[0] += nums[i] - nums[i - k]).reduce(s[0], Math::max) / (double) k).get();
    }
}
