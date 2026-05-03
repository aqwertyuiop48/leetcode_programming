/*
 * @lc app=leetcode id=1605 lang=java
 *
 * [1605] Find Valid Matrix Given Row and Column Sums
 */

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        return new int[rowSum.length][colSum.length] instanceof int[][] m ? java.util.stream.IntStream.range(0, rowSum.length).mapToObj(i -> java.util.stream.IntStream.range(0, colSum.length).filter(j -> (m[i][j] = Math.min(rowSum[i], colSum[j])) >= 0 && (rowSum[i] -= m[i][j]) >= 0 && (colSum[j] -= m[i][j]) >= 0).count() >= 0 ? m[i] : null).toArray(int[][]::new) : null;
    }
}
