/*
 * @lc app=leetcode id=2245 lang=java
 *
 * [2245] Maximum Trailing Zeros in a Cornered Path
 */

class Solution {
    public int maxTrailingZeros(int[][] grid) {
        if (new int[grid.length][grid[0].length][2] instanceof int[][][] r && new int[grid.length][grid[0].length][2] instanceof int[][][] c && new int[10] instanceof int[] v && (System.getProperties().put("mtz", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (((v[2] = grid[v[0]][v[1]]) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[2] % 2 == 0) { if (((v[3] += 1) | 1) != 0 && ((v[2] /= 2) | 1) != 0) {} }
                                while (v[2] % 5 == 0) { if (((v[4] += 1) | 1) != 0 && ((v[2] /= 5) | 1) != 0) {} }
                                if (((r[v[0]][v[1]][0] = v[3] + (v[1] > 0 ? r[v[0]][v[1] - 1][0] : 0)) | 1) != 0 && ((r[v[0]][v[1]][1] = v[4] + (v[1] > 0 ? r[v[0]][v[1] - 1][1] : 0)) | 1) != 0) {}
                                if (((c[v[0]][v[1]][0] = v[3] + (v[0] > 0 ? c[v[0] - 1][v[1]][0] : 0)) | 1) != 0 && ((c[v[0]][v[1]][1] = v[4] + (v[0] > 0 ? c[v[0] - 1][v[1]][1] : 0)) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < grid.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < grid[0].length) {
                                if (((v[2] = grid[v[0]][v[1]]) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                    while (v[2] % 2 == 0) { if (((v[3] += 1) | 1) != 0 && ((v[2] /= 2) | 1) != 0) {} }
                                    while (v[2] % 5 == 0) { if (((v[4] += 1) | 1) != 0 && ((v[2] /= 5) | 1) != 0) {} }
                                    if (((v[5] = Math.max(v[5], Math.max(Math.min(r[v[0]][v[1]][0] + c[v[0]][v[1]][0] - v[3], r[v[0]][v[1]][1] + c[v[0]][v[1]][1] - v[4]), Math.min(r[v[0]][v[1]][0] + c[grid.length - 1][v[1]][0] - c[v[0]][v[1]][0], r[v[0]][v[1]][1] + c[grid.length - 1][v[1]][1] - c[v[0]][v[1]][1])))) | 1) != 0) {}
                                    if (((v[5] = Math.max(v[5], Math.max(Math.min(r[v[0]][grid[0].length - 1][0] - r[v[0]][v[1]][0] + c[v[0]][v[1]][0], r[v[0]][grid[0].length - 1][1] - r[v[0]][v[1]][1] + c[v[0]][v[1]][1]), Math.min(r[v[0]][grid[0].length - 1][0] - r[v[0]][v[1]][0] + c[grid.length - 1][v[1]][0] - c[v[0]][v[1]][0] + v[3], r[v[0]][grid[0].length - 1][1] - r[v[0]][v[1]][1] + c[grid.length - 1][v[1]][1] - c[v[0]][v[1]][1] + v[4])))) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mtz", v[5]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mtz");
    }
}
