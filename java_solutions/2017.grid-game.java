/*
 * @lc app=leetcode id=2017 lang=java
 *
 * [2017] Grid Game
 */

class Solution {
    public long gridGame(int[][] grid) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "gg", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < grid[0].length) { if (((v[1] += grid[0][(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[3] = Long.MAX_VALUE) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < grid[0].length) {
                    if (((v[1] -= grid[0][(int)v[0]]) | 1) != 0 && ((v[4] = Math.max(v[1], v[2])) | 1) != 0) {
                        if (v[4] < v[3]) { if (((v[3] = v[4]) | 1) != 0) {} }
                    }
                    if (((v[2] += grid[1][(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "gg", v[3]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "gg");
    }
}
