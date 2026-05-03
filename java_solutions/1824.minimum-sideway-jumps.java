/*
 * @lc app=leetcode id=1824 lang=java
 *
 * [1824] Minimum Sideway Jumps
 */

class Solution {
    public int minSideJumps(int[] obstacles) {
        if (new int[3] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("msj", 0) != null | true)) {
            if (((dp[0] = 1) | 1) != 0 && ((dp[1] = 0) | 1) != 0 && ((dp[2] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < obstacles.length) {
                    if (((v[1] = obstacles[v[0]] - 1) | 1) != 0 && v[1] >= 0) { if (((dp[v[1]] = 999999) | 1) != 0) {} }
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < 3) {
                            if (v[2] != v[1]) { if (((dp[v[2]] = Math.min(dp[v[2]], Math.min(dp[(v[2] + 1) % 3], dp[(v[2] + 2) % 3]) + 1)) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("msj", Math.min(dp[0], Math.min(dp[1], dp[2]))) != null | true) {}
            }
        }
        return (int) System.getProperties().get("msj");
    }
}
