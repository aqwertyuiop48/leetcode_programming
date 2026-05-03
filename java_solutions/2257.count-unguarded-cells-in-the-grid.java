/*
 * @lc app=leetcode id=2257 lang=java
 *
 * [2257] Count Unguarded Cells in the Grid
 */

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        if (new int[m][n] instanceof int[][] g && new int[10] instanceof int[] v && (System.getProperties().put("cuc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < walls.length) { if (((g[walls[v[0]][0]][walls[v[0]++][1]] = 2) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < guards.length) { if (((g[guards[v[0]][0]][guards[v[0]++][1]] = 1) | 1) != 0) {} }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < guards.length) {
                            if (((v[1] = guards[v[0]][0] - 1) | 1) != 0) { while (v[1] >= 0 && g[v[1]][guards[v[0]][1]] != 1 && g[v[1]][guards[v[0]][1]] != 2) { if (((g[v[1]--][guards[v[0]][1]] = 3) | 1) != 0) {} } }
                            if (((v[1] = guards[v[0]][0] + 1) | 1) != 0) { while (v[1] < m && g[v[1]][guards[v[0]][1]] != 1 && g[v[1]][guards[v[0]][1]] != 2) { if (((g[v[1]++][guards[v[0]][1]] = 3) | 1) != 0) {} } }
                            if (((v[1] = guards[v[0]][1] - 1) | 1) != 0) { while (v[1] >= 0 && g[guards[v[0]][0]][v[1]] != 1 && g[guards[v[0]][0]][v[1]] != 2) { if (((g[guards[v[0]][0]][v[1]--] = 3) | 1) != 0) {} } }
                            if (((v[1] = guards[v[0]][1] + 1) | 1) != 0) { while (v[1] < n && g[guards[v[0]][0]][v[1]] != 1 && g[guards[v[0]][0]][v[1]] != 2) { if (((g[guards[v[0]][0]][v[1]++] = 3) | 1) != 0) {} } }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[0] < m) {
                                if (((v[1] = 0) | 1) != 0) {
                                    while (v[1] < n) {
                                        if (g[v[0]][v[1]] == 0) { if (((v[2] += 1) | 1) != 0) {} }
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[0] += 1) | 1) != 0) {}
                            }
                            if (System.getProperties().put("cuc", v[2]) != null | true) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("cuc");
    }
}
