/*
 * @lc app=leetcode id=2555 lang=java
 *
 * [2555] Maximize Win From Two Segments
 */

class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        if (new int[prizePositions.length] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("mw", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < prizePositions.length) {
                    while (prizePositions[v[0]] - prizePositions[v[1]] > k) { if (((v[1] += 1) | 1) != 0) {} }
                    if (v[0] - v[1] + 1 + (v[1] > 0 ? dp[v[1] - 1] : 0) > v[2]) { if (((v[2] = v[0] - v[1] + 1 + (v[1] > 0 ? dp[v[1] - 1] : 0)) | 1) != 0) {} }
                    if (((dp[v[0]] = Math.max(v[0] > 0 ? dp[v[0] - 1] : 0, v[0] - v[1] + 1)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mw", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mw");
    }
}
