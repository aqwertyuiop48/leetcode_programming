/*
 * @lc app=leetcode id=3643 lang=java
 *
 * [3643] Flip Square Submatrix Vertically
 */

class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fs", grid) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < k / 2) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < k) {
                        if (((v[2] = grid[x + v[0]][y + v[1]]) | 1) != 0 && ((grid[x + v[0]][y + v[1]] = grid[x + k - 1 - v[0]][y + v[1]]) | 1) != 0 && ((grid[x + k - 1 - v[0]][y + v[1]] = v[2]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int[][]) System.getProperties().get(Thread.currentThread().getId() + "fs");
    }
}
