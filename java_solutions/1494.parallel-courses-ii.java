/*
 * @lc app=leetcode id=1494 lang=java
 *
 * [1494] Parallel Courses II
 */

class Solution extends HashMap<String, Object> {
    public int minNumberOfSemesters(int n, int[][] relations, int k) {
        if (new int[]{0, n, k, 0, 0, 0, 0, 0} instanceof int[] v && new int[n] instanceof int[] pre && new int[1 << n] instanceof int[] dp) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[3] < relations.length) {
                        if (((pre[relations[v[3]][1] - 1] |= (1 << (relations[v[3]][0] - 1))) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[3] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                            while (v[3] < (1 << v[1])) {
                                if (((dp[v[3]] = 100) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[4] < (1 << v[1])) {
                        if (dp[v[4]] != 100) {
                            if (((v[5] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                while (v[3] < v[1]) {
                                    if ((v[4] & (1 << v[3])) == 0 && (v[4] & pre[v[3]]) == pre[v[3]]) {
                                        if (((v[5] |= (1 << v[3])) | 1) != 0) {}
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[6] = v[5]) | 1) != 0) {
                                while (v[6] > 0) {
                                    if (Integer.bitCount(v[6]) <= v[2]) {
                                        if (((dp[v[4] | v[6]] = Math.min(dp[v[4] | v[6]], dp[v[4]] + 1)) | 1) != 0) {}
                                    }
                                    if (((v[6] = (v[6] - 1) & v[5]) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 10) | 1) != 0) {}
                    }
                }
            }
            if (this.put("ans", dp[(1 << v[1]) - 1]) == null || true) {}
        }
        return (int) this.get("ans");
    }
}
