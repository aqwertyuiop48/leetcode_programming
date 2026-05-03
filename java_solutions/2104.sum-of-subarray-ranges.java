/*
 * @lc app=leetcode id=2104 lang=java
 *
 * [2104] Sum of Subarray Ranges
 */

class Solution {
    public long subArrayRanges(int[] nums) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("sar", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = nums[v[0]]) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                        while (v[3] < nums.length) {
                            if (nums[v[3]] > v[2]) { if (((v[2] = nums[v[3]]) | 1) != 0) {} }
                            if (nums[v[3]] < v[1]) { if (((v[1] = nums[v[3]]) | 1) != 0) {} }
                            if (((lv[0] += v[2] - v[1]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("sar", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("sar");
    }
}
