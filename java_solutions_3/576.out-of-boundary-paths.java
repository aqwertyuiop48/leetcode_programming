/*
 * @lc app=leetcode id=576 lang=java
 *
 * [576] Out of Boundary Paths
 */

class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        return new long[][][]{new long[m][n]} instanceof long[][][] c && (c[0][startRow][startColumn] = 1) == 1
            ? (int) (java.util.stream.IntStream.range(0, maxMove).mapToLong(s -> java.util.stream.Stream.<long[][]>of(new long[m][n]).mapToLong(nx ->
                java.util.stream.IntStream.range(0, 4 * m * n).mapToLong(k -> java.util.stream.Stream.of(new int[]{k / 4 / n, k / 4 % n, k / 4 / n + new int[]{1, -1, 0, 0}[k % 4], k / 4 % n + new int[]{0, 0, 1, -1}[k % 4]}).mapToLong(p ->
                    p[2] < 0 || p[3] < 0 || p[2] >= m || p[3] >= n ? c[0][p[0]][p[1]] : 0 * (nx[p[2]][p[3]] = (nx[p[2]][p[3]] + c[0][p[0]][p[1]]) % 1000000007L)).sum()).sum()
                + 0 * (c[0] = nx).length).sum()).sum() % 1000000007L)
            : 0;
    }
}
