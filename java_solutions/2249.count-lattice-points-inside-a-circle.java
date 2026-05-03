/*
 * @lc app=leetcode id=2249 lang=java
 *
 * [2249] Count Lattice Points Inside a Circle
 */

class Solution {
    public int countLatticePoints(int[][] circles) {
        if (new int[205][205] instanceof int[][] g && new int[10] instanceof int[] v && (System.getProperties().put("clp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < circles.length) {
                    if (((v[1] = circles[v[0]][0] - circles[v[0]][2]) | 1) != 0) {
                        while (v[1] <= circles[v[0]][0] + circles[v[0]][2]) {
                            if (((v[2] = circles[v[0]][1] - circles[v[0]][2]) | 1) != 0) {
                                while (v[2] <= circles[v[0]][1] + circles[v[0]][2]) {
                                    if ((v[1] - circles[v[0]][0]) * (v[1] - circles[v[0]][0]) + (v[2] - circles[v[0]][1]) * (v[2] - circles[v[0]][1]) <= circles[v[0]][2] * circles[v[0]][2]) {
                                        if (g[v[1]][v[2]] == 0) { if (((g[v[1]][v[2]] = 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("clp", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("clp");
    }
}
