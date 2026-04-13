/*
 * @lc app=leetcode id=629 lang=java
 *
 * [629] K Inverse Pairs Array
 */

class Solution {
    public int kInversePairs(int n, int k) {
        if (new long[]{0, 1, 0, 1000000007, 0} instanceof long[] v && new long[k+1] instanceof long[] dp) {
            if (((dp[0] = 1) | 1) != 0) {
                while (v[1] <= n) {
                    if (((v[4] = 0) | 1) != 0 && new long[k+1] instanceof long[] next) {
                        while (v[4] <= k) {
                            if (((next[(int)v[4]] = (dp[(int)v[4]] + (v[4] > 0 ? next[(int)v[4] - 1] : 0) - (v[4] >= v[1] ? dp[(int)(v[4] - v[1])] : 0) + v[3]) % v[3]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                        }
                        if (((v[4] = 0) | 1) != 0) {
                            while (v[4] <= k) {
                                if (((dp[(int)v[4]] = next[(int)v[4]]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
            if (((n = (int)dp[k]) | 1) != 0) {}
        }
        return n;
    }
}
