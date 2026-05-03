/*
 * @lc app=leetcode id=3914 lang=java
 *
 * [3914] Minimum Operations to Make Array Non Decreasing
 */

class Solution {
    public long minOperations(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length - 1) {
                if (nums[(int)v[0]] > nums[(int)v[0] + 1]) {
                    if (((v[1] += nums[(int)v[0]] - nums[(int)v[0] + 1]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mo", v[1]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
