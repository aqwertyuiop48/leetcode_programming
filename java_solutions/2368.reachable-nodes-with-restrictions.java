/*
 * @lc app=leetcode id=2368 lang=java
 *
 * [2368] Reachable Nodes With Restrictions
 */

class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        if (new int[n] instanceof int[] h && new int[edges.length * 2 + 5] instanceof int[] to && new int[edges.length * 2 + 5] instanceof int[] ne && new int[15] instanceof int[] v && (System.getProperties().put("rnwr", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) { if (((h[v[0]++] = -1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < edges.length) {
                        if (((to[v[1]] = edges[v[0]][1]) | 1) != 0 && ((ne[v[1]] = h[edges[v[0]][0]]) | 1) != 0 && ((h[edges[v[0]][0]] = v[1]++) | 1) != 0) {}
                        if (((to[v[1]] = edges[v[0]][0]) | 1) != 0 && ((ne[v[1]] = h[edges[v[0]][1]]) | 1) != 0 && ((h[edges[v[0]][1]] = v[1]++) | 1) != 0) {}
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (new int[n] instanceof int[] r && new int[n] instanceof int[] q) {
                        if (((v[0] = 0) | 1) != 0) {
                            while (v[0] < restricted.length) { if (((r[restricted[v[0]++]] = 1) | 1) != 0) {} }
                            if (((q[0] = 0) | 1) != 0 && ((r[0] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                                while (v[2] < v[3]) {
                                    if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = h[v[4]]) | 1) != 0) {
                                        while (v[5] != -1) {
                                            if (r[to[v[5]]] == 0) { if (((r[to[v[5]]] = 1) | 1) != 0 && ((q[v[3]++] = to[v[5]]) | 1) != 0) {} }
                                            if (((v[5] = ne[v[5]]) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (System.getProperties().put("rnwr", v[3]) != null | true) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("rnwr");
    }
}
