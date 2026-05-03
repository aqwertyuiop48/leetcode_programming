/*
 * @lc app=leetcode id=1620 lang=java
 *
 * [1620] Coordinate With Maximum Network Quality
 */

class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        if (new int[2] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("bco", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] <= 50) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= 50) {
                            if (((v[2] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < towers.length) {
                                    if (((v[5] = (towers[v[4]][0] - v[0]) * (towers[v[4]][0] - v[0]) + (towers[v[4]][1] - v[1]) * (towers[v[4]][1] - v[1])) | 1) != 0 && v[5] <= radius * radius) {
                                        if (((v[2] += Math.floor(towers[v[4]][2] / (1 + Math.sqrt(v[5])))) | 1) != 0) {}
                                    }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                if (v[2] > v[3]) { if (((v[3] = v[2]) | 1) != 0 && ((ans[0] = v[0]) | 1) != 0 && ((ans[1] = v[1]) | 1) != 0) {} }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("bco");
    }
}
