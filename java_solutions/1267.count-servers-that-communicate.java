/*
 * @lc app=leetcode id=1267 lang=java
 *
 * [1267] Count Servers that Communicate
 */

class Solution {
    public int countServers(int[][] grid) {
        if (new int[grid.length] instanceof int[] r && new int[grid[0].length] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put("csc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (grid[v[0]][v[1]] == 1) { if (((r[v[0]] += 1) | 1) != 0 && ((c[v[1]] += 1) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < grid.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < grid[0].length) {
                                if (grid[v[0]][v[1]] == 1 && (r[v[0]] > 1 || c[v[1]] > 1)) { if (System.getProperties().put("csc", (int)System.getProperties().get("csc") + 1) != null | true) {} }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("csc");
    }
}
