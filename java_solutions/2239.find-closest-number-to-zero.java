/*
 * @lc app=leetcode id=2239 lang=java
 *
 * [2239] Find Closest Number to Zero
 */

class Solution {
    public int findClosestNumber(int[] nums) {
        if (new int[]{1, nums[0]} instanceof int[] v) {
            while (v[0] < nums.length) {
                if (Math.abs(nums[v[0]]) < Math.abs(v[1])) {
                    if (((v[1] = nums[v[0]]) | 1) != 0) {}
                } else {
                    if (Math.abs(nums[v[0]]) == Math.abs(v[1])) {
                        if (((v[1] = Math.max(v[1], nums[v[0]])) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((nums[0] = v[1]) | 1) != 0) {}
        }
        return nums[0];
    }
}