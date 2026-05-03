/*
 * @lc app=leetcode id=2316 lang=java
 *
 * [2316] Count Unreachable Pairs of Nodes in an Undirected Graph
 */

class Solution {
    public long countPairs(int n, int[][] edges) {
        if (new int[n] instanceof int[] head && new int[edges.length * 2 + 5] instanceof int[] to && new int[edges.length * 2 + 5] instanceof int[] next && new int[15] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("cup", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) { if (((head[v[0]++] = -1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < edges.length) {
                        if (((to[v[1]] = edges[v[0]][1]) | 1) != 0 && ((next[v[1]] = head[edges[v[0]][0]]) | 1) != 0 && ((head[edges[v[0]][0]] = v[1]++) | 1) != 0) {}
                        if (((to[v[1]] = edges[v[0]][0]) | 1) != 0 && ((next[v[1]] = head[edges[v[0]][1]]) | 1) != 0 && ((head[edges[v[0]][1]] = v[1]++) | 1) != 0) {}
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (new int[n] instanceof int[] vis && new int[n] instanceof int[] q && ((v[0] = 0) | 1) != 0 && ((lv[0] = n) | 1) != 0 && ((lv[1] = lv[0] * (lv[0] - 1) / 2) | 1) != 0) {
                        while (v[0] < n) {
                            if (vis[v[0]] == 0) {
                                if (((vis[v[0]] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((q[v[3]++] = v[0]) | 1) != 0) {
                                    while (v[2] < v[3]) {
                                        if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = head[v[4]]) | 1) != 0) {
                                            while (v[5] != -1) {
                                                if (vis[to[v[5]]] == 0) { if (((vis[to[v[5]]] = 1) | 1) != 0 && ((q[v[3]++] = to[v[5]]) | 1) != 0) {} }
                                                if (((v[5] = next[v[5]]) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (((lv[2] = v[3]) | 1) != 0 && ((lv[1] -= lv[2] * (lv[2] - 1) / 2) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put("cup", lv[1]) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get("cup");
    }
}
