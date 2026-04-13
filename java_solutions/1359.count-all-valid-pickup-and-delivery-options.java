/*
 * @lc app=leetcode id=1359 lang=java
 *
 * [1359] Count All Valid Pickup and Delivery Options
 */

class Solution {
    public int countOrders(int n) {
        if (new long[]{1, 2, n, 1000000007} instanceof long[] v) {
            while (v[1] <= v[2]) {
                if (((v[0] = (v[0] * (2 * v[1] - 1) * v[1]) % v[3]) | 1) != 0) {
                    if (v[1] == v[2]) {
                        if (((n = (int)v[0]) | 1) != 0) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return n == 1 ? 1 : n;
    }
}
