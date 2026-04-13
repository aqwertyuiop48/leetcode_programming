/*
 * @lc app=leetcode id=233 lang=java
 *
 * [233] Number of Digit One
 */

class Solution {
    public int countDigitOne(int n) {
        if (System.getProperties().put("ans233", 0) != null || true) {
            if (new long[]{1, 0} instanceof long[] v) {
                while (v[0] <= n) {
                    if (((v[1] += (n / (v[0] * 10)) * v[0] + Math.min(Math.max(n % (v[0] * 10) - v[0] + 1, 0), v[0])) | 1) != 0) {
                        if (((v[0] *= 10) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ans233", (int)v[1]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans233");
    }
}
