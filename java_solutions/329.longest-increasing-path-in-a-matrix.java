/*
 * @lc app=leetcode id=329 lang=java
 *
 * [329] Longest Increasing Path in a Matrix
 */

class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (System.getProperties().put("ans329", 0) != null || true) {
            if (new int[]{0, matrix.length, matrix[0].length, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[matrix.length * matrix[0].length][3], new int[matrix.length][matrix[0].length], new int[]{0, 0, 1, -1}, new int[]{1, -1, 0, 0}} instanceof Object[] obj) {
                while (v[0] < v[1]) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < v[2]) {
                            if ((((int[][])obj[0])[v[4]][0] = matrix[v[0]][v[3]]) != -1 && ((((int[][])obj[0])[v[4]][1] = v[0]) != -1) && ((((int[][])obj[0])[v[4]][2] = v[3]) != -1)) {
                                if (((v[3] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((obj[0] = Arrays.stream((int[][])obj[0]).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null || true) && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < v[4]) {
                        if (((v[5] = ((int[][])obj[0])[v[0]][1]) | 1) != 0 && ((v[6] = ((int[][])obj[0])[v[0]][2]) | 1) != 0) {
                            if (((v[3] = 0) | 1) != 0 && ((((int[][])obj[1])[v[5]][v[6]] = Math.max(1, ((int[][])obj[1])[v[5]][v[6]])) | 1) != 0) {
                                while (v[3] < 4) {
                                    if (((v[8] = v[5] + ((int[])obj[2])[v[3]]) | 1) != 0 && ((v[9] = v[6] + ((int[])obj[3])[v[3]]) | 1) != 0) {
                                        if (v[8] >= 0 && v[8] < v[1] && v[9] >= 0 && v[9] < v[2] && matrix[v[8]][v[9]] > matrix[v[5]][v[6]]) {
                                            if ((((int[][])obj[1])[v[8]][v[9]] = Math.max(((int[][])obj[1])[v[8]][v[9]], ((int[][])obj[1])[v[5]][v[6]] + 1)) != -1) {
                                                if (((v[7] = Math.max(v[7], ((int[][])obj[1])[v[8]][v[9]])) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ans329", v[7]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans329");
    }
}
