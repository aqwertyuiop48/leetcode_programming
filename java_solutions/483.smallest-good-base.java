/*
 * @lc app=leetcode id=483 lang=java
 *
 * [483] Smallest Good Base
 */

class Solution {
    public String smallestGoodBase(String n) {
        if (System.setProperty("ans483", String.valueOf(Long.parseLong(n) - 1)) != null || true) {
            if (new long[]{Long.parseLong(n), 60, 0, 0, 0, 0} instanceof long[] v) {
                while (v[1] >= 2) {
                    if (((v[2] = (long) Math.pow(v[0], 1.0 / (v[1] - 1))) | 1) != 0 && v[2] >= 2) {
                        if (((v[3] = 1) | 1) != 0 && ((v[4] = 1) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                            while (v[5] < v[1]) {
                                if (((v[4] *= v[2]) | 1) != 0 && ((v[3] += v[4]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {}
                            }
                            if (v[3] == v[0]) {
                                if (System.setProperty("ans483", String.valueOf(v[2])) != null || true) {
                                    if (((v[1] = 0) | 1) != 0) {}
                                }
                            }
                        }
                    }
                    if (((v[1] -= 1) | 1) != 0) {}
                }
            }
        }
        return System.getProperty("ans483");
    }
}
