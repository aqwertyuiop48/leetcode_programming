/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
// semicolons : 1
class Solution {
    public void rotate(int[][] matrix) {
        IntStream.concat(IntStream.range(0, matrix.length / 2).peek(i -> Optional.of(matrix[i]).ifPresent(temp -> Optional.of(matrix[i] = matrix[matrix.length - i - 1]).ifPresent(x -> matrix[matrix.length - i - 1] = temp))), IntStream.range(0, matrix.length).flatMap(i -> IntStream.range(i + 1, matrix.length).peek(j -> Optional.of(matrix[i][j] ^= matrix[j][i]).ifPresent(y -> Optional.of(matrix[j][i] ^= matrix[i][j]).ifPresent(z -> matrix[i][j] ^= matrix[j][i]))))).count();
    }
}
// @lc code=end

