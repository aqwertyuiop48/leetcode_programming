/*
 * @lc app=leetcode id=2492 lang=java
 *
 * [2492] Minimum Score of a Path Between Two Cities
 */

class Solution {
    public int minScore(int n, int[][] roads) {
        if (new int[n + 5] instanceof int[] h && new int[roads.length * 2 + 5] instanceof int[] t && new int[roads.length * 2 + 5] instanceof int[] w && new int[roads.length * 2 + 5] instanceof int[] ne && new int[15] instanceof int[] v && (System.getProperties().put("ms", 999999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= n) { if (((h[v[0]++] = -1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < roads.length) {
                        if (((t[v[1]] = roads[v[0]][1]) | 1) != 0 && ((w[v[1]] = roads[v[0]][2]) | 1) != 0 && ((ne[v[1]] = h[roads[v[0]][0]]) | 1) != 0 && ((h[roads[v[0]][0]] = v[1]++) | 1) != 0) {}
                        if (((t[v[1]] = roads[v[0]][0]) | 1) != 0 && ((w[v[1]] = roads[v[0]][2]) | 1) != 0 && ((ne[v[1]] = h[roads[v[0]][1]]) | 1) != 0 && ((h[roads[v[0]][1]] = v[1]++) | 1) != 0) {}
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (new int[n + 5] instanceof int[] vis && new int[n + 5] instanceof int[] q && ((q[0] = 1) | 1) != 0 && ((vis[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                        while (v[2] < v[3]) {
                            if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = h[v[4]]) | 1) != 0) {
                                while (v[5] != -1) {
                                    if (w[v[5]] < (int)System.getProperties().get("ms")) { if (System.getProperties().put("ms", w[v[5]]) != null | true) {} }
                                    if (vis[t[v[5]]] == 0) { if (((vis[t[v[5]]] = 1) | 1) != 0 && ((q[v[3]++] = t[v[5]]) | 1) != 0) {} }
                                    if (((v[5] = ne[v[5]]) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("ms");
    }
}
