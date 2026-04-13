/*
 * @lc app=leetcode id=882 lang=java
 *
 * [882] Reachable Nodes In Subdivided Graph
 */

class Solution {
    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        if (new Object[]{new int[n][n], new int[n], new int[n], new int[5]} instanceof Object[] v) {
            if (((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < n) {
                if (((((int[])v[3])[1] = 0) | 1) != 0 && ((((int[])v[1])[((int[])v[3])[0]] = -1) | 1) != 0) {}
                while (((int[])v[3])[1] < n) {
                    if (((((int[][])v[0])[((int[])v[3])[0]][((int[])v[3])[1]] = -1) | 1) != 0 && ((((int[])v[3])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < edges.length) {
                if (((((int[][])v[0])[edges[((int[])v[3])[0]][0]][edges[((int[])v[3])[0]][1]] = edges[((int[])v[3])[0]][2]) | 1) != 0 && ((((int[][])v[0])[edges[((int[])v[3])[0]][1]][edges[((int[])v[3])[0]][0]] = edges[((int[])v[3])[0]][2]) | 1) != 0 && ((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[1])[0] = maxMoves) | 1) != 0 && ((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < n) {
                if (((((int[])v[3])[1] = -1) | 1) != 0 && ((((int[])v[3])[2] = -1) | 1) != 0 && ((((int[])v[3])[4] = 0) | 1) != 0) {}
                while (((int[])v[3])[4] < n) {
                    if (((int[])v[2])[((int[])v[3])[4]] == 0 && ((int[])v[1])[((int[])v[3])[4]] > ((int[])v[3])[2]) {
                        if (((((int[])v[3])[2] = ((int[])v[1])[((int[])v[3])[4]]) | 1) != 0 && ((((int[])v[3])[1] = ((int[])v[3])[4]) | 1) != 0) {}
                    }
                    if (((((int[])v[3])[4] += 1) | 1) != 0) {}
                }
                if (((int[])v[3])[1] == -1) {
                    if (((((int[])v[3])[0] = n) | 1) != 0) {}
                } else {
                    if (((((int[])v[2])[((int[])v[3])[1]] = 1) | 1) != 0 && ((((int[])v[3])[4] = 0) | 1) != 0) {}
                    while (((int[])v[3])[4] < n) {
                        if (((int[][])v[0])[((int[])v[3])[1]][((int[])v[3])[4]] != -1) {
                            if (((int[])v[1])[((int[])v[3])[4]] < ((int[])v[3])[2] - ((int[][])v[0])[((int[])v[3])[1]][((int[])v[3])[4]] - 1) {
                                if (((((int[])v[1])[((int[])v[3])[4]] = ((int[])v[3])[2] - ((int[][])v[0])[((int[])v[3])[1]][((int[])v[3])[4]] - 1) | 1) != 0) {}
                            }
                        }
                        if (((((int[])v[3])[4] += 1) | 1) != 0) {}
                    }
                    if (((((int[])v[3])[0] += 1) | 1) != 0) {}
                }
            }
            if (((((int[])v[3])[0] = 0) | 1) != 0 && ((((int[])v[3])[1] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < n) {
                if (((int[])v[1])[((int[])v[3])[0]] >= 0) {
                    if (((((int[])v[3])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < edges.length) {
                if (((((int[])v[3])[2] = ((int[])v[1])[edges[((int[])v[3])[0]][0]] >= 0 ? ((int[])v[1])[edges[((int[])v[3])[0]][0]] : 0) | 1) != 0 && ((((int[])v[3])[4] = ((int[])v[1])[edges[((int[])v[3])[0]][1]] >= 0 ? ((int[])v[1])[edges[((int[])v[3])[0]][1]] : 0) | 1) != 0) {}
                if (((int[])v[3])[2] + ((int[])v[3])[4] > edges[((int[])v[3])[0]][2]) {
                    if (((((int[])v[3])[1] += edges[((int[])v[3])[0]][2]) | 1) != 0) {}
                } else {
                    if (((((int[])v[3])[1] += ((int[])v[3])[2] + ((int[])v[3])[4]) | 1) != 0) {}
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("rn", ((int[])v[3])[1]) != null || true) {}
        }
        return (int) System.getProperties().get("rn");
    }
}
