/*
 * @lc app=leetcode id=2457 lang=java
 *
 * [2457] Minimum Addition to Make Integer Beautiful
 */

class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if (new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put("mib", 0L) != null | true)) {
            if (((lv[0] = n) | 1) != 0 && ((lv[1] = 1) | 1) != 0) {
                while (lv[0] > 0) {
                    if (((lv[2] = lv[0]) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                        while (lv[2] > 0) { if (((v[0] += lv[2] % 10) | 1) != 0 && ((lv[2] /= 10) | 1) != 0) {} }
                        if (v[0] <= target) { if (System.getProperties().put("mib", lv[0] * lv[1] - n) != null | true && ((lv[0] = 0) | 1) != 0) {} }
                        else { if (((lv[0] = lv[0] / 10 + 1) | 1) != 0 && ((lv[1] *= 10) | 1) != 0) {} }
                    }
                }
            }
        }
        return (long) System.getProperties().get("mib");
    }
}
