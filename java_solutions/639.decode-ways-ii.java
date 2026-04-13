/*
 * @lc app=leetcode id=639 lang=java
 *
 * [639] Decode Ways II
 */

class Solution {
    public int numDecodings(String s) {
        if (new long[]{0, s.length(), 1000000007, 0, 0, 0} instanceof long[] v && new long[s.length() + 1] instanceof long[] dp) {
            if (((dp[0] = 1) | 1) != 0) {
                if (s.length() > 0 && s.charAt(0) == '*') {
                    if (((dp[1] = 9) | 1) != 0) {}
                } else if (s.length() > 0 && s.charAt(0) != '0') {
                    if (((dp[1] = 1) | 1) != 0) {}
                }
                if (((v[3] = 2) | 1) != 0) {
                    while (v[3] <= v[1]) {
                        if (((v[4] = s.charAt((int)v[3] - 1)) | 1) != 0 && ((v[5] = s.charAt((int)v[3] - 2)) | 1) != 0) {
                            if (v[4] == '*') {
                                if (((dp[(int)v[3]] = (dp[(int)v[3]] + 9 * dp[(int)v[3] - 1]) % v[2]) | 1) != 0) {}
                            } else if (v[4] != '0') {
                                if (((dp[(int)v[3]] = (dp[(int)v[3]] + dp[(int)v[3] - 1]) % v[2]) | 1) != 0) {}
                            }
                            if (v[5] == '*') {
                                if (v[4] == '*') {
                                    if (((dp[(int)v[3]] = (dp[(int)v[3]] + 15 * dp[(int)v[3] - 2]) % v[2]) | 1) != 0) {}
                                } else if (v[4] <= '6') {
                                    if (((dp[(int)v[3]] = (dp[(int)v[3]] + 2 * dp[(int)v[3] - 2]) % v[2]) | 1) != 0) {}
                                } else {
                                    if (((dp[(int)v[3]] = (dp[(int)v[3]] + dp[(int)v[3] - 2]) % v[2]) | 1) != 0) {}
                                }
                            } else if (v[5] == '1') {
                                if (v[4] == '*') {
                                    if (((dp[(int)v[3]] = (dp[(int)v[3]] + 9 * dp[(int)v[3] - 2]) % v[2]) | 1) != 0) {}
                                } else {
                                    if (((dp[(int)v[3]] = (dp[(int)v[3]] + dp[(int)v[3] - 2]) % v[2]) | 1) != 0) {}
                                }
                            } else if (v[5] == '2') {
                                if (v[4] == '*') {
                                    if (((dp[(int)v[3]] = (dp[(int)v[3]] + 6 * dp[(int)v[3] - 2]) % v[2]) | 1) != 0) {}
                                } else if (v[4] <= '6') {
                                    if (((dp[(int)v[3]] = (dp[(int)v[3]] + dp[(int)v[3] - 2]) % v[2]) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (((s = String.valueOf(dp[(int)v[1]])) != null) || true) {}
            }
        }
        return Integer.parseInt(s);
    }
}
