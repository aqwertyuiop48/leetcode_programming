/*
 * @lc app=leetcode id=1617 lang=java
 *
 * [1617] Count Subtrees With Max Distance Between Cities
 */

class Solution {
    public int[] countSubgraphsForEachDiameter(int n, int[][] edges) {
        return Arrays.stream(new int[][]{new int[n - 1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new int[n][n] instanceof int[][] dist) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < n) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < n) {
                                    if (((dist[v[1]][v[2]] = (v[1] == v[2] ? 0 : 1000)) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < edges.length) {
                            if (((dist[edges[v[1]][0] - 1][edges[v[1]][1] - 1] = 1) | 1) != 0 && ((dist[edges[v[1]][1] - 1][edges[v[1]][0] - 1] = 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[1] < n) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < n) {
                                    if (((v[3] = 0) | 1) != 0) {
                                        while (v[3] < n) {
                                            if (((dist[v[2]][v[3]] = Math.min(dist[v[2]][v[3]], dist[v[2]][v[1]] + dist[v[1]][v[3]])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (v[1] < (1 << n)) {
                            if (((v[2] = Integer.bitCount(v[1])) > 1) && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[3] < edges.length) {
                                    if ((v[1] & (1 << (edges[v[3]][0] - 1))) != 0 && (v[1] & (1 << (edges[v[3]][1] - 1))) != 0) {
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                                if (v[4] == v[2] - 1) {
                                    if (((v[5] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                        while (v[3] < n) {
                                            if ((v[1] & (1 << v[3])) != 0) {
                                                if (((v[6] = v[3] + 1) | 1) != 0) {
                                                    while (v[6] < n) {
                                                        if ((v[1] & (1 << v[6])) != 0) {
                                                            if (((v[5] = Math.max(v[5], dist[v[3]][v[6]])) | 1) != 0) {}
                                                        }
                                                        if (((v[6] += 1) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                        if (v[5] > 0) {
                                            if (((res[v[5] - 1] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null);
    }
}
