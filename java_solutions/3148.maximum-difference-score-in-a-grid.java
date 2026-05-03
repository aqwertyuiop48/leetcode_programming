/*
 * @lc app=leetcode id=3148 lang=java
 *
 * [3148] Maximum Difference Score in a Grid
 */

class Solution {
    public int maxScore(java.util.List<java.util.List<Integer>> grid) {
        if (new int[grid.size()][grid.get(0).size()] instanceof int[][] minG && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mds", -9999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -9999999) | 1) != 0) {
                while (v[0] < grid.size()) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < grid.get(0).size()) {
                            if (((v[3] = 9999999) | 1) != 0) {
                                if (v[0] > 0) { if (minG[v[0]-1][v[2]] < v[3]) { if (((v[3] = minG[v[0]-1][v[2]]) | 1) != 0) {} } }
                                if (v[2] > 0) { if (minG[v[0]][v[2]-1] < v[3]) { if (((v[3] = minG[v[0]][v[2]-1]) | 1) != 0) {} } }
                                if (v[0] > 0 || v[2] > 0) {
                                    if (grid.get(v[0]).get(v[2]) - v[3] > v[1]) { if (((v[1] = grid.get(v[0]).get(v[2]) - v[3]) | 1) != 0) {} }
                                }
                                if (((minG[v[0]][v[2]] = Math.min(grid.get(v[0]).get(v[2]), v[3])) | 1) != 0) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mds", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mds");
    }
}
