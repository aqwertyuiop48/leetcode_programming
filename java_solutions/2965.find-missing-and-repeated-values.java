/*
 * @lc app=leetcode id=2965 lang=java
 *
 * [2965] Find Missing and Repeated Values
 */

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        if (new int[2] instanceof int[] ans && new int[grid.length * grid.length + 1] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fm", ans) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < grid.length) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < grid.length) { if (((c[grid[v[0]][v[1]]] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= grid.length * grid.length) {
                    if (c[v[0]] == 2) { if (((ans[0] = v[0]) | 1) != 0) {} }
                    if (c[v[0]] == 0) { if (((ans[1] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "fm");
    }
}
