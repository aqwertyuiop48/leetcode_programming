/*
 * @lc app=leetcode id=3933 lang=java
 *
 * [3933] Largest Local Values in a Matrix II
 */

class Solution {
    public int countLocalMaximums(int[][] matrix) {
        return Optional.of(new int[matrix.length + 1][matrix[0].length + 1]).map(P ->
            (int) Arrays.stream(matrix).flatMapToInt(Arrays::stream).filter(v -> v > 0).distinct()
                .peek(x -> IntStream.range(0, matrix.length).forEach(i -> IntStream.range(0, matrix[0].length)
                    .forEach(j -> P[i + 1][j + 1] = P[i][j + 1] + P[i + 1][j] - P[i][j] + (matrix[i][j] > x ? 1 : 0))))
                .mapToLong(x -> Optional.<IntBinaryOperator>of((r, c) ->
                        r >= 0 && r < matrix.length && c >= 0 && c < matrix[0].length && matrix[r][c] > x ? 1 : 0)
                    .map(g -> IntStream.range(0, matrix.length)
                        .mapToLong(i -> IntStream.range(0, matrix[0].length)
                            .filter(j -> matrix[i][j] == x
                                && P[Math.min(matrix.length, i + x + 1)][Math.min(matrix[0].length, j + x + 1)]
                                 - P[Math.max(0, i - x)][Math.min(matrix[0].length, j + x + 1)]
                                 - P[Math.min(matrix.length, i + x + 1)][Math.max(0, j - x)]
                                 + P[Math.max(0, i - x)][Math.max(0, j - x)]
                                 == g.applyAsInt(i - x, j - x) + g.applyAsInt(i - x, j + x)
                                  + g.applyAsInt(i + x, j - x) + g.applyAsInt(i + x, j + x))
                            .count())
                        .sum())
                    .get())
                .sum()).get();
    }
}
