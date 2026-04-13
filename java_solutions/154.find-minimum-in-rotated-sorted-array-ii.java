/*
 * @lc app=leetcode id=154 lang=java
 *
 * [154] Find Minimum in Rotated Sorted Array II
 */

class Solution {
    public int findMin(int[] nums) {
        if (new int[]{0, nums.length - 1, 0} instanceof int[] v) {
            while (v[0] < v[1]) {
                if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0) {
                    if (nums[v[2]] > nums[v[1]]) {
                        if (((v[0] = v[2] + 1) | 1) != 0) {}
                    } else if (nums[v[2]] < nums[v[1]]) {
                        if (((v[1] = v[2]) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                }
            }
            if (((nums[0] = nums[v[0]]) | 1) != 0) {}
        }
        return nums[0];
    }
}
