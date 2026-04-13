/*
 * @lc app=leetcode id=552 lang=java
 *
 * [552] Student Attendance Record II
 */

class Solution {
    public int checkRecord(int n) {
        if (new long[]{0, 0, 0, 1000000007, 0} instanceof long[] v && new long[2][3] instanceof long[][] dp && new long[2][3] instanceof long[][] next) {
            if (((dp[0][0] = 1) | 1) != 0) {
                while (v[0] < n) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < 2) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 3) {
                                    if (((next[(int)v[1]][(int)v[2]] = 0) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < 2) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 3) {
                                    if (dp[(int)v[1]][(int)v[2]] > 0) {
                                        if (((next[(int)v[1]][0] = (next[(int)v[1]][0] + dp[(int)v[1]][(int)v[2]]) % v[3]) | 1) != 0) {}
                                        if (v[1] == 0) {
                                            if (((next[1][0] = (next[1][0] + dp[(int)v[1]][(int)v[2]]) % v[3]) | 1) != 0) {}
                                        }
                                        if (v[2] < 2) {
                                            if (((next[(int)v[1]][(int)v[2] + 1] = (next[(int)v[1]][(int)v[2] + 1] + dp[(int)v[1]][(int)v[2]]) % v[3]) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < 2) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 3) {
                                    if (((dp[(int)v[1]][(int)v[2]] = next[(int)v[1]][(int)v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[1] < 2) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < 3) {
                                if (((v[4] = (v[4] + dp[(int)v[1]][(int)v[2]]) % v[3]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
            if (((n = (int)v[4]) | 1) != 0) {}
        }
        return n;
    }
}
