/*
 * @lc app=leetcode id=3105 lang=java
 *
 * [3105] Longest Strictly Increasing or Strictly Decreasing Subarray
 */

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lms", 1) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] > nums[v[0] - 1]) { if (((v[1] += 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {} }
                    else if (nums[v[0]] < nums[v[0] - 1]) { if (((v[2] += 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {} }
                    else { if (((v[1] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {} }
                    if (v[1] > v[3]) { if (((v[3] = v[1]) | 1) != 0) {} }
                    if (v[2] > v[3]) { if (((v[3] = v[2]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lms", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lms");
    }
}
