/*
 * @lc app=leetcode id=2536 lang=java
 *
 * [2536] Increment Submatrices by One
 */

class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        return Stream.<int[][]>of(new int[n + 1][n + 1])
            .peek(d -> Arrays.stream(queries).mapToInt(q -> d[q[0]][q[1]]++ + d[q[0]][q[3] + 1]-- + d[q[2] + 1][q[1]]-- + d[q[2] + 1][q[3] + 1]++).sum())
            .peek(d -> IntStream.range(0, n).forEach(i -> IntStream.range(1, n).forEach(j -> d[i][j] += d[i][j - 1])))
            .peek(d -> IntStream.range(1, n).forEach(i -> IntStream.range(0, n).forEach(j -> d[i][j] += d[i - 1][j])))
            .map(d -> IntStream.range(0, n).mapToObj(i -> Arrays.copyOf(d[i], n)).toArray(int[][]::new))
            .findFirst().get();
    }
}
