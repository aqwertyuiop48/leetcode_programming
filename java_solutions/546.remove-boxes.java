/*
 * @lc app=leetcode id=546 lang=java
 *
 * [546] Remove Boxes
 */

class Solution {
    public int removeBoxes(int[] boxes) {
        if (new int[]{0, 0, 0, 0, 0, boxes.length} instanceof int[] v && new int[105][105][105] instanceof int[][][] dp) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= v[5]) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= v[5] - v[0]) {
                            if (((v[2] = v[1] + v[0] - 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                while (v[3] <= v[5] - v[2] - 1) {
                                    if (((dp[v[1]][v[2]][v[3]] = (v[2] > v[1] ? dp[v[1]][v[2] - 1][0] : 0) + (v[3] + 1) * (v[3] + 1)) | 1) != 0 && ((v[4] = v[1]) | 1) != 0) {
                                        while (v[4] < v[2]) {
                                            if (boxes[v[4]] == boxes[v[2]]) {
                                                if (((dp[v[1]][v[2]][v[3]] = Math.max(dp[v[1]][v[2]][v[3]], dp[v[1]][v[4]][v[3] + 1] + (v[4] + 1 <= v[2] - 1 ? dp[v[4] + 1][v[2] - 1][0] : 0))) | 1) != 0) {}
                                            }
                                            if (((v[4] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (v[5] > 0) {
                if (((boxes[0] = dp[0][v[5] - 1][0]) | 1) != 0) {}
            }
        }
        return boxes.length > 0 ? boxes[0] : 0;
    }
}
