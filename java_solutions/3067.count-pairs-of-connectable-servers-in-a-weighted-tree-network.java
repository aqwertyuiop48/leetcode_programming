/*
 * @lc app=leetcode id=3067 lang=java
 *
 * [3067] Count Pairs of Connectable Servers in a Weighted Tree Network
 */

class Solution {
    public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
        if (new int[edges.length + 1] instanceof int[] ans && new int[edges.length + 2] instanceof int[] head && new int[edges.length * 2 + 5] instanceof int[] next && new int[edges.length * 2 + 5] instanceof int[] to && new int[edges.length * 2 + 5] instanceof int[] wt && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cpc", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[0] < edges.length) {
                    if (((to[v[1]] = edges[v[0]][1]) | 1) != 0 && ((wt[v[1]] = edges[v[0]][2]) | 1) != 0 && ((next[v[1]] = head[edges[v[0]][0]]) | 1) != 0 && ((head[edges[v[0]][0]] = v[1]++) | 1) != 0 && ((to[v[1]] = edges[v[0]][0]) | 1) != 0 && ((wt[v[1]] = edges[v[0]][2]) | 1) != 0 && ((next[v[1]] = head[edges[v[0]][1]]) | 1) != 0 && ((head[edges[v[0]][1]] = v[1]++) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] <= edges.length) {
                        if (((v[2] = 0) | 1) != 0 && ((v[3] = head[v[0]]) | 1) != 0) {
                            while (v[3] != 0) {
                                if (new int[edges.length + 5] instanceof int[] qNode && new int[edges.length + 5] instanceof int[] qDist && new int[edges.length + 5] instanceof int[] qParent && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((qNode[v[5]] = to[v[3]]) | 1) != 0 && ((qDist[v[5]] = wt[v[3]]) | 1) != 0 && ((qParent[v[5]++] = v[0]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                    while (v[4] < v[5]) {
                                        if (((v[7] = qNode[v[4]]) | 1) != 0 && ((v[8] = qDist[v[4]]) | 1) != 0 && ((v[9] = qParent[v[4]++]) | 1) != 0) {
                                            if (v[8] % signalSpeed == 0) { if (((v[6] += 1) | 1) != 0) {} }
                                            if (((v[10] = head[v[7]]) | 1) != 0) {
                                                while (v[10] != 0) {
                                                    if (to[v[10]] != v[9]) { if (((qNode[v[5]] = to[v[10]]) | 1) != 0 && ((qDist[v[5]] = v[8] + wt[v[10]]) | 1) != 0 && ((qParent[v[5]++] = v[7]) | 1) != 0) {} }
                                                    if (((v[10] = next[v[10]]) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                    if (((ans[v[0]] += v[2] * v[6]) | 1) != 0 && ((v[2] += v[6]) | 1) != 0) {}
                                }
                                if (((v[3] = next[v[3]]) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cpc");
    }
}
