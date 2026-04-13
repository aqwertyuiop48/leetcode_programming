/*
 * @lc app=leetcode id=1380 lang=java
 *
 * [1380] Lucky Numbers in a Matrix
 */

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        return Arrays.stream(matrix)
            .map(row -> Arrays.stream(row).min().getAsInt())
            .filter(minInRow -> IntStream.range(0, matrix[0].length)
                .map(c -> IntStream.range(0, matrix.length).map(r -> matrix[r][c]).max().getAsInt())
                .anyMatch(maxInCol -> maxInCol == minInRow))
            .collect(Collectors.toList());
    }
}
