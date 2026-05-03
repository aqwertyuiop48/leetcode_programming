/*
 * @lc app=leetcode id=3239 lang=java
 *
 * [3239] Minimum Number of Flips to Make Binary Grid Palindromic I
 */

class Solution {
    public int minFlips(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnf", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < grid[0].length / 2) {
                            if (grid[v[0]][v[3]] != grid[v[0]][grid[0].length - 1 - v[3]]) { if (((v[1] += 1) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < grid[0].length) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < grid.length / 2) {
                                if (grid[v[3]][v[0]] != grid[grid.length - 1 - v[3]][v[0]]) { if (((v[2] += 1) | 1) != 0) {} }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mnf", Math.min(v[1], v[2])) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mnf");
    }
}
