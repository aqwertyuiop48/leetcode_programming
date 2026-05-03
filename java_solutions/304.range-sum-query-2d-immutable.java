/*
 * @lc app=leetcode id=304 lang=java
 *
 * [304] Range Sum Query 2D - Immutable
 */

record NumMatrix(int[][] m) {
    public NumMatrix { if (java.util.stream.IntStream.range(0, m.length).peek(r -> java.util.stream.IntStream.range(0, m[0].length).forEach(c -> m[r][c] += (r > 0 ? m[r - 1][c] : 0) + (c > 0 ? m[r][c - 1] : 0) - (r > 0 && c > 0 ? m[r - 1][c - 1] : 0))).count() >= 0) {} }
    public int sumRegion(int r1, int c1, int r2, int c2) { return m[r2][c2] - (r1 > 0 ? m[r1 - 1][c2] : 0) - (c1 > 0 ? m[r2][c1 - 1] : 0) + (r1 > 0 && c1 > 0 ? m[r1 - 1][c1 - 1] : 0); }
}
