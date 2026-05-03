/*
 * @lc app=leetcode id=2270 lang=java
 *
 * [2270] Number of Ways to Split Array
 */

class Solution {
    public int waysToSplitArray(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "wtsa", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((v[1] += nums[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length - 1) {
                    if (((v[2] += nums[(int)v[0]]) | 1) != 0 && v[2] >= v[1] - v[2]) { if (((v[3] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "wtsa", (int)v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "wtsa");
    }
}
