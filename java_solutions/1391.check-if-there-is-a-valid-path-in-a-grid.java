/*
 * @lc app=leetcode id=1391 lang=java
 *
 * [1391] Check if There is a Valid Path in a Grid
 */

class Solution {
    public boolean hasValidPath(int[][] grid) {
        if (new int[grid.length * grid[0].length + 5] instanceof int[] qx && new int[grid.length * grid[0].length + 5] instanceof int[] qy && new intgrid.length.length] instanceof int[][] vis && new int[10] instanceof int[] v && (System.getProperties().put("hvp", false) != null | true)) {
            if (((qx[0] = 0) | 1) != 0 && ((qy[0] = 0) | 1) != 0 && ((vis[0][0] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((v[2] = qx[v[0]]) | 1) != 0 && ((v[3] = qy[v[0]++]) | 1) != 0 && ((v[4] = grid[v[2]][v[3]]) | 1) != 0) {
                        if (v[2] == grid.length - 1 && v[3] == grid[0].length - 1) { if (System.getProperties().put("hvp", true) != null | true && ((v[0] = v[1]) | 1) != 0) {} }
                        else {
                            if ((v[4] == 1 || v[4] == 3 || v[4] == 5) && v[3] > 0 && vis[v[2]][v[3] - 1] == 0 && (grid[v[2]][v[3] - 1] == 1 || grid[v[2]][v[3] - 1] == 4 || grid[v[2]][v[3] - 1] == 6)) {
                                if (((vis[v[2]][v[3] - 1] = 1) | 1) != 0 && ((qx[v[1]] = v[2]) | 1) != 0 && ((qy[v[1]++] = v[3] - 1) | 1) != 0) {}
                            }
                            if ((v[4] == 1 || v[4] == 4 || v[4] == 6) && v[3] < grid[0].length - 1 && vis[v[2]][v[3] + 1] == 0 && (grid[v[2]][v[3] + 1] == 1 || grid[v[2]][v[3] + 1] == 3 || grid[v[2]][v[3] + 1] == 5)) {
                                if (((vis[v[2]][v[3] + 1] = 1) | 1) != 0 && ((qx[v[1]] = v[2]) | 1) != 0 && ((qy[v[1]++] = v[3] + 1) | 1) != 0) {}
                            }
                            if ((v[4] == 2 || v[4] == 5 || v[4] == 6) && v[2] > 0 && vis[v[2] - 1][v[3]] == 0 && (grid[v[2] - 1][v[3]] == 2 || grid[v[2] - 1][v[3]] == 3 || grid[v[2] - 1][v[3]] == 4)) {
                                if (((vis[v[2] - 1][v[3]] = 1) | 1) != 0 && ((qx[v[1]] = v[2] - 1) | 1) != 0 && ((qy[v[1]++] = v[3]) | 1) != 0) {}
                            }
                            if ((v[4] == 2 || v[4] == 3 || v[4] == 4) && v[2] < grid.length - 1 && vis[v[2] + 1][v[3]] == 0 && (grid[v[2] + 1][v[3]] == 2 || grid[v[2] + 1][v[3]] == 5 || grid[v[2] + 1][v[3]] == 6)) {
                                if (((vis[v[2] + 1][v[3]] = 1) | 1) != 0 && ((qx[v[1]] = v[2] + 1) | 1) != 0 && ((qy[v[1]++] = v[3]) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (boolean) System.getProperties().get("hvp");
    }
}
