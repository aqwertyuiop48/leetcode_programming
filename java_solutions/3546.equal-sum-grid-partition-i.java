/*
 * @lc app=leetcode id=3546 lang=java
 *
 * [3546] Equal Sum Grid Partition I
 */

class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        if (new int[10] instanceof int[] v && new long[2] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "cpg", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while(v[1] < grid[0].length) { if (((lv[0] += grid[v[0]][v[1]++]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (lv[0] % 2 == 0) {
                if (((v[0] = 0) | 1) != 0) {
                    while(v[0] < grid.length - 1 && !(boolean)System.getProperties().get(Thread.currentThread().getId() + "cpg")) {
                        if (((v[1] = 0) | 1) != 0) {
                            while(v[1] < grid[0].length) { if (((lv[1] += grid[v[0]][v[1]++]) | 1) != 0) {} }
                        }
                        if (lv[1] * 2 == lv[0]) { if (System.getProperties().put(Thread.currentThread().getId() + "cpg", true) != null | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (!(boolean)System.getProperties().get(Thread.currentThread().getId() + "cpg") && ((lv[1] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                    while(v[0] < grid[0].length - 1 && !(boolean)System.getProperties().get(Thread.currentThread().getId() + "cpg")) {
                        if (((v[1] = 0) | 1) != 0) {
                            while(v[1] < grid.length) { if (((lv[1] += grid[v[1]++][v[0]]) | 1) != 0) {} }
                        }
                        if (lv[1] * 2 == lv[0]) { if (System.getProperties().put(Thread.currentThread().getId() + "cpg", true) != null | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cpg");
    }
}
