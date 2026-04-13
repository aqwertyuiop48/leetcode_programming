/*
 * @lc app=leetcode id=1751 lang=java
 *
 * [1751] Maximum Number of Events That Can Be Attended II
 */

class Solution {
    public int maxValue(int[][] e, int k) {
        if (new int[]{0, e.length - 1, 1, 0, 0, 0, e.length, 0} instanceof int[] v && new int[e.length + 1][k + 1] instanceof int[][] dp) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (((e = Arrays.stream(e).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null) && ((v[0] = 1) | 1) != 0) {}
                } else if (v[0] == 1) {
                    if (v[1] >= 0) {
                        if (((v[2] = 1) | 1) != 0 && ((v[3] = v[1] + 1) | 1) != 0 && ((v[4] = e.length - 1) | 1) != 0 && ((v[6] = e.length) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((k = dp[0][k]) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] <= v[4]) {
                        if (((v[5] = v[3] + (v[4] - v[3]) / 2) | 1) != 0) {
                            if (e[v[5]][0] > e[v[1]][1]) {
                                if (((v[6] = v[5]) | 1) != 0 && ((v[4] = v[5] - 1) | 1) != 0) {}
                            } else {
                                if (((v[3] = v[5] + 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[2] <= k) {
                        if (((dp[v[1]][v[2]] = Math.max(dp[v[1] + 1][v[2]], dp[v[6]][v[2] - 1] + e[v[1]][2])) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return k;
    }
}
