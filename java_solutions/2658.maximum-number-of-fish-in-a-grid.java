/*
 * @lc app=leetcode id=2658 lang=java
 *
 * [2658] Maximum Number of Fish in a Grid
 */

class Solution {
    public int findMaxFish(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mnf", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (grid[v[0]][v[1]] > 0) {
                                if (new int[grid.length * grid[0].length * 2 + 5] instanceof int[] q && ((q[0] = v[0]) | 1) != 0 && ((q[1] = v[1]) | 1) != 0 && ((v[2] = grid[v[0]][v[1]]) | 1) != 0 && ((grid[v[0]][v[1]] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 2) | 1) != 0) {
                                    while (v[3] < v[4]) {
                                        if (((v[5] = q[v[3]++]) | 1) != 0 && ((v[6] = q[v[3]++]) | 1) != 0) {
                                            if (v[5] > 0 && grid[v[5]-1][v[6]] > 0) { if (((v[2] += grid[v[5]-1][v[6]]) | 1) != 0 && ((grid[v[5]-1][v[6]] = 0) | 1) != 0 && ((q[v[4]++] = v[5]-1) | 1) != 0 && ((q[v[4]++] = v[6]) | 1) != 0) {} }
                                            if (v[5] < grid.length - 1 && grid[v[5]+1][v[6]] > 0) { if (((v[2] += grid[v[5]+1][v[6]]) | 1) != 0 && ((grid[v[5]+1][v[6]] = 0) | 1) != 0 && ((q[v[4]++] = v[5]+1) | 1) != 0 && ((q[v[4]++] = v[6]) | 1) != 0) {} }
                                            if (v[6] > 0 && grid[v[5]][v[6]-1] > 0) { if (((v[2] += grid[v[5]][v[6]-1]) | 1) != 0 && ((grid[v[5]][v[6]-1] = 0) | 1) != 0 && ((q[v[4]++] = v[5]) | 1) != 0 && ((q[v[4]++] = v[6]-1) | 1) != 0) {} }
                                            if (v[6] < grid[0].length - 1 && grid[v[5]][v[6]+1] > 0) { if (((v[2] += grid[v[5]][v[6]+1]) | 1) != 0 && ((grid[v[5]][v[6]+1] = 0) | 1) != 0 && ((q[v[4]++] = v[5]) | 1) != 0 && ((q[v[4]++] = v[6]+1) | 1) != 0) {} }
                                        }
                                    }
                                    if (v[2] > (int)System.getProperties().get("mnf")) { if (System.getProperties().put("mnf", v[2]) != null | true) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("mnf");
    }
}
