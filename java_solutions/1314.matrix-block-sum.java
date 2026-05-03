/*
 * @lc app=leetcode id=1314 lang=java
 *
 * [1314] Matrix Block Sum
 */

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        if (new int[mat.length + 1][mat[0].length + 1] instanceof int[][] p && new int[mat.length][mat[0].length] instanceof int[][] ans && new int[15] instanceof int[] v && (System.getProperties().put("mbs", ans) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= mat.length) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] <= mat[0].length) {
                            if (((p[v[0]][v[1]] = p[v[0]-1][v[1]] + p[v[0]][v[1]-1] - p[v[0]-1][v[1]-1] + mat[v[0]-1][v[1]-1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < mat.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < mat[0].length) {
                                if (((v[2] = Math.max(0, v[0] - k)) | 1) != 0 && ((v[3] = Math.max(0, v[1] - k)) | 1) != 0 && ((v[4] = Math.min(mat.length - 1, v[0] + k)) | 1) != 0 && ((v[5] = Math.min(mat[0].length - 1, v[1] + k)) | 1) != 0) {
                                    if (((ans[v[0]][v[1]] = p[v[4]+1][v[5]+1] - p[v[2]][v[5]+1] - p[v[4]+1][v[3]] + p[v[2]][v[3]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[][]) System.getProperties().get("mbs");
    }
}
