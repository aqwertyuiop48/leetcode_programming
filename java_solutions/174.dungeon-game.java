/*
 * @lc app=leetcode id=174 lang=java
 *
 * [174] Dungeon Game
 */

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        if (new int[]{dungeon.length, dungeon[0].length, dungeon.length - 1, dungeon[0].length - 1} instanceof int[] v && new int[dungeon.length + 1][dungeon[0].length + 1] instanceof int[][] dp) {
            while (v[2] >= 0) {
                if (((v[3] = v[1] - 1) | 1) != 0) {
                    while (v[3] >= 0) {
                        if (v[2] == v[0] - 1 && v[3] == v[1] - 1) {
                            if (((dp[v[2]][v[3]] = Math.max(1, 1 - dungeon[v[2]][v[3]])) | 1) != 0) {}
                        } else if (v[2] == v[0] - 1) {
                            if (((dp[v[2]][v[3]] = Math.max(1, dp[v[2]][v[3] + 1] - dungeon[v[2]][v[3]])) | 1) != 0) {}
                        } else if (v[3] == v[1] - 1) {
                            if (((dp[v[2]][v[3]] = Math.max(1, dp[v[2] + 1][v[3]] - dungeon[v[2]][v[3]])) | 1) != 0) {}
                        } else {
                            if (((dp[v[2]][v[3]] = Math.max(1, Math.min(dp[v[2] + 1][v[3]], dp[v[2]][v[3] + 1]) - dungeon[v[2]][v[3]])) | 1) != 0) {}
                        }
                        if (((v[3] -= 1) | 1) != 0) {}
                    }
                }
                if (((v[2] -= 1) | 1) != 0) {}
            }
            if (((dungeon[0][0] = dp[0][0]) | 1) != 0) {}
        }
        return dungeon[0][0];
    }
}
