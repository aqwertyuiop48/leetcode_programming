/*
 * @lc app=leetcode id=2090 lang=java
 *
 * [2090] K Radius Subarray Averages
 */

class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (new int[nums.length] instanceof int[] ans && new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "ga", ans) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 2 * k + 1) | 1) != 0) {
            while (v[0] < nums.length) { if (((ans[(int)v[0]] = -1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[2] += nums[(int)v[0]]) | 1) != 0) {}
                    if (v[0] >= v[3]) { if (((v[2] -= nums[(int)(v[0] - v[3])]) | 1) != 0) {} }
                    if (v[0] >= v[3] - 1) { if (((ans[(int)(v[0] - k)] = (int)(v[2] / v[3])) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ga");
    }
}
