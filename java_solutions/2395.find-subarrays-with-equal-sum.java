/*
 * @lc app=leetcode id=2395 lang=java
 *
 * [2395] Find Subarrays With Equal Sum
 */

class Solution {
    public boolean findSubarrays(int[] nums) {
        return IntStream.range(0, nums.length - 1)
            .map(i -> nums[i] + nums[i + 1])
            .distinct()
            .count() < nums.length - 1;
    }
}
