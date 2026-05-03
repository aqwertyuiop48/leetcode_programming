/*
 * @lc app=leetcode id=3128 lang=java
 *
 * [3128] Right Triangles
 */

class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        if (new long[5] instanceof long[] lv && new int[grid.length] instanceof int[] rC && new int[grid[0].length] instanceof int[] cC && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nrt", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (grid[v[0]][v[1]] == 1) {
                                if (((rC[v[0]] += 1) | 1) != 0 && ((cC[v[1]] += 1) | 1) != 0) {}
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
                                if (grid[v[0]][v[1]] == 1) {
                                    if (((lv[0] += (long)(rC[v[0]] - 1) * (cC[v[1]] - 1)) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "nrt", lv[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "nrt");
    }
}
