/*
 * @lc app=leetcode id=2812 lang=java
 *
 * [2812] Find the Safest Path in a Grid
 */

class Solution {
    public int maximumSafenessFactor(java.util.List<java.util.List<Integer>> grid) {
        if (new int[grid.size()][grid.get(0).size()] instanceof int[][] dist && new int[15] instanceof int[] v && (System.getProperties().put("msf", 0) != null | true)) {
            if (((v[0] = grid.size()) | 1) != 0 && new int[v[0] * v[0] + 5] instanceof int[] qx && new int[v[0] * v[0] + 5] instanceof int[] qy && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[1] < v[0]) {
                    if (((v[4] = 0) | 1) != 0) {
                        while (v[4] < v[0]) {
                            if (grid.get(v[1]).get(v[4]) == 1) { if (((dist[v[1]][v[4]] = 0) | 1) != 0 && ((qx[v[3]] = v[1]) | 1) != 0 && ((qy[v[3]++] = v[4]) | 1) != 0) {} }
                            else { if (((dist[v[1]][v[4]] = 999999) | 1) != 0) {} }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (new int[]{-1, 1, 0, 0} instanceof int[] dx && new int[]{0, 0, -1, 1} instanceof int[] dy) {
                    while (v[2] < v[3]) {
                        if (((v[4] = qx[v[2]]) | 1) != 0 && ((v[5] = qy[v[2]++]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[6] < 4) {
                                if (((v[7] = v[4] + dx[v[6]]) | 1) != 0 && ((v[8] = v[5] + dy[v[6]]) | 1) != 0) {
                                    if (v[7] >= 0 && v[7] < v[0] && v[8] >= 0 && v[8] < v[0] && dist[v[4]][v[5]] + 1 < dist[v[7]][v[8]]) {
                                        if (((dist[v[7]][v[8]] = dist[v[4]][v[5]] + 1) | 1) != 0 && ((qx[v[3]] = v[7]) | 1) != 0 && ((qy[v[3]++] = v[8]) | 1) != 0) {}
                                    }
                                }
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 800) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[1] <= v[2]) {
                            if (((v[4] = v[1] + (v[2] - v[1]) / 2) | 1) != 0 && dist[0][0] >= v[4] && dist[v[0]-1][v[0]-1] >= v[4]) {
                                if (new int[v[0]][v[0]] instanceof int[][] vis && ((v[5] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0 && ((qx[0] = 0) | 1) != 0 && ((qy[0] = 0) | 1) != 0 && ((vis[0][0] = 1) | 1) != 0) {
                                    while (v[5] < v[6]) {
                                        if (((v[7] = qx[v[5]]) | 1) != 0 && ((v[8] = qy[v[5]++]) | 1) != 0 && ((v[9] = 0) | 1) != 0) {
                                            while (v[9] < 4) {
                                                if (((v[10] = v[7] + dx[v[9]]) | 1) != 0 && ((v[11] = v[8] + dy[v[9]]) | 1) != 0) {
                                                    if (v[10] >= 0 && v[10] < v[0] && v[11] >= 0 && v[11] < v[0] && vis[v[10]][v[11]] == 0 && dist[v[10]][v[11]] >= v[4]) {
                                                        if (((vis[v[10]][v[11]] = 1) | 1) != 0 && ((qx[v[6]] = v[10]) | 1) != 0 && ((qy[v[6]++] = v[11]) | 1) != 0) {}
                                                    }
                                                }
                                                if (((v[9] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (vis[v[0]-1][v[0]-1] == 1) { if (((v[3] = v[4]) | 1) != 0 && ((v[1] = v[4] + 1) | 1) != 0) {} }
                                    else { if (((v[2] = v[4] - 1) | 1) != 0) {} }
                                }
                            } else {
                                if (((v[2] = v[4] - 1) | 1) != 0) {}
                            }
                        }
                        if (System.getProperties().put("msf", v[3]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("msf");
    }
}
