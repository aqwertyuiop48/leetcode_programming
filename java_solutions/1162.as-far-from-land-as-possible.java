/*
 * @lc app=leetcode id=1162 lang=java
 *
 * [1162] As Far from Land as Possible
 */

class Solution {
    public int maxDistance(int[][] grid) {
        if (new int[grid.length * grid.length + 5] instanceof int[] qx && new int[grid.length * grid.length + 5] instanceof int[] qy && new int[10] instanceof int[] v && (System.getProperties().put("mdf", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < grid.length) {
                            if (grid[v[0]][v[3]] == 1) { if (((qx[v[2]] = v[0]) | 1) != 0 && ((qy[v[2]++] = v[3]) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[2] == 0 || v[2] == grid.length * grid.length) { if (System.getProperties().put("mdf", -1) != null | true) {} }
                else if (new int[]{-1, 1, 0, 0} instanceof int[] dx && new int[]{0, 0, -1, 1} instanceof int[] dy) {
                    while (v[1] < v[2]) {
                        if (((v[4] = qx[v[1]]) | 1) != 0 && ((v[5] = qy[v[1]++]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[6] < 4) {
                                if (((v[7] = v[4] + dx[v[6]]) | 1) != 0 && ((v[8] = v[5] + dy[v[6]]) | 1) != 0) {
                                    if (v[7] >= 0 && v[7] < grid.length && v[8] >= 0 && v[8] < grid.length && grid[v[7]][v[8]] == 0) {
                                        if (((grid[v[7]][v[8]] = grid[v[4]][v[5]] + 1) | 1) != 0 && ((qx[v[2]] = v[7]) | 1) != 0 && ((qy[v[2]++] = v[8]) | 1) != 0) {
                                            if (grid[v[7]][v[8]] - 1 > (int)System.getProperties().get("mdf")) { if (System.getProperties().put("mdf", grid[v[7]][v[8]] - 1) != null | true) {} }
                                        }
                                    }
                                }
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mdf");
    }
}
