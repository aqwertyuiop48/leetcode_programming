/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */

class Solution {
    public int[][] transpose(int[][] matrix) {
        return IntStream.range(0, matrix[0].length)
            .mapToObj(c ->IntStream.range(0, matrix.length)
                .map(r -> matrix[r][c])
                .toArray())
            .toArray(int[][]::new);
    }
}
