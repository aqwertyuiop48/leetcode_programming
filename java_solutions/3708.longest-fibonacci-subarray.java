/*
 * @lc app=leetcode id=3708 lang=java
 *
 * [3708] Longest Fibonacci Subarray
 */

class Solution {
    public int longestSubarray(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lfs", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 2) | 1) != 0 && nums.length >= 2) {
            if (((v[2] = 2) | 1) != 0 && ((v[3] = 2) | 1) != 0) {
                while (v[2] < nums.length) {
                    if (nums[v[2]] == nums[v[2] - 1] + nums[v[2] - 2]) { if (((v[3] = v[2] - v[0] + 1) | 1) != 0) { if (v[3] > v[1]) v[1] = v[3]; } }
                    else { if (((v[0] = v[2] - 1) | 1) != 0) {} }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lfs", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lfs");
    }
}
