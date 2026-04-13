/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        Optional.of(new Boolean[][]{IntStream.range(0, matrix.length).mapToObj(r -> IntStream.range(0, matrix[0].length).anyMatch(c -> matrix[r][c] == 0)).toArray(Boolean[]::new), IntStream.range(0, matrix[0].length).mapToObj(c -> IntStream.range(0, matrix.length).anyMatch(r -> matrix[r][c] == 0)).toArray(Boolean[]::new)}).ifPresent(flags -> IntStream.range(0, matrix.length).forEach(i -> IntStream.range(0, matrix[0].length).forEach(j -> Optional.of(matrix).filter(m -> flags[0][i] || flags[1][j]).ifPresent(m -> m[i][j] = 0))));
    }
}
