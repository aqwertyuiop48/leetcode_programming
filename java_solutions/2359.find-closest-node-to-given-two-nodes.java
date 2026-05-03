/*
 * @lc app=leetcode id=2359 lang=java
 *
 * [2359] Find Closest Node to Given Two Nodes
 */

class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if (new int[edges.length] instanceof int[] d1 && new int[edges.length] instanceof int[] d2 && new int[15] instanceof int[] v && (System.getProperties().put("cmn", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < edges.length) { if (((d1[v[0]] = -1) | 1) != 0 && ((d2[v[0]] = -1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[1] = node1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] != -1 && d1[v[1]] == -1) { if (((d1[v[1]] = v[2]++) | 1) != 0 && ((v[1] = edges[v[1]]) | 1) != 0) {} }
                }
                if (((v[1] = node2) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] != -1 && d2[v[1]] == -1) { if (((d2[v[1]] = v[2]++) | 1) != 0 && ((v[1] = edges[v[1]]) | 1) != 0) {} }
                }
                if (((v[3] = 999999999) | 1) != 0 && ((v[4] = -1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < edges.length) {
                        if (d1[v[0]] != -1 && d2[v[0]] != -1) {
                            if (((v[5] = Math.max(d1[v[0]], d2[v[0]])) | 1) != 0) {
                                if (v[5] < v[3]) { if (((v[3] = v[5]) | 1) != 0 && ((v[4] = v[0]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("cmn", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("cmn");
    }
}
