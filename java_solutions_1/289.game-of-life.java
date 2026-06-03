/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

// @lc code=start
class Solution {
    public void gameOfLife(int[][] board) {
        java.util.stream.Stream.of(0).map(_v -> board).peek(b -> java.util.stream.IntStream.range(0, b.length).forEach(i -> java.util.stream.IntStream.range(0, b[0].length).forEach(j -> java.util.stream.Stream.of(java.util.stream.IntStream.rangeClosed(Math.max(0, i - 1), Math.min(b.length - 1, i + 1)).map(r -> java.util.stream.IntStream.rangeClosed(Math.max(0, j - 1), Math.min(b[0].length - 1, j + 1)).map(c -> b[r][c] & 1).sum()).sum() - (b[i][j] & 1)).forEach(sum -> b[i][j] |= (sum == 3 || (sum == 2 && (b[i][j] & 1) == 1)) ? 2 : 0)))).forEach(b -> java.util.stream.IntStream.range(0, b.length).forEach(i -> java.util.stream.IntStream.range(0, b[0].length).forEach(j -> b[i][j] >>= 1)));
    }
}
// @lc code=end
