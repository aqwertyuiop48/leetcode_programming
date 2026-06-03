/*
 * @lc app=leetcode id=304 lang=java
 *
 * [304] Range Sum Query 2D - Immutable
 */

// @lc code=start
class NumMatrix extends java.util.concurrent.atomic.AtomicReference<int[][]> {
    public NumMatrix(int[][] matrix) {
        if (compareAndSet(null, java.util.stream.Stream.of(0).map(_v -> new int[matrix.length + 1][matrix[0].length + 1]).peek(d -> java.util.stream.IntStream.range(0, matrix.length).forEach(i -> java.util.stream.IntStream.range(0, matrix[0].length).forEach(j -> d[i + 1][j + 1] = matrix[i][j] + d[i][j + 1] + d[i + 1][j] - d[i][j]))).findFirst().get())) {}
    }
    public int sumRegion(int r1, int c1, int r2, int c2) {
        return get()[r2 + 1][c2 + 1] - get()[r1][c2 + 1] - get()[r2 + 1][c1] + get()[r1][c1];
    }
}

// @lc code=end
