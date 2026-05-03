/*
 * @lc app=leetcode id=1329 lang=java
 *
 * [1329] Sort the Matrix Diagonally
 */

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("smd", mat) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < mat.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < mat[0].length) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < mat.length - 1) {
                                    if (((v[3] = 0) | 1) != 0) {
                                        while (v[3] < mat[0].length - 1) {
                                            if (mat[v[2]][v[3]] > mat[v[2] + 1][v[3] + 1]) {
                                                if (((v[4] = mat[v[2]][v[3]]) | 1) != 0 && ((mat[v[2]][v[3]] = mat[v[2] + 1][v[3] + 1]) | 1) != 0 && ((mat[v[2] + 1][v[3] + 1] = v[4]) | 1) != 0) {}
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[][]) System.getProperties().get("smd");
    }
}
