/*
 * @lc app=leetcode id=931 lang=java
 *
 * [931] Minimum Falling Path Sum
 */

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        return java.util.Arrays.stream(matrix).reduce(new int[matrix[0].length], (dp, row) -> java.util.stream.IntStream.range(0, row.length)
            .map(j -> row[j] + java.util.stream.IntStream.rangeClosed(Math.max(0, j - 1), Math.min(row.length - 1, j + 1)).map(k -> dp[k]).min().getAsInt()).toArray()) instanceof int[] r
            ? java.util.Arrays.stream(r).min().getAsInt() : 0;
    }
}
