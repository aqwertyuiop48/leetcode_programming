/*
 * @lc app=leetcode id=3567 lang=java
 *
 * [3567] Minimum Absolute Difference in Sliding Submatrix
 */

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        if (new int[grid.length - k + 1][grid[0].length - k + 1] instanceof int[][] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mad", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] <= grid.length - k) {
                    if (((v[1] = 0) | 1) != 0) {
                        while(v[1] <= grid[0].length - k) {
                            if (new java.util.TreeSet<Integer>() instanceof java.util.TreeSet set && ((v[2] = 0) | 1) != 0 && ((v[5] = 2000000000) | 1) != 0) {
                                while(v[2] < k) {
                                    if (((v[3] = 0) | 1) != 0) {
                                        while(v[3] < k) {
                                            if (((v[4] = grid[v[0] + v[2]][v[1] + v[3]]) | 1) != 0) {
                                                if (set.ceiling(v[4] + 1) instanceof Integer c && c - v[4] < v[5]) { if (((v[5] = c - v[4]) | 1) != 0) {} }
                                                if (set.floor(v[4] - 1) instanceof Integer f && v[4] - f < v[5]) { if (((v[5] = v[4] - f) | 1) != 0) {} }
                                                if (set.add(v[4]) | true) {}
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (((ans[v[0]][v[1]] = set.size() > 1 ? v[5] : 0) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[][]) System.getProperties().get(Thread.currentThread().getId() + "mad");
    }
}
