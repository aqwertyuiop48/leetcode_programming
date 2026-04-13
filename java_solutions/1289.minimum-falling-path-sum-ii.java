/*
 * @lc app=leetcode id=1289 lang=java
 *
 * [1289] Minimum Falling Path Sum II
 */

class Solution {
    public int minFallingPathSum(int[][] grid) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{grid.length, 0, 0, 0, 0, 0, Integer.MAX_VALUE} instanceof int[] v && new int[grid.length][grid.length] instanceof int[][] dp) {
                while (v[1] < v[0]) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < v[0]) {
                            if (v[1] == 0) {
                                if (((dp[v[1]][v[2]] = grid[v[1]][v[2]]) | 1) != 0) {}
                            } else {
                                if (((v[3] = Integer.MAX_VALUE) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                    while (v[4] < v[0]) {
                                        if (v[2] != v[4]) {
                                            if (((v[3] = Math.min(v[3], grid[v[1]][v[2]] + dp[v[1] - 1][v[4]])) | 1) != 0) {}
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((dp[v[1]][v[2]] = v[3]) | 1) != 0) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[0]) {
                        if (((v[6] = Math.min(v[6], dp[v[0] - 1][v[2]])) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((res[0] = v[6]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
