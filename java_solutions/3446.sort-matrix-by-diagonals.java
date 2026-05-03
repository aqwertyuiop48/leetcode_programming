/*
 * @lc app=leetcode id=3446 lang=java
 *
 * [3446] Sort Matrix by Diagonals
 */

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sm", grid) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = grid.length) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < v[1]) {
                            if (((v[3] = 0) | 1) != 0) {
                                while (v[3] < v[1] - 1) {
                                    if (((v[4] = 0) | 1) != 0) {
                                        while (v[4] < v[1] - 1) {
                                            if (v[3] >= v[4]) {
                                                if (grid[v[3]][v[4]] < grid[v[3]+1][v[4]+1]) {
                                                    if (((v[5] = grid[v[3]][v[4]]) | 1) != 0 && ((grid[v[3]][v[4]] = grid[v[3]+1][v[4]+1]) | 1) != 0 && ((grid[v[3]+1][v[4]+1] = v[5]) | 1) != 0) {}
                                                }
                                            } else {
                                                if (grid[v[3]][v[4]] > grid[v[3]+1][v[4]+1]) {
                                                    if (((v[5] = grid[v[3]][v[4]]) | 1) != 0 && ((grid[v[3]][v[4]] = grid[v[3]+1][v[4]+1]) | 1) != 0 && ((grid[v[3]+1][v[4]+1] = v[5]) | 1) != 0) {}
                                                }
                                            }
                                            if (((v[4] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[][]) System.getProperties().get(Thread.currentThread().getId() + "sm");
    }
}
