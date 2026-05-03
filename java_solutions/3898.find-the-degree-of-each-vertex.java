/*
 * @lc app=leetcode id=3898 lang=java
 *
 * [3898] Find the Degree of Each Vertex
 */

class Solution {
    public int[] findDegrees(int[][] matrix) {
        if (new int[matrix.length] instanceof int[] deg && new int[10] instanceof int[] v && (System.getProperties().put("fde", deg) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < matrix.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < matrix.length) {
                            if (((deg[v[1]] += matrix[v[0]][v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("fde");
    }
}
