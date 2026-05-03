/*
 * @lc app=leetcode id=3462 lang=java
 *
 * [3462] Maximum Sum With at Most K Elements
 */

class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        if (new long[2] instanceof long[] lv && new int[10] instanceof int[] v && new java.util.PriorityQueue<Integer>(java.util.Collections.reverseOrder()) instanceof java.util.PriorityQueue pq && (System.getProperties().put(Thread.currentThread().getId() + "msw", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if ((grid[v[0]] = java.util.Arrays.stream(grid[v[0]]).sorted().toArray()) != null && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < limits[v[0]]) {
                            if (pq.offer(grid[v[0]][grid[v[0]].length - 1 - v[1]]) | true && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                    while (v[0] < k && !pq.isEmpty()) {
                        if (((lv[0] += (int)pq.poll()) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "msw", lv[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "msw");
    }
}
