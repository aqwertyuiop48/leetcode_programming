/*
 * @lc app=leetcode id=2256 lang=java
 *
 * [2256] Minimum Average Difference
 */

class Solution {
    public int minimumAverageDifference(int[] nums) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("mad", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0 && ((lv[4] = 1000000000000000L) | 1) != 0) {
                while (v[0] < nums.length) { if (((lv[0] += nums[v[0]++]) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((lv[1] += nums[v[0]]) | 1) != 0 && ((lv[2] = lv[0] - lv[1]) | 1) != 0 && ((lv[3] = Math.abs(lv[1] / (v[0] + 1) - (v[0] == nums.length - 1 ? 0 : lv[2] / (nums.length - v[0] - 1)))) | 1) != 0) {
                            if (lv[3] < lv[4]) { if (((lv[4] = lv[3]) | 1) != 0 && System.getProperties().put("mad", v[0]) != null | true) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mad");
    }
}
