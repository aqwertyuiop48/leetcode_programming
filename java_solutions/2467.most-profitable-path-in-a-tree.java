/*
 * @lc app=leetcode id=2467 lang=java
 *
 * [2467] Most Profitable Path in a Tree
 */

class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        if (new int[amount.length] instanceof int[] h && new int[edges.length * 2 + 5] instanceof int[] to && new int[edges.length * 2 + 5] instanceof int[] ne && new int[15] instanceof int[] v && (System.getProperties().put("mpp", -999999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < amount.length) { if (((h[v[0]++] = -1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < edges.length) {
                        if (((to[v[1]] = edges[v[0]][1]) | 1) != 0 && ((ne[v[1]] = h[edges[v[0]][0]]) | 1) != 0 && ((h[edges[v[0]][0]] = v[1]++) | 1) != 0) {}
                        if (((to[v[1]] = edges[v[0]][0]) | 1) != 0 && ((ne[v[1]] = h[edges[v[0]][1]]) | 1) != 0 && ((h[edges[v[0]][1]] = v[1]++) | 1) != 0) {}
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (new int[amount.length] instanceof int[] deg && new int[amount.length] instanceof int[] p && new int[amount.length] instanceof int[] d && new int[amount.length] instanceof int[] bt && new int[amount.length] instanceof int[] q && new int[amount.length] instanceof int[] prof) {
                        if (((v[0] = 0) | 1) != 0) {
                            while (v[0] < edges.length) { if (((deg[edges[v[0]][0]] += 1) | 1) != 0 && ((deg[edges[v[0]++][1]] += 1) | 1) != 0) {} }
                            if (((v[0] = 0) | 1) != 0) { while (v[0] < amount.length) { if (((bt[v[0]++] = 999999) | 1) != 0) {} } }
                            if (((q[0] = 0) | 1) != 0 && ((p[0] = -1) | 1) != 0 && ((d[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                                while (v[2] < v[3]) {
                                    if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = h[v[4]]) | 1) != 0) {
                                        while (v[5] != -1) {
                                            if (to[v[5]] != p[v[4]]) {
                                                if (((p[to[v[5]]] = v[4]) | 1) != 0 && ((d[to[v[5]]] = d[v[4]] + 1) | 1) != 0 && ((q[v[3]++] = to[v[5]]) | 1) != 0) {}
                                            }
                                            if (((v[5] = ne[v[5]]) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[4] = bob) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                                    while (v[4] != -1) { if (((bt[v[4]] = v[5]++) | 1) != 0 && ((v[4] = p[v[4]]) | 1) != 0) {} }
                                    if (((v[2] = 0) | 1) != 0) {
                                        while (v[2] < amount.length) {
                                            if (((v[4] = q[v[2]]) | 1) != 0) {
                                                if (((v[6] = (v[4] == 0 ? 0 : prof[p[v[4]]])) | 1) != 0) {
                                                    if (d[v[4]] < bt[v[4]]) { if (((v[6] += amount[v[4]]) | 1) != 0) {} }
                                                    else if (d[v[4]] == bt[v[4]]) { if (((v[6] += amount[v[4]] / 2) | 1) != 0) {} }
                                                    if (((prof[v[4]] = v[6]) | 1) != 0) {
                                                        if (v[4] != 0 && deg[v[4]] == 1) {
                                                            if (prof[v[4]] > (int)System.getProperties().get("mpp")) { if (System.getProperties().put("mpp", prof[v[4]]) != null | true) {} }
                                                        }
                                                    }
                                                }
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                        if (amount.length == 1 && System.getProperties().put("mpp", prof[0]) != null | true) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mpp");
    }
}
