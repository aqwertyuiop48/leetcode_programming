/*
 * @lc app=leetcode id=4052 lang=java
 *
 * [4052] Cyclically Shift Rows and Columns
 */

class Solution {
public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
    return IntStream.range(0, n).mapToObj(r -> IntStream.range(0, n).map(c -> grid[(r + colShift[c]) % n][(c + rowShift[(r + colShift[c]) % n]) % n]).toArray()).toArray(int[][]::new);
}
}
