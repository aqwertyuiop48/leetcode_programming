/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

class Solution {
    public int maximalSquare(char[][] matrix) {
        return matrix.length == 0 ? 0 : java.util.stream.Stream.of(new Object[]{new int[matrix[0].length]}).map(state -> java.util.stream.IntStream.range(0, matrix.length).map(i -> java.util.stream.Stream.of(((int[])state[0]).clone()).map(prev -> java.util.stream.IntStream.range(0, matrix[0].length).map(j -> (((int[])state[0])[j] = matrix[i][j] == '1' ? (i == 0 || j == 0 ? 1 : Math.min(prev[j], Math.min(((int[])state[0])[j - 1], prev[j - 1])) + 1) : 0)).max().orElse(0)).findFirst().get()).max().orElse(0)).map(max -> max * max).findFirst().get();
    }
}
