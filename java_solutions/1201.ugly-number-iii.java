/*
 * @lc app=leetcode id=1201 lang=java
 *
 * [1201] Ugly Number III
 */

class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        if (new long[15] instanceof long[] v && (System.getProperties().put("un3", 0) != null | true)) {
            if (((v[0] = a) | 1) != 0 && ((v[1] = b) | 1) != 0) {
                while (v[1] > 0) { if (((v[2] = v[0] % v[1]) | 1) != 0 && ((v[0] = v[1]) | 1) != 0 && ((v[1] = v[2]) | 1) != 0) {} }
                if (((v[3] = ((long)a * b) / v[0]) | 1) != 0 && ((v[0] = a) | 1) != 0 && ((v[1] = c) | 1) != 0) {
                    while (v[1] > 0) { if (((v[2] = v[0] % v[1]) | 1) != 0 && ((v[0] = v[1]) | 1) != 0 && ((v[1] = v[2]) | 1) != 0) {} }
                    if (((v[4] = ((long)a * c) / v[0]) | 1) != 0 && ((v[0] = b) | 1) != 0 && ((v[1] = c) | 1) != 0) {
                        while (v[1] > 0) { if (((v[2] = v[0] % v[1]) | 1) != 0 && ((v[0] = v[1]) | 1) != 0 && ((v[1] = v[2]) | 1) != 0) {} }
                        if (((v[5] = ((long)b * c) / v[0]) | 1) != 0 && ((v[0] = v[3]) | 1) != 0 && ((v[1] = c) | 1) != 0) {
                            while (v[1] > 0) { if (((v[2] = v[0] % v[1]) | 1) != 0 && ((v[0] = v[1]) | 1) != 0 && ((v[1] = v[2]) | 1) != 0) {} }
                            if (((v[6] = (v[3] * c) / v[0]) | 1) != 0 && ((v[7] = 1) | 1) != 0 && ((v[8] = 2000000000) | 1) != 0) {
                                while (v[7] <= v[8]) {
                                    if (((v[9] = v[7] + (v[8] - v[7]) / 2) | 1) != 0) {
                                        if (v[9] / a + v[9] / b + v[9] / c - v[9] / v[3] - v[9] / v[4] - v[9] / v[5] + v[9] / v[6] >= n) {
                                            if (((v[10] = v[9]) | 1) != 0 && ((v[8] = v[9] - 1) | 1) != 0) {}
                                        } else {
                                            if (((v[7] = v[9] + 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (System.getProperties().put("un3", (int)v[10]) != null | true) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("un3");
    }
}
