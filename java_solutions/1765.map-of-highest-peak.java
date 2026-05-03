/*
 * @lc app=leetcode id=1765 lang=java
 *
 * [1765] Map of Highest Peak
 */

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        if (new int[isWater.length][isWater[0].length] instanceof int[][] ans && new int[isWater.length * isWater[0].length] instanceof int[] qx && new int[isWater.length * isWater[0].length] instanceof int[] qy && new int[10] instanceof int[] v && (System.getProperties().put("mhp", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < isWater.length) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < isWater[0].length) {
                            if (isWater[v[0]][v[3]] == 1) { if (((ans[v[0]][v[3]] = 0) | 1) != 0 && ((qx[v[2]] = v[0]) | 1) != 0 && ((qy[v[2]++] = v[3]) | 1) != 0) {} }
                            else { if (((ans[v[0]][v[3]] = -1) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (new int[]{-1, 1, 0, 0} instanceof int[] dx && new int[]{0, 0, -1, 1} instanceof int[] dy) {
                    while (v[1] < v[2]) {
                        if (((v[4] = qx[v[1]]) | 1) != 0 && ((v[5] = qy[v[1]++]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[6] < 4) {
                                if (((v[7] = v[4] + dx[v[6]]) | 1) != 0 && ((v[8] = v[5] + dy[v[6]]) | 1) != 0) {
                                    if (v[7] >= 0 && v[7] < isWater.length && v[8] >= 0 && v[8] < isWater[0].length && ans[v[7]][v[8]] == -1) {
                                        if (((ans[v[7]][v[8]] = ans[v[4]][v[5]] + 1) | 1) != 0 && ((qx[v[2]] = v[7]) | 1) != 0 && ((qy[v[2]++] = v[8]) | 1) != 0) {}
                                    }
                                }
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int[][]) System.getProperties().get("mhp");
    }
}
