/*
 * @lc app=leetcode id=3820 lang=java
 *
 * [3820] Pythagorean Distance Nodes in a Tree
 */

class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        if (new int[n] instanceof int[] h && new int[2 * n] instanceof int[] to && new int[2 * n] instanceof int[] ne && new int[n] instanceof int[] q && new int[n] instanceof int[] dx && new int[n] instanceof int[] dy && new int[n] instanceof int[] dz && new int[20] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("pdn", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) { if (((h[v[0]] = -1) | 1) != 0 && ((dx[v[0]] = -1) | 1) != 0 && ((dy[v[0]] = -1) | 1) != 0 && ((dz[v[0]] = -1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < edges.length) {
                        if (((to[v[1]] = edges[v[0]][1]) | 1) != 0 && ((ne[v[1]] = h[edges[v[0]][0]]) | 1) != 0 && ((h[edges[v[0]][0]] = v[1]++) | 1) != 0 && ((to[v[1]] = edges[v[0]][0]) | 1) != 0 && ((ne[v[1]] = h[edges[v[0]][1]]) | 1) != 0 && ((h[edges[v[0]][1]] = v[1]++) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((q[v[3]++] = x) | 1) != 0 && ((dx[x] = 0) | 1) != 0) {
                        while (v[2] < v[3]) {
                            if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = h[v[4]]) | 1) != 0) {
                                while (v[5] != -1) {
                                    if (dx[to[v[5]]] == -1) { if (((dx[to[v[5]]] = dx[v[4]] + 1) | 1) != 0 && ((q[v[3]++] = to[v[5]]) | 1) != 0) {} }
                                    if (((v[5] = ne[v[5]]) | 1) != 0) {}
                                }
                            }
                        }
                    }
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((q[v[3]++] = y) | 1) != 0 && ((dy[y] = 0) | 1) != 0) {
                        while (v[2] < v[3]) {
                            if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = h[v[4]]) | 1) != 0) {
                                while (v[5] != -1) {
                                    if (dy[to[v[5]]] == -1) { if (((dy[to[v[5]]] = dy[v[4]] + 1) | 1) != 0 && ((q[v[3]++] = to[v[5]]) | 1) != 0) {} }
                                    if (((v[5] = ne[v[5]]) | 1) != 0) {}
                                }
                            }
                        }
                    }
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((q[v[3]++] = z) | 1) != 0 && ((dz[z] = 0) | 1) != 0) {
                        while (v[2] < v[3]) {
                            if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = h[v[4]]) | 1) != 0) {
                                while (v[5] != -1) {
                                    if (dz[to[v[5]]] == -1) { if (((dz[to[v[5]]] = dz[v[4]] + 1) | 1) != 0 && ((q[v[3]++] = to[v[5]]) | 1) != 0) {} }
                                    if (((v[5] = ne[v[5]]) | 1) != 0) {}
                                }
                            }
                        }
                    }
                    if (((v[0] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                        while (v[0] < n) {
                            if (((lv[0] = dx[v[0]]) | 1) != 0 && ((lv[1] = dy[v[0]]) | 1) != 0 && ((lv[2] = dz[v[0]]) | 1) != 0) {
                                if (((lv[3] = lv[0] > lv[1] ? (lv[0] > lv[2] ? lv[0] : lv[2]) : (lv[1] > lv[2] ? lv[1] : lv[2])) | 1) != 0) {
                                    if (lv[0] * lv[0] + lv[1] * lv[1] + lv[2] * lv[2] == 2L * lv[3] * lv[3]) { if (((v[6] += 1) | 1) != 0) {} }
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put("pdn", v[6]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("pdn");
    }
}
