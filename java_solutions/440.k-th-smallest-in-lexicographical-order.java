/*
 * @lc app=leetcode id=440 lang=java
 *
 * [440] K-th Smallest in Lexicographical Order
 */

class Solution {
    public int findKthNumber(int n, int k) {
        if (new long[]{1, k - 1, 0, 0, 0} instanceof long[] v) {
            while (v[1] > 0) {
                if (((v[2] = 0) | 1) != 0 && ((v[3] = v[0]) | 1) != 0 && ((v[4] = v[0] + 1) | 1) != 0) {
                    while (v[3] <= n) {
                        if (((v[2] += Math.min(n + 1, v[4]) - v[3]) | 1) != 0 && ((v[3] *= 10) | 1) != 0 && ((v[4] *= 10) | 1) != 0) {}
                    }
                    if (v[2] <= v[1]) {
                        if (((v[0] += 1) | 1) != 0 && ((v[1] -= v[2]) | 1) != 0) {}
                    } else {
                        if (((v[0] *= 10) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                    }
                }
            }
            if (((k = (int)v[0]) | 1) != 0) {}
        }
        return k;
    }
}
