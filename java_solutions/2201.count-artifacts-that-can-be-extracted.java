/*
 * @lc app=leetcode id=2201 lang=java
 *
 * [2201] Count Artifacts That Can Be Extracted
 */

class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        if (new int[n][n] instanceof int[][] g && new int[10] instanceof int[] v && (System.getProperties().put("ca", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < dig.length) { if (((g[dig[v[0]][0]][dig[v[0]++][1]] = 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < artifacts.length) {
                        if (((v[2] = artifacts[v[0]][0]) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                            while (v[2] <= artifacts[v[0]][2] && v[5] == 1) {
                                if (((v[3] = artifacts[v[0]][1]) | 1) != 0) {
                                    while (v[3] <= artifacts[v[0]][3] && v[5] == 1) {
                                        if (g[v[2]][v[3]] == 0) { if (((v[5] = 0) | 1) != 0) {} }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (v[5] == 1) { if (((v[1] += 1) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("ca", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("ca");
    }
}
