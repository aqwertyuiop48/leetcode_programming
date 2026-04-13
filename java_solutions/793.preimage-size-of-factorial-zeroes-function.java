/*
 * @lc app=leetcode id=793 lang=java
 *
 * [793] Preimage Size of Factorial Zeroes Function
 */

class Solution {
    public int preimageSizeFZF(int k) {
        if (new long[]{0, 5L * (k + 1), 0, 0, 0, 0} instanceof long[] v) {
            while (v[0] <= v[1]) {
                if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = v[2]) | 1) != 0) {
                    while (v[4] > 0) {
                        if (((v[3] += v[4] / 5) | 1) != 0 && ((v[4] /= 5) | 1) != 0) {}
                    }
                    if (v[3] == k) {
                        if (((k = 5) | 1) != 0 && ((v[0] = v[1] + 1) | 1) != 0 && ((v[5] = 1) | 1) != 0) {}
                    } else if (v[3] < k) {
                        if (((v[0] = v[2] + 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = v[2] - 1) | 1) != 0) {}
                    }
                }
            }
            if (v[5] == 0) {
                if (((k = 0) | 1) != 0) {}
            }
        }
        return k;
    }
}
