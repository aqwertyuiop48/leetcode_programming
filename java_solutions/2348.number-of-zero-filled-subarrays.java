/*
 * @lc app=leetcode id=2348 lang=java
 *
 * [2348] Number of Zero-Filled Subarrays
 */

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("zfs", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == 0) { if (((lv[1] += 1) | 1) != 0 && ((lv[0] += lv[1]) | 1) != 0) {} }
                    else { if (((lv[1] = 0) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("zfs", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("zfs");
    }
}
