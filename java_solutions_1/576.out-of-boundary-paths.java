/*
 * @lc app=leetcode id=576 lang=java
 *
 * [576] Out of Boundary Paths
 */

class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new int[m][n], new int[]{0}}).peek(a -> ((int[][])a[0])[startRow][startColumn] = 1).peek(a -> java.util.stream.IntStream.range(0, maxMove).forEach(step -> java.util.stream.Stream.of(new int[m][n]).peek(temp -> java.util.stream.IntStream.range(0, m).forEach(i -> java.util.stream.IntStream.range(0, n).forEach(j -> java.util.stream.Stream.of(0).filter(_x -> ((int[][])a[0])[i][j] > 0).forEach(_x -> java.util.Arrays.stream(new int[][]{{i-1, j}, {i+1, j}, {i, j-1}, {i, j+1}}).forEach(d -> java.util.stream.Stream.of(0).filter(_y -> d[0] < 0 || d[0] >= m || d[1] < 0 || d[1] >= n).peek(_y -> ((int[])a[1])[0] = (((int[])a[1])[0] + ((int[][])a[0])[i][j]) % 1000000007).forEach(_y -> {}))).forEach(_x -> java.util.Arrays.stream(new int[][]{{i-1, j}, {i+1, j}, {i, j-1}, {i, j+1}}).filter(d -> d[0] >= 0 && d[0] < m && d[1] >= 0 && d[1] < n).forEach(d -> temp[d[0]][d[1]] = (temp[d[0]][d[1]] + ((int[][])a[0])[i][j]) % 1000000007)))))).forEach(temp -> a[0] = temp))).map(a -> ((int[])a[1])[0]).findFirst().get();
    }
}
