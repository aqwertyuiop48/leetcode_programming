/*
 * @lc app=leetcode id=766 lang=java
 *
 * [766] Toeplitz Matrix
 */

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        return IntStream.range(0, matrix.length - 1)
            .allMatch(r -> IntStream.range(0, matrix[0].length - 1)
                .allMatch(c -> matrix[r][c] == matrix[r + 1][c + 1]));
    }
}
