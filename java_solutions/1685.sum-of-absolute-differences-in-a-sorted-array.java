/*
 * @lc app=leetcode id=1685 lang=java
 *
 * [1685] Sum of Absolute Differences in a Sorted Array
 */

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        if (new int[nums.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("sad", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((v[2] += nums[v[0]++]) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((ans[v[0]] = nums[v[0]] * v[0] - v[1] + (v[2] - v[1] - nums[v[0]]) - nums[v[0]] * (nums.length - v[0] - 1)) | 1) != 0 && ((v[1] += nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("sad");
    }
}
