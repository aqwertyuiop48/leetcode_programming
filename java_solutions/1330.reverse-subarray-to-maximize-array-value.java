/*
 * @lc app=leetcode id=1330 lang=java
 *
 * [1330] Reverse Subarray To Maximize Array Value
 */

class Solution {
    public int maxValueAfterReverse(int[] nums) {
        if (new int[]{0, 0, 0, 2147483647, -2147483648, nums.length, 0, 0} instanceof int[] v) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[7] < v[5] - 1) {
                        if (((v[6] = Math.abs(nums[v[7]] - nums[v[7] + 1])) | 1) != 0 && ((v[1] += v[6]) | 1) != 0 && ((v[2] = Math.max(v[2], Math.abs(nums[v[7] + 1] - nums[0]) - v[6])) | 1) != 0 && ((v[2] = Math.max(v[2], Math.abs(nums[v[7]] - nums[v[5] - 1]) - v[6])) | 1) != 0 && ((v[3] = Math.min(v[3], Math.max(nums[v[7]], nums[v[7] + 1]))) | 1) != 0 && ((v[4] = Math.max(v[4], Math.min(nums[v[7]], nums[v[7] + 1]))) | 1) != 0 && ((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (((nums[0] = v[1] + Math.max(v[2], 2 * (v[4] - v[3]))) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                }
            }
        }
        return nums[0];
    }
}
