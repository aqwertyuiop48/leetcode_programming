/*
 * @lc app=leetcode id=795 lang=java
 *
 * [795] Number of Subarrays with Bounded Maximum
 */

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return new int[]{-1, -1} instanceof int[] s
            ? java.util.stream.IntStream.range(0, nums.length).map(i -> (nums[i] > right ? (s[0] = i) : s[0]) * 0 + (nums[i] >= left ? (s[1] = i) : s[1]) - s[0]).sum() : 0;
    }
}
