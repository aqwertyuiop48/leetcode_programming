/*
 * @lc app=leetcode id=1292 lang=java
 *
 * [1292] Maximum Side Length of a Square with Sum Less than or Equal to Threshold
 */

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        if (new int[mat.length + 1][mat[0].length + 1] instanceof int[][] p && new int[10] instanceof int[] v && (System.getProperties().put("msl", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= mat.length) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] <= mat[0].length) {
                            if (((p[v[0]][v[1]] = p[v[0] - 1][v[1]] + p[v[0]][v[1] - 1] - p[v[0] - 1][v[1] - 1] + mat[v[0] - 1][v[1] - 1]) | 1) != 0 && ((v[2] = v[0] - v[3]) | 1) != 0 && ((v[4] = v[1] - v[3]) | 1) != 0) {
                                if (v[2] > 0 && v[4] > 0 && p[v[0]][v[1]] - p[v[2] - 1][v[1]] - p[v[0]][v[4] - 1] + p[v[2] - 1][v[4] - 1] <= threshold) {
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("msl", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("msl");
    }
}
