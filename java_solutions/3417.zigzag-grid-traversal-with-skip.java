/*
 * @lc app=leetcode id=3417 lang=java
 *
 * [3417] Zigzag Grid Traversal With Skip
 */

class Solution {
    public java.util.List<Integer> zigzagTraversal(int[][] grid) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.List ans && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "zgt", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (v[0] % 2 == 0) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < grid[0].length) {
                                if (v[3] % 2 == 0) { if (ans.add(grid[v[0]][v[1]]) || true) {} }
                                if (((v[1] += 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] = grid[0].length - 1) | 1) != 0) {
                            while (v[1] >= 0) {
                                if (v[3] % 2 == 0) { if (ans.add(grid[v[0]][v[1]]) || true) {} }
                                if (((v[1] -= 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get(Thread.currentThread().getId() + "zgt");
    }
}
