/*
 * @lc app=leetcode id=2596 lang=java
 *
 * [2596] Check Knight Tour Configuration
 */

class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cvg", true) != null | true) && grid[0][0] == 0 && new int[grid.length * grid.length][2] instanceof int[][] pos && ((v[0] = 0) | 1) != 0) {
            while (v[0] < grid.length) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < grid.length) { if (((pos[grid[v[0]][v[1]]][0] = v[0]) | 1) != 0 && ((pos[grid[v[0]][v[1]]][1] = v[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[0] < grid.length * grid.length && v[2] == 1) {
                    if (((v[3] = Math.abs(pos[v[0]][0] - pos[v[0] - 1][0])) | 1) != 0 && ((v[4] = Math.abs(pos[v[0]][1] - pos[v[0] - 1][1])) | 1) != 0) {
                        if (!((v[3] == 1 && v[4] == 2) || (v[3] == 2 && v[4] == 1))) { if (System.getProperties().put(Thread.currentThread().getId() + "cvg", false) != null | true && ((v[2] = 0) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        } else if (grid[0][0] != 0) { if (System.getProperties().put(Thread.currentThread().getId() + "cvg", false) != null | true) {} }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cvg");
    }
}
