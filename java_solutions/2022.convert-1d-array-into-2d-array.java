/*
 * @lc app=leetcode id=2022 lang=java
 *
 * [2022] Convert 1D Array Into 2D Array
 */

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        return original.length != m * n ? new int[0][0] : IntStream.range(0, m)
            .mapToObj(i -> Arrays.copyOfRange(original, i * n, i * n + n))
            .toArray(int[][]::new);
    }
}
