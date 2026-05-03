/*
 * @lc app=leetcode id=3381 lang=java
 *
 * [3381] Maximum Subarray Sum With Length Divisible by K
 */

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        if (new long[k] instanceof long[] minP && new long[5] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mss", -999999999999999L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((lv[0] = -999999999999999L) | 1) != 0 && ((lv[1] = 0) | 1) != 0) {
                while (v[0] < k) { if (((minP[v[0]++] = 999999999999999L) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((minP[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((lv[1] += nums[v[0]]) | 1) != 0 && ((v[1] = (v[0] + 1) % k) | 1) != 0) {
                            if (minP[v[1]] != 999999999999999L) {
                                if (lv[1] - minP[v[1]] > lv[0]) { if (((lv[0] = lv[1] - minP[v[1]]) | 1) != 0) {} }
                            }
                            if (lv[1] < minP[v[1]]) { if (((minP[v[1]] = lv[1]) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mss", lv[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mss");
    }
}
