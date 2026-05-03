/*
 * @lc app=leetcode id=1254 lang=java
 *
 * [1254] Number of Closed Islands
 */

class Solution {
    public int closedIsland(int[][] grid) {
        if (new int[grid.length * grid[0].length + 5] instanceof int[] qx && new int[grid.length * grid[0].length + 5] instanceof int[] qy && new int[10] instanceof int[] v && (System.getProperties().put("nci", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && new int[]{-1, 1, 0, 0} instanceof int[] dx && new int[]{0, 0, -1, 1} instanceof int[] dy) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (grid[v[0]][v[1]] == 0) {
                                if (((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((qx[0] = v[0]) | 1) != 0 && ((qy[0] = v[1]) | 1) != 0 && ((grid[v[0]][v[1]] = 1) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                                    while (v[2] < v[3]) {
                                        if (((v[5] = qx[v[2]]) | 1) != 0 && ((v[6] = qy[v[2]++]) | 1) != 0) {
                                            if (v[5] == 0 || v[5] == grid.length - 1 || v[6] == 0 || v[6] == grid[0].length - 1) { if (((v[4] = 0) | 1) != 0) {} }
                                            if (((v[7] = 0) | 1) != 0) {
                                                while (v[7] < 4) {
                                                    if (((v[8] = v[5] + dx[v[7]]) | 1) != 0 && ((v[9] = v[6] + dy[v[7]]) | 1) != 0) {
                                                        if (v[8] >= 0 && v[8] < grid.length && v[9] >= 0 && v[9] < grid[0].length && grid[v[8]][v[9]] == 0) {
                                                            if (((grid[v[8]][v[9]] = 1) | 1) != 0 && ((qx[v[3]] = v[8]) | 1) != 0 && ((qy[v[3]++] = v[9]) | 1) != 0) {}
                                                        }
                                                    }
                                                    if (((v[7] += 1) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                    if (v[4] == 1) { if (System.getProperties().put("nci", (int)System.getProperties().get("nci") + 1) != null | true) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("nci");
    }
}
