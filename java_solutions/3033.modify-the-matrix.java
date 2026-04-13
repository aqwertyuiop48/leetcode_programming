/*
 * @lc app=leetcode id=3033 lang=java
 *
 * [3033] Modify the Matrix
 */

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        return IntStream.range(0, matrix.length)
            .mapToObj(r -> IntStream.range(0, matrix[0].length)
                .map(c -> matrix[r][c] == -1 ? IntStream.range(0, matrix.length).map(i -> matrix[i][c]).max().getAsInt() : matrix[r][c])
                .toArray())
            .toArray(int[][]::new);
    }
}
