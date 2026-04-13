/*
 * @lc app=leetcode id=330 lang=java
 *
 * [330] Patching Array
 */

class Solution {
    public int minPatches(int[] nums, int n) {
        if (new long[]{0, 1, 0, n} instanceof long[] v) {
            while (v[1] <= v[3]) {
                if (v[0] < nums.length && nums[(int)v[0]] <= v[1]) {
                    if (((v[1] += nums[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                } else {
                    if (((v[1] += v[1]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                }
            }
            if (((n = (int)v[2]) | 1) != 0) {}
        }
        return n;
    }
}
