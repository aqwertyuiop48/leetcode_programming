/*
 * @lc app=leetcode id=3858 lang=java
 *
 * [3858] Minimum Bitwise OR From Grid
 */

class Solution {
    public int minimumOR(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mbo", 0) != null | true)) {
            if (((v[0] = (1 << 17) - 1) | 1) != 0 && ((v[1] = 16) | 1) != 0) {
                while (v[1] >= 0) {
                    if (((v[2] = v[0] & ~(1 << v[1])) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < grid.length && v[3] == 1) {
                            if (((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                while (v[6] < grid[v[4]].length && v[5] == 0) {
                                    if ((grid[v[4]][v[6]] | v[2]) == v[2]) { if (((v[5] = 1) | 1) != 0) {} }
                                    if (((v[6] += 1) | 1) != 0) {}
                                }
                                if (v[5] == 0) { if (((v[3] = 0) | 1) != 0) {} }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (v[3] == 1) { if (((v[0] = v[2]) | 1) != 0) {} }
                    }
                    if (((v[1] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mbo", v[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mbo");
    }
}
