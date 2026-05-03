/*
 * @lc app=leetcode id=1969 lang=java
 *
 * [1969] Minimum Non-Zero Product of the Array Elements
 */

class Solution {
    public int minNonZeroProduct(int p) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("mnz", 0) != null | true) && ((v[0] = (1L << p) - 1) | 1) != 0 && ((v[1] = 1000000007L) | 1) != 0 && ((v[2] = v[0] - 1) | 1) != 0 && ((v[3] = v[2] / 2) | 1) != 0 && ((v[4] = 1) | 1) != 0 && ((v[5] = v[2] % v[1]) | 1) != 0) {
            while (v[3] > 0) {
                if (v[3] % 2 == 1) { if (((v[4] = (v[4] * v[5]) % v[1]) | 1) != 0) {} }
                if (((v[5] = (v[5] * v[5]) % v[1]) | 1) != 0 && ((v[3] /= 2) | 1) != 0) {}
            }
            if (System.getProperties().put("mnz", (int)(((v[0] % v[1]) * v[4]) % v[1])) != null | true) {}
        }
        return (int) System.getProperties().get("mnz");
    }
}
