/*
 * @lc app=leetcode id=3142 lang=java
 *
 * [3142] Check if Grid Satisfies Conditions
 */

class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "csc", true) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length && (boolean)System.getProperties().get(Thread.currentThread().getId() + "csc")) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length && (boolean)System.getProperties().get(Thread.currentThread().getId() + "csc")) {
                            if (v[0] + 1 < grid.length && grid[v[0]][v[1]] != grid[v[0] + 1][v[1]]) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "csc", false) != null | true) {}
                            }
                            if (v[1] + 1 < grid[0].length && grid[v[0]][v[1]] == grid[v[0]][v[1] + 1]) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "csc", false) != null | true) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "csc");
    }
}
