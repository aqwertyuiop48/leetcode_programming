/*
 * @lc app=leetcode id=1690 lang=java
 *
 * [1690] Stone Game VII
 */

class Solution {
    public int stoneGameVII(int[] stones) {
        if (new int[stones.length + 1] instanceof int[] p && new int[stones.length][stones.length] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put("sg7", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < stones.length) { if (((p[v[0] + 1] = p[v[0]] + stones[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] <= stones.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] <= stones.length - v[0]) {
                                if (((v[2] = v[1] + v[0] - 1) | 1) != 0 && ((dp[v[1]][v[2]] = Math.max(p[v[2] + 1] - p[v[1] + 1] - dp[v[1] + 1][v[2]], p[v[2]] - p[v[1]] - dp[v[1]][v[2] - 1])) | 1) != 0) {}
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("sg7", dp[0][stones.length - 1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("sg7");
    }
}
