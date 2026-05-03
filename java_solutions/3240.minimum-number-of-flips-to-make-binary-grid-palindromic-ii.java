/*
 * @lc app=leetcode id=3240 lang=java
 *
 * [3240] Minimum Number of Flips to Make Binary Grid Palindromic II
 */

class Solution {
    public int minFlips(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnof", 0) != null | true)) {
            if (((v[0] = grid.length) | 1) != 0 && ((v[1] = grid[0].length) | 1) != 0 && ((v[2] = 0) | 1) != 0) { 
                if (((v[3] = 0) | 1) != 0) {
                    while (v[3] < v[0] / 2) {
                        if (((v[4] = 0) | 1) != 0) {
                            while (v[4] < v[1] / 2) {
                                if (((v[5] = grid[v[3]][v[4]] + grid[v[0] - 1 - v[3]][v[4]] + grid[v[3]][v[1] - 1 - v[4]] + grid[v[0] - 1 - v[3]][v[1] - 1 - v[4]]) | 1) != 0) {
                                    if (((v[2] += Math.min(v[5], 4 - v[5])) | 1) != 0) {}
                                }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) { 
                    if (v[0] % 2 != 0) {
                        if (((v[4] = 0) | 1) != 0) {
                            while (v[4] < v[1] / 2) {
                                if (grid[v[0] / 2][v[4]] != grid[v[0] / 2][v[1] - 1 - v[4]]) { if (((v[6] += 1) | 1) != 0) {} }
                                else if (grid[v[0] / 2][v[4]] == 1) { if (((v[7] += 1) | 1) != 0) {} }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (v[1] % 2 != 0) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < v[0] / 2) {
                                if (grid[v[3]][v[1] / 2] != grid[v[0] - 1 - v[3]][v[1] / 2]) { if (((v[6] += 1) | 1) != 0) {} }
                                else if (grid[v[3]][v[1] / 2] == 1) { if (((v[7] += 1) | 1) != 0) {} }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[2] += v[6]) | 1) != 0) {}
                    if (v[6] == 0 && v[7] % 2 != 0) { if (((v[2] += 2) | 1) != 0) {} }
                    if (v[0] % 2 != 0 && v[1] % 2 != 0) { if (((v[2] += grid[v[0] / 2][v[1] / 2]) | 1) != 0) {} }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mnof", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mnof");
    }
}
