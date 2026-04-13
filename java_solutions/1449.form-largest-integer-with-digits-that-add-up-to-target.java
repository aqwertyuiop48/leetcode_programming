/*
 * @lc app=leetcode id=1449 lang=java
 *
 * [1449] Form Largest Integer With Digits That Add up to Target
 */

class Solution {
    public String largestNumber(int[] cost, int target) {
        if (new int[]{0, 1, 0, target, 0, 0, 0} instanceof int[] v && new int[target + 1] instanceof int[] dp && new Object[]{new char[target + 1]} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] <= v[3]) {
                        if (((dp[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= v[3]) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < 9) {
                                if (v[1] >= cost[v[2]] && dp[v[1] - cost[v[2]]] != -1) {
                                    if (((dp[v[1]] = Math.max(dp[v[1]], 1 + dp[v[1] - cost[v[2]]])) | 1) != 0) {}
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (dp[v[3]] == -1) {
                            if (System.setProperty("ans", "0") != null || true) {
                                if (((v[0] = 4) | 1) != 0) {}
                            }
                        } else {
                            if (((v[4] = v[3]) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[2] = 8) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[2] >= 0) {
                        while (v[4] >= cost[v[2]] && dp[v[4]] == dp[v[4] - cost[v[2]]] + 1) {
                            if (((((char[])obj[0])[v[5]++] = (char)('1' + v[2])) != 0 || true) && ((v[4] -= cost[v[2]]) | 1) != 0) {}
                        }
                        if (((v[2] -= 1) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", new String((char[])obj[0], 0, v[5])) != null || true) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return System.getProperty("ans", "0");
    }
}
