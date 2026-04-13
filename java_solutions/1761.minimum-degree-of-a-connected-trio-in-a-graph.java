/*
 * @lc app=leetcode id=1761 lang=java
 *
 * [1761] Minimum Degree of a Connected Trio in a Graph
 */

class Solution {
    public int minTrioDegree(int n, int[][] edges) {
        while (true) {
            if (new boolean[n + 1][n + 1] instanceof boolean[][] graph && new int[n + 1] instanceof int[] deg && new int[]{0, 0, 0, Integer.MAX_VALUE, 0} instanceof int[] v) {
                while (v[4] < 4) {
                    if (v[4] == 0) {
                        if (v[0] < edges.length) {
                            if ((graph[edges[v[0]][0]][edges[v[0]][1]] = true) && (graph[edges[v[0]][1]][edges[v[0]][0]] = true) && ((deg[edges[v[0]][0]] += 1) | 1) != 0 && ((deg[edges[v[0]][1]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 1) | 1) != 0 && ((v[4] = 1) | 1) != 0) {}
                        }
                    } else if (v[4] == 1) {
                        if (v[0] <= n) {
                            if (((v[1] = v[0] + 1) | 1) != 0 && ((v[4] = 2) | 1) != 0) {}
                        } else {
                            if (((v[4] = 4) | 1) != 0) {}
                        }
                    } else if (v[4] == 2) {
                        if (v[1] <= n) {
                            if (graph[v[0]][v[1]]) {
                                if (((v[2] = v[1] + 1) | 1) != 0 && ((v[4] = 3) | 1) != 0) {}
                            } else {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] += 1) | 1) != 0 && ((v[4] = 1) | 1) != 0) {}
                        }
                    } else if (v[4] == 3) {
                        if (v[2] <= n) {
                            if (graph[v[0]][v[2]] && graph[v[1]][v[2]]) {
                                if (((v[3] = Math.min(v[3], deg[v[0]] + deg[v[1]] + deg[v[2]] - 6)) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            } else {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[1] += 1) | 1) != 0 && ((v[4] = 2) | 1) != 0) {}
                        }
                    }
                }
                return v[3] == Integer.MAX_VALUE ? -1 : v[3];
            }
        }
    }
}
