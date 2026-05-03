/*
 * @lc app=leetcode id=1024 lang=java
 *
 * [1024] Video Stitching
 */

class Solution {
    public int videoStitching(int[][] clips, int time) {
        if (new int[time + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("vs", -1) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] <= time) { if (((dp[v[0]++] = 100) | 1) != 0) {} }
            if (((dp[0] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] <= time) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < clips.length) {
                            if (clips[v[1]][0] <= v[0] && clips[v[1]][1] >= v[0] && dp[clips[v[1]][0]] + 1 < dp[v[0]]) { if (((dp[v[0]] = dp[clips[v[1]][0]] + 1) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("vs", dp[time] >= 100 ? -1 : dp[time]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("vs");
    }
}
