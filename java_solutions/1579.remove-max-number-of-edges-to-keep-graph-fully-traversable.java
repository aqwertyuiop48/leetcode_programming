/*
 * @lc app=leetcode id=1579 lang=java
 *
 * [1579] Remove Max Number of Edges to Keep Graph Fully Traversable
 */

class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        return java.util.Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new int[]{0, 0, 0, n, n, 0, 0, 0, 0, 0, 0} instanceof int[] v && new int[n + 1] instanceof int[] pa && new int[n + 1] instanceof int[] pb) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] <= n) {
                            if (((pa[v[1]] = v[1]) | 1) != 0 && ((pb[v[1]] = v[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) { 
                        if (v[1] < edges.length) {
                            if (edges[v[1]][0] == 3) {
                                if (((v[6] = edges[v[1]][1]) | 1) != 0 && ((v[7] = edges[v[1]][2]) | 1) != 0 && ((v[8] = edges[v[1]][1]) | 1) != 0 && ((v[9] = edges[v[1]][2]) | 1) != 0) {
                                    while (pa[v[6]] != v[6]) { if (((pa[v[6]] = pa[pa[v[6]]]) | 1) != 0 && ((v[6] = pa[v[6]]) | 1) != 0) {} }
                                    while (pa[v[7]] != v[7]) { if (((pa[v[7]] = pa[pa[v[7]]]) | 1) != 0 && ((v[7] = pa[v[7]]) | 1) != 0) {} }
                                    while (pb[v[8]] != v[8]) { if (((pb[v[8]] = pb[pb[v[8]]]) | 1) != 0 && ((v[8] = pb[v[8]]) | 1) != 0) {} }
                                    while (pb[v[9]] != v[9]) { if (((pb[v[9]] = pb[pb[v[9]]]) | 1) != 0 && ((v[9] = pb[v[9]]) | 1) != 0) {} }
                                    if (((v[10] = 0) | 1) != 0) {
                                        if (v[6] != v[7]) { if (((pa[v[7]] = v[6]) | 1) != 0 && ((v[3] -= 1) | 1) != 0 && ((v[10] = 1) | 1) != 0) {} }
                                        if (v[8] != v[9]) { if (((pb[v[9]] = v[8]) | 1) != 0 && ((v[4] -= 1) | 1) != 0 && ((v[10] = 1) | 1) != 0) {} }
                                        if (v[10] == 1) { if (((v[5] += 1) | 1) != 0) {} }
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) { 
                        if (v[1] < edges.length) {
                            if (edges[v[1]][0] == 1) {
                                if (((v[6] = edges[v[1]][1]) | 1) != 0 && ((v[7] = edges[v[1]][2]) | 1) != 0) {
                                    while (pa[v[6]] != v[6]) { if (((pa[v[6]] = pa[pa[v[6]]]) | 1) != 0 && ((v[6] = pa[v[6]]) | 1) != 0) {} }
                                    while (pa[v[7]] != v[7]) { if (((pa[v[7]] = pa[pa[v[7]]]) | 1) != 0 && ((v[7] = pa[v[7]]) | 1) != 0) {} }
                                    if (v[6] != v[7]) { if (((pa[v[7]] = v[6]) | 1) != 0 && ((v[3] -= 1) | 1) != 0 && ((v[5] += 1) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) { 
                        if (v[1] < edges.length) {
                            if (edges[v[1]][0] == 2) {
                                if (((v[8] = edges[v[1]][1]) | 1) != 0 && ((v[9] = edges[v[1]][2]) | 1) != 0) {
                                    while (pb[v[8]] != v[8]) { if (((pb[v[8]] = pb[pb[v[8]]]) | 1) != 0 && ((v[8] = pb[v[8]]) | 1) != 0) {} }
                                    while (pb[v[9]] != v[9]) { if (((pb[v[9]] = pb[pb[v[9]]]) | 1) != 0 && ((v[9] = pb[v[9]]) | 1) != 0) {} }
                                    if (v[8] != v[9]) { if (((pb[v[9]] = v[8]) | 1) != 0 && ((v[4] -= 1) | 1) != 0 && ((v[5] += 1) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (v[3] > 1 || v[4] > 1) {
                                if (((res[0] = -1) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                            } else {
                                if (((res[0] = edges.length - v[5]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }).findFirst().orElse(new int[]{-1})[0];
    }
}
