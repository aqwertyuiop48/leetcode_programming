/*
 * @lc app=leetcode id=847 lang=java
 *
 * [847] Shortest Path Visiting All Nodes
 */

class Solution {
    public int shortestPathLength(int[][] graph) {
        if (System.getProperties().put("ans", 0) != null || true) {
            if (new int[]{0, 0, 0, graph.length, (1 << graph.length) - 1, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[60000][3], new boolean[graph.length][1 << graph.length]} instanceof Object[] obj) {
                while (v[0] < 5) {
                    if (v[0] == 0) {
                        if (v[1] < v[3]) {
                            if ((((int[][])obj[0])[v[2]][0] = v[1]) != -1 && ((((int[][])obj[0])[v[2]][1] = (1 << v[1])) != -1) && ((((int[][])obj[0])[v[2]][2] = 0) == 0)) {
                                if ((((boolean[][])obj[1])[v[1]][1 << v[1]] = true) || true) {
                                    if (((v[2] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < v[2]) {
                            if (((v[5] = ((int[][])obj[0])[v[1]][0]) | 1) != 0 && ((v[6] = ((int[][])obj[0])[v[1]][1]) | 1) != 0 && ((v[7] = ((int[][])obj[0])[v[1]][2]) | 1) != 0) {
                                if (v[6] == v[4]) {
                                    if (System.getProperties().put("ans", v[7]) != null || true) {
                                        if (((v[0] = 99) | 1) != 0) {}
                                    }
                                } else {
                                    if (((v[0] = 2) | 1) != 0 && ((v[9] = 0) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[9] < graph[v[5]].length) {
                            if (((v[10] = graph[v[5]][v[9]]) | 1) != 0 && ((v[11] = v[6] | (1 << v[10])) | 1) != 0) {
                                if (!((boolean[][])obj[1])[v[10]][v[11]]) {
                                    if ((((boolean[][])obj[1])[v[10]][v[11]] = true) || true) {
                                        if ((((int[][])obj[0])[v[2]][0] = v[10]) != -1 && ((((int[][])obj[0])[v[2]][1] = v[11]) != -1) && ((((int[][])obj[0])[v[2]][2] = v[7] + 1) != -1)) {
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                            if (((v[9] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int)System.getProperties().get("ans");
    }
}
