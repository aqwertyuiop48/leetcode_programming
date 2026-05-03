/*
 * @lc app=leetcode id=2039 lang=java
 *
 * [2039] The Time When the Network Becomes Idle
 */

class Solution {
    public int networkBecomesIdle(int[][] edges, int[] patience) {
        if (new int[patience.length + 5] instanceof int[] head && new int[edges.length * 2 + 5] instanceof int[] to && new int[edges.length * 2 + 5] instanceof int[] next && new int[20] instanceof int[] v && (System.getProperties().put("nbi", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < patience.length) { if (((head[v[0]++] = -1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < edges.length) {
                        if (((to[v[1]] = edges[v[0]][1]) | 1) != 0 && ((next[v[1]] = head[edges[v[0]][0]]) | 1) != 0 && ((head[edges[v[0]][0]] = v[1]++) | 1) != 0) {}
                        if (((to[v[1]] = edges[v[0]][0]) | 1) != 0 && ((next[v[1]] = head[edges[v[0]][1]]) | 1) != 0 && ((head[edges[v[0]][1]] = v[1]++) | 1) != 0) {}
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (new int[patience.length] instanceof int[] dist && new int[patience.length] instanceof int[] q) {
                        if (((v[0] = 0) | 1) != 0) {
                            while (v[0] < patience.length) { if (((dist[v[0]++] = -1) | 1) != 0) {} }
                            if (((dist[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((q[v[3]++] = 0) | 1) != 0) {
                                while (v[2] < v[3]) {
                                    if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = head[v[4]]) | 1) != 0) {
                                        while (v[5] != -1) {
                                            if (dist[to[v[5]]] == -1) {
                                                if (((dist[to[v[5]]] = dist[v[4]] + 1) | 1) != 0 && ((q[v[3]++] = to[v[5]]) | 1) != 0) {}
                                            }
                                            if (((v[5] = next[v[5]]) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[0] = 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                    while (v[0] < patience.length) {
                                        if (((v[7] = dist[v[0]] * 2) | 1) != 0 && ((v[8] = (v[7] - 1) / patience[v[0]] * patience[v[0]] + v[7]) | 1) != 0) {
                                            if (v[8] > v[6]) { if (((v[6] = v[8]) | 1) != 0) {} }
                                        }
                                        if (((v[0] += 1) | 1) != 0) {}
                                    }
                                    if (System.getProperties().put("nbi", v[6] + 1) != null | true) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("nbi");
    }
}
