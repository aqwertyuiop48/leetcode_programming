/*
 * @lc app=leetcode id=1034 lang=java
 *
 * [1034] Coloring A Border
 */

class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        if (new intgrid.length.length] instanceof int[][] vis && new int[grid.length * grid[0].length] instanceof int[] qx && new int[grid.length * grid[0].length] instanceof int[] qy && new int[10] instanceof int[] v) {
            if (((v[0] = grid[row][col]) | 1) != 0 && ((qx[0] = row) | 1) != 0 && ((qy[0] = col) | 1) != 0 && ((vis[row][col] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0 && new int[]{-1, 1, 0, 0} instanceof int[] dx && new int[]{0, 0, -1, 1} instanceof int[] dy) {
                while (v[1] < v[2]) {
                    if (((v[3] = qx[v[1]]) | 1) != 0 && ((v[4] = qy[v[1]++]) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                        while (v[5] < 4) {
                            if (((v[7] = v[3] + dx[v[5]]) | 1) != 0 && ((v[8] = v[4] + dy[v[5]]) | 1) != 0) {
                                if (v[7] < 0 || v[7] >= grid.length || v[8] < 0 || v[8] >= grid[0].length || grid[v[7]][v[8]] != v[0]) {
                                    if (((v[6] = 1) | 1) != 0) {}
                                } else if (vis[v[7]][v[8]] == 0) {
                                    if (((vis[v[7]][v[8]] = 1) | 1) != 0 && ((qx[v[2]] = v[7]) | 1) != 0 && ((qy[v[2]++] = v[8]) | 1) != 0) {}
                                }
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                        if (v[6] == 1) { if (((vis[v[3]][v[4]] = 2) | 1) != 0) {} }
                    }
                }
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < grid.length) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < grid[0].length) {
                                if (vis[v[1]][v[2]] == 2) { if (((grid[v[1]][v[2]] = color) | 1) != 0) {} }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return grid;
    }
}
