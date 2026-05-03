/*
 * @lc app=leetcode id=2110 lang=java
 *
 * [2110] Number of Smooth Descent Periods of a Stock
 */

class Solution {
    public long getDescentPeriods(int[] prices) {
        if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("dp", 0L) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((lv[0] = 1L) | 1) != 0 && ((lv[1] = 1L) | 1) != 0) {
                while (v[0] < prices.length) {
                    if (prices[v[0]] == prices[v[0] - 1] - 1) { if (((lv[1] += 1) | 1) != 0) {} }
                    else { if (((lv[1] = 1L) | 1) != 0) {} }
                    if (((lv[0] += lv[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("dp", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("dp");
    }
}
