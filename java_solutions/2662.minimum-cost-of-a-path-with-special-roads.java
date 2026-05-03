/*
 * @lc app=leetcode id=2662 lang=java
 *
 * [2662] Minimum Cost of a Path With Special Roads
 */

class Solution {
    public int minimumCost(int[] start, int[] target, int[][] specialRoads) {
        if (new int[specialRoads.length * 2 + 2][2] instanceof int[][] pts && new int[10] instanceof int[] v && (System.getProperties().put("mcp", 0) != null | true)) {
            if (((pts[0] = start) != null | true) && ((pts[1] = target) != null | true) && ((v[0] = 0) | 1) != 0) {
                while (v[0] < specialRoads.length) {
                    if (((pts[v[0] * 2 + 2] = new int[]{specialRoads[v[0]][0], specialRoads[v[0]][1]}) != null | true) && ((pts[v[0] * 2 + 3] = new int[]{specialRoads[v[0]][2], specialRoads[v[0]][3]}) != null | true) && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[1] = pts.length) | 1) != 0 && new int[v[1]] instanceof int[] dist && new int[v[1]] instanceof int[] vis && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[1]) { if (((dist[v[2]++] = 999999999) | 1) != 0) {} }
                    if (((dist[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < v[1]) {
                            if (((v[3] = -1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < v[1]) {
                                    if (vis[v[4]] == 0 && (v[3] == -1 || dist[v[4]] < dist[v[3]])) { if (((v[3] = v[4]) | 1) != 0) {} }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                if (v[3] != -1 && ((vis[v[3]] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                    while (v[4] < v[1]) {
                                        if (vis[v[4]] == 0) {
                                            if (((v[5] = dist[v[3]] + Math.abs(pts[v[3]][0] - pts[v[4]][0]) + Math.abs(pts[v[3]][1] - pts[v[4]][1])) | 1) != 0) {
                                                if (v[5] < dist[v[4]]) { if (((dist[v[4]] = v[5]) | 1) != 0) {} }
                                            }
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                    if (((v[4] = 0) | 1) != 0) {
                                        while (v[4] < specialRoads.length) {
                                            if (((v[5] = dist[v[3]] + Math.abs(pts[v[3]][0] - specialRoads[v[4]][0]) + Math.abs(pts[v[3]][1] - specialRoads[v[4]][1]) + specialRoads[v[4]][4]) | 1) != 0) {
                                                if (v[5] < dist[v[4] * 2 + 3]) { if (((dist[v[4] * 2 + 3] = v[5]) | 1) != 0) {} }
                                            }
                                            if (((v[4] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put("mcp", dist[1]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mcp");
    }
}
