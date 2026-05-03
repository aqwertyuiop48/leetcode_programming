/*
 * @lc app=leetcode id=1706 lang=java
 *
 * [1706] Where Will the Ball Fall
 */

class Solution {
    public int[] findBall(int[][] grid) {
        if (new int[grid[0].length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("wwb", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid[0].length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {
                        while (v[1] < grid.length) {
                            if (grid[v[1]][v[2]] == 1 && v[2] + 1 < grid[0].length && grid[v[1]][v[2] + 1] == 1) { if (((v[2] += 1) | 1) != 0) {} }
                            else if (grid[v[1]][v[2]] == -1 && v[2] - 1 >= 0 && grid[v[1]][v[2] - 1] == -1) { if (((v[2] -= 1) | 1) != 0) {} }
                            else { if (((v[2] = -1) | 1) != 0 && ((v[1] = grid.length) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (((ans[v[0]] = v[2]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("wwb");
    }
}
