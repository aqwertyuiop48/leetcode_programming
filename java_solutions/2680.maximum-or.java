/*
 * @lc app=leetcode id=2680 lang=java
 *
 * [2680] Maximum OR
 */

class Solution {
    public long maximumOr(int[] nums, int k) {
        if (new long[nums.length + 1] instanceof long[] pref && new long[nums.length + 1] instanceof long[] suff && new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((pref[(int)v[0] + 1] = pref[(int)v[0]] | nums[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = nums.length - 1) | 1) != 0) {
                while (v[0] >= 0) { if (((suff[(int)v[0]] = suff[(int)v[0] + 1] | nums[(int)v[0]]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[1] = pref[(int)v[0]] | ((long)nums[(int)v[0]] << k) | suff[(int)v[0] + 1]) | 1) != 0 && v[1] > v[2]) { if (((v[2] = v[1]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mo", v[2]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
