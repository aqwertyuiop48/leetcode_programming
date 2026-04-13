/*
 * @lc app=leetcode id=1723 lang=java
 *
 * [1723] Find Minimum Time to Finish All Jobs
 */

class Solution {
    public int minimumTimeRequired(int[] jobs, int k) {
        if (new int[]{0, 0, 0, 0, jobs.length} instanceof int[] v && new int[1 << jobs.length] instanceof int[] sum && new int[1 << jobs.length] instanceof int[] dp && new int[1 << jobs.length] instanceof int[] next) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[1] < (1 << v[4])) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < v[4]) {
                                if (((v[1] & (1 << v[2])) != 0)) {
                                    if (((sum[v[1]] += jobs[v[2]]) | 1) != 0) {}
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((dp[v[1]] = sum[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < k) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < (1 << v[4])) {
                                if (((next[v[2]] = 2000000000) | 1) != 0 && ((v[3] = v[2]) | 1) != 0) {
                                    while (v[3] > 0) {
                                        if (((next[v[2]] = Math.min(next[v[2]], Math.max(dp[v[2] ^ v[3]], sum[v[3]]))) | 1) != 0) {}
                                        if (((v[3] = (v[3] - 1) & v[2]) | 1) != 0) {}
                                    }
                                    if (((next[v[2]] = Math.min(next[v[2]], Math.max(dp[v[2]], 0))) | 1) != 0) {}
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < (1 << v[4])) {
                                if (((dp[v[2]] = next[v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((jobs[0] = dp[(1 << v[4]) - 1]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                    }
                }
            }
        }
        return jobs[0];
    }
}
