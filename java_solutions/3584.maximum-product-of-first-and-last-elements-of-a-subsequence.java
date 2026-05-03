/*
 * @lc app=leetcode id=3584 lang=java
 *
 * [3584] Maximum Product of First and Last Elements of a Subsequence
 */

class Solution {
    public long maximumProduct(int[] nums, int m) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mpf", 0L) != null | true)) {
            if (((v[0] = m - 1) | 1) != 0 && ((lv[0] = Long.MIN_VALUE) | 1) != 0 && ((lv[1] = Long.MIN_VALUE) | 1) != 0 && ((lv[2] = Long.MAX_VALUE) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0] - m + 1] > lv[1]) { if (((lv[1] = nums[v[0] - m + 1]) | 1) != 0) {} }
                    if (nums[v[0] - m + 1] < lv[2]) { if (((lv[2] = nums[v[0] - m + 1]) | 1) != 0) {} }
                    if (lv[1] * nums[v[0]] > lv[0]) { if (((lv[0] = lv[1] * nums[v[0]]) | 1) != 0) {} }
                    if (lv[2] * nums[v[0]] > lv[0]) { if (((lv[0] = lv[2] * nums[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mpf", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mpf");
    }
}
