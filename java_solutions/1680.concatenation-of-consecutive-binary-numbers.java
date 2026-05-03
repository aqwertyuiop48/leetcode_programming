/*
 * @lc app=leetcode id=1680 lang=java
 *
 * [1680] Concatenation of Consecutive Binary Numbers
 */

class Solution {
    public int concatenatedBinary(int n) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("ccb", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] <= n) {
                    if (((v[2] = Long.toBinaryString(v[0]).length()) | 1) != 0 && ((v[1] = ((v[1] << v[2]) + v[0]) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("ccb", (int)v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("ccb");
    }
}
