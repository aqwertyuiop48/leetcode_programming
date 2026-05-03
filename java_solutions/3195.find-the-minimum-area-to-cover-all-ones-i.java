/*
 * @lc app=leetcode id=3195 lang=java
 *
 * [3195] Find the Minimum Area to Cover All Ones I
 */

class Solution {
    public int minimumArea(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fma", 0) != null | true)) {
            if (((v[0] = 999999) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = 999999) | 1) != 0 && ((v[3] = -1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[4] < grid.length) {
                    if (((v[5] = 0) | 1) != 0) {
                        while (v[5] < grid[0].length) {
                            if (grid[v[4]][v[5]] == 1) {
                                if (v[4] < v[0]) { if (((v[0] = v[4]) | 1) != 0) {} }
                                if (v[4] > v[1]) { if (((v[1] = v[4]) | 1) != 0) {} }
                                if (v[5] < v[2]) { if (((v[2] = v[5]) | 1) != 0) {} }
                                if (v[5] > v[3]) { if (((v[3] = v[5]) | 1) != 0) {} }
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[4] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fma", (v[1] - v[0] + 1) * (v[3] - v[2] + 1)) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fma");
    }
}
