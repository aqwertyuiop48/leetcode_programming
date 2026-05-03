/*
 * @lc app=leetcode id=1277 lang=java
 *
 * [1277] Count Square Submatrices with All Ones
 */

class Solution {
    public int countSquares(int[][] matrix) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("csq", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < matrix.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < matrix[0].length) {
                            if (matrix[v[0]][v[1]] == 1) {
                                if (v[0] > 0 && v[1] > 0) { if (((matrix[v[0]][v[1]] = Math.min(matrix[v[0]-1][v[1]-1], Math.min(matrix[v[0]-1][v[1]], matrix[v[0]][v[1]-1])) + 1) | 1) != 0) {} }
                                if (System.getProperties().put("csq", (int)System.getProperties().get("csq") + matrix[v[0]][v[1]]) != null | true) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("csq");
    }
}
