/*
 * @lc app=leetcode id=1727 lang=java
 *
 * [1727] Largest Submatrix With Rearrangements
 */

class Solution {
    public int largestSubmatrix(int[][] matrix) {
        return java.util.stream.IntStream.range(0, matrix.length).map(i -> java.util.stream.IntStream.range(0, matrix[0].length).map(j -> (matrix[i][j] = matrix[i][j] == 1 ? (i > 0 ? matrix[i - 1][j] + 1 : 1) : 0)).sum() * 0 + java.util.Optional.of(java.util.Arrays.stream(matrix[i]).sorted().toArray()).map(r -> java.util.stream.IntStream.range(0, r.length).map(j -> r[j] * (r.length - j)).max().getAsInt()).get()).max().getAsInt();
    }
}
