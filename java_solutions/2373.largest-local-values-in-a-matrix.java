/*
 * @lc app=leetcode id=2373 lang=java
 *
 * [2373] Largest Local Values in a Matrix
 */

class Solution {
    public int[][] largestLocal(int[][] grid) {
        if (new int[grid.length - 2][grid.length - 2] instanceof int[][] res && new int[10] instanceof int[] v && (System.getProperties().put("ll", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length - 2) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid.length - 2) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 3) {
                                    if (((v[3] = 0) | 1) != 0) {
                                        while (v[3] < 3) {
                                            if (grid[v[0] + v[2]][v[1] + v[3]] > res[v[0]][v[1]]) {
                                                if (((res[v[0]][v[1]] = grid[v[0] + v[2]][v[1] + v[3]]) | 1) != 0) {}
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[][]) System.getProperties().get("ll");
    }
}
