/*
 * @lc app=leetcode id=668 lang=java
 *
 * [668] Kth Smallest Number in Multiplication Table
 */

class Solution {
    public int findKthNumber(int m, int n, int k) {
        if (new int[]{1, m * n, 0, 0, 0, 0} instanceof int[] v) {
            while (v[0] <= v[1]) {
                if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                    while (v[4] <= m) {
                        if (((v[3] += Math.min(v[2] / v[4], n)) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                    }
                    if (v[3] >= k) {
                        if (((v[5] = v[2]) | 1) != 0 && ((v[1] = v[2] - 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = v[2] + 1) | 1) != 0) {}
                    }
                }
            }
            if (((k = v[5]) | 1) != 0) {}
        }
        return k;
    }
}
