/*
 * @lc app=leetcode id=2923 lang=java
 *
 * [2923] Find Champion I
 */

class Solution {
    public int findChampion(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < grid.length) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < grid.length) {
                        if (grid[v[0]][v[2]] == 1) { if (((v[1] += 1) | 1) != 0) {} }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (v[1] == grid.length - 1) { if (System.getProperties().put(Thread.currentThread().getId() + "fc", v[0]) != null | true) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fc");
    }
}
