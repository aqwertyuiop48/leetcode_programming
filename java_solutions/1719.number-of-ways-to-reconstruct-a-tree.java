/*
 * @lc app=leetcode id=1719 lang=java
 *
 * [1719] Number Of Ways To Reconstruct A Tree
 */

class Solution {
    public int checkWays(int[][] pairs) {
        if (new int[]{0, 0, 0, 0, 0, 1, 0, 0} instanceof int[] v && new boolean[505][505] instanceof boolean[][] adj && new int[505] instanceof int[] deg && new boolean[505] instanceof boolean[] nodes) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[1] < pairs.length) {
                        if (((adj[pairs[v[1]][0]][pairs[v[1]][1]] = true) | true) && ((adj[pairs[v[1]][1]][pairs[v[1]][0]] = true) | true) && ((deg[pairs[v[1]][0]] += 1) | 1) != 0 && ((deg[pairs[v[1]][1]] += 1) | 1) != 0 && ((nodes[pairs[v[1]][0]] = true) | true) && ((nodes[pairs[v[1]][1]] = true) | true) && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= 500) {
                        if (nodes[v[1]]) {
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 1) | 1) != 0) {
                            while (v[1] <= 500) {
                                if (nodes[v[1]] && deg[v[1]] == v[3] - 1) {
                                    if (((v[4] = v[1]) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (v[4] == 0) {
                            if (((pairs[0][0] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        } else {
                            if (((v[0] = 2) | 1) != 0 && ((v[1] = 1) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[1] <= 500) {
                        if (nodes[v[1]] && v[1] != v[4]) {
                            if (((v[6] = 0) | 1) != 0 && ((v[7] = 2000000000) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                                while (v[2] <= 500) {
                                    if (adj[v[1]][v[2]]) {
                                        if (deg[v[2]] >= deg[v[1]] && deg[v[2]] < v[7]) {
                                            if (((v[6] = v[2]) | 1) != 0 && ((v[7] = deg[v[2]]) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[6] == 0) {
                                if (((pairs[0][0] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                            } else {
                                if (((v[2] = 1) | 1) != 0) {
                                    while (v[2] <= 500) {
                                        if (adj[v[1]][v[2]] && v[2] != v[6]) {
                                            if (!adj[v[6]][v[2]]) {
                                                if (((pairs[0][0] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[0] = 10) | 1) != 0 && ((v[2] = 1000) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (v[0] != 10 && deg[v[6]] == deg[v[1]]) {
                                    if (((v[5] = 2) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((pairs[0][0] = v[5]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                    }
                }
            }
        }
        return pairs[0][0];
    }
}
