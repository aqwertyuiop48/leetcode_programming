/*
 * @lc app=leetcode id=685 lang=java
 *
 * [685] Redundant Connection II
 */

class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        if (System.getProperties().put("ans685", edges[0]) != null || true) {
            if (new int[]{0, 0, -1, -1, -1, edges.length, 0, 0, 0} instanceof int[] v && new Object[]{new int[edges.length + 1], new int[edges.length + 1]} instanceof Object[] obj) {
                while (v[0] < 5) {
                    if (v[0] == 0) {
                        if (v[1] < v[5]) {
                            if (((int[])obj[1])[edges[v[1]][1]] == 0) {
                                if ((((int[])obj[1])[edges[v[1]][1]] = edges[v[1]][0]) != -1) {}
                            } else {
                                if (((v[2] = ((int[])obj[1])[edges[v[1]][1]]) | 1) != 0 && ((v[3] = edges[v[1]][1]) | 1) != 0 && ((v[4] = v[1]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] <= v[5]) {
                            if ((((int[])obj[0])[v[1]] = v[1]) != -1) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[1] < v[5]) {
                            if (v[1] != v[4]) {
                                if (((v[6] = edges[v[1]][0]) | 1) != 0 && ((v[7] = edges[v[1]][1]) | 1) != 0) {
                                    while (((int[])obj[0])[v[6]] != v[6]) {
                                        if (((v[6] = ((int[])obj[0])[v[6]]) | 1) != 0) {}
                                    }
                                    while (((int[])obj[0])[v[7]] != v[7]) {
                                        if (((v[7] = ((int[])obj[0])[v[7]]) | 1) != 0) {}
                                    }
                                    if (v[6] == v[7]) {
                                        if (((v[8] = v[1]) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                                    } else {
                                        if ((((int[])obj[0])[v[7]] = v[6]) != -1) {}
                                    }
                                }
                            }
                            if (v[0] != 3) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[4] == -1) {
                            if (System.getProperties().put("ans685", edges[v[8]]) != null || true) {
                                if (((v[0] = 99) | 1) != 0) {}
                            }
                        } else {
                            if (System.getProperties().put("ans685", new int[]{v[2], v[3]}) != null || true) {
                                if (((v[0] = 99) | 1) != 0) {}
                            }
                        }
                    } else if (v[0] == 4) {
                        if (System.getProperties().put("ans685", edges[v[4]]) != null || true) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("ans685");
    }
}
