/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        return (mat.length * mat[0].length != r * c) ? mat : Optional.of(Arrays.stream(mat).flatMapToInt(Arrays::stream).toArray()).map(flat -> IntStream.range(0, r).mapToObj(i -> Arrays.copyOfRange(flat, i * c, (i + 1) * c)).toArray(int[][]::new)).get();
    }
}
