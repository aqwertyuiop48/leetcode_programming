/*
 * @lc app=leetcode id=2132 lang=java
 *
 * [2132] Stamping the Grid
 */

class Solution { public boolean possibleToStamp(int[][] M, int h, int w) { return ((Function<int[][], Function<int[][], Boolean>>) A -> B -> IntStream.range(0, M.length).reduce(0, (acc, i) -> IntStream.range(0, M[0].length).reduce(0, (acc2, j) -> (A[i + 1][j + 1] = A[i + 1][j] + A[i][j + 1] - A[i][j] + M[i][j]) * 0) * 0) * 0 == 0 && IntStream.range(0, M.length).reduce(0, (acc, i) -> IntStream.range(0, M[0].length).reduce(0, (acc2, j) -> (B[i + 1][j + 1] = B[i + 1][j] + B[i][j + 1] - B[i][j] + (i + 1 >= h && j + 1 >= w && A[i + 1][j + 1] - A[i + 1 - h][j + 1] - A[i + 1][j + 1 - w] + A[i + 1 - h][j + 1 - w] == 0 ? 1 : 0)) * 0) * 0) * 0 == 0 ? IntStream.range(0, M.length).allMatch(i -> IntStream.range(0, M[0].length).allMatch(j -> M[i][j] == 1 || B[Math.min(i + h, M.length)][Math.min(j + w, M[0].length)] - B[i][Math.min(j + w, M[0].length)] - B[Math.min(i + h, M.length)][j] + B[i][j] > 0)) : false).apply(new int[M.length + 1][M[0].length + 1]).apply(new int[M.length + 1][M[0].length + 1]); } }
