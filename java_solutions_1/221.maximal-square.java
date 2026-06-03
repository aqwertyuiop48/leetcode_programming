/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        return matrix.length == 0 ? 0 : java.util.stream.Stream.<int[][]>of(new int[matrix.length + 1][matrix[0].length + 1]).map(dp -> java.util.stream.IntStream.range(0, matrix.length).map(i -> java.util.stream.IntStream.range(0, matrix[0].length).map(j -> matrix[i][j] == '1' ? (dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j]), dp[i][j]) + 1) : 0).max().orElse(0)).max().orElse(0)).map(max -> max * max).findFirst().get();
    }
}
// @lc code=end
