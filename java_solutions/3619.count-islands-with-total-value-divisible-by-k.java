/*
 * @lc app=leetcode id=3619 lang=java
 *
 * [3619] Count Islands With Total Value Divisible by K
 */

class Solution {
    public int countIslands(int[][] grid, int k) {
        if (new int[10] instanceof int[] v && new int[]{0, 1, 0, -1, 0} instanceof int[] dirs && new long[1] instanceof long[] sum && (System.getProperties().put(Thread.currentThread().getId() + "ci", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (grid[v[0]][v[1]] > 0) {
                                if (new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && q.offer(new int[]{v[0], v[1]}) | true && ((sum[0] = grid[v[0]][v[1]]) | 1) != 0 && ((grid[v[0]][v[1]] = 0) | 1) != 0) {
                                    while (!q.isEmpty()) {
                                        if (q.poll() instanceof int[] curr && ((v[3] = 0) | 1) != 0) {
                                            while (v[3] < 4) {
                                                if (((v[4] = curr[0] + dirs[v[3]]) | 1) != 0 && ((v[6] = curr[1] + dirs[v[3] + 1]) | 1) != 0) {
                                                    if (v[4] >= 0 && v[4] < grid.length && v[6] >= 0 && v[6] < grid[0].length && grid[v[4]][v[6]] > 0) {
                                                        if (((sum[0] += grid[v[4]][v[6]]) | 1) != 0 && ((grid[v[4]][v[6]] = 0) | 1) != 0 && q.offer(new int[]{v[4], v[6]}) | true) {}
                                                    }
                                                }
                                                if (((v[3] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (sum[0] % k == 0) { if (((v[5] += 1) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ci", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ci");
    }
}
