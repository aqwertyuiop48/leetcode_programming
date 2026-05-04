/*
 * @lc app=leetcode id=3708 lang=java
 *
 * [3708] Longest Fibonacci Subarray
 */

class Solution {
    public int longestSubarray(int[] nums) {
        record R(int[] v){} return new R(new int[]{0, 2, 2}).v() instanceof int[] v ? nums.length < 3 ? nums.length : java.util.stream.IntStream.range(2, nums.length).boxed().reduce(v, (arr, i) -> nums[i] == nums[i-1] + nums[i-2] ? new int[]{arr[0], Math.max(arr[1], i - arr[0] + 1), i - arr[0] + 1} : new int[]{i - 1, arr[1], 2}, (a, b) -> a)[1] : 0;
    }
}