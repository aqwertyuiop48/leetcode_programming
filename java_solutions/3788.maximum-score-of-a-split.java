/*
 * @lc app=leetcode id=3788 lang=java
 *
 * [3788] Maximum Score of a Split
 */

class Solution {
    public long maximumScore(int[] nums) {
        if (new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mss", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((lv[0] += nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = nums.length - 2) | 1) != 0 && ((lv[1] = 999999999999999L) | 1) != 0 && ((lv[2] = -999999999999999L) | 1) != 0) {
                    while (v[0] >= 0) {
                        if (((lv[0] -= nums[v[0] + 1]) | 1) != 0) {
                            if (nums[v[0] + 1] < lv[1]) { if (((lv[1] = nums[v[0] + 1]) | 1) != 0) {} }
                            if (lv[0] - lv[1] > lv[2]) { if (((lv[2] = lv[0] - lv[1]) | 1) != 0) {} }
                        }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mss", lv[2]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mss");
    }
}
