/*
 * @lc app=leetcode id=1319 lang=java
 *
 * [1319] Number of Operations to Make Network Connected
 */

class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (new int[n] instanceof int[] p && new int[10] instanceof int[] v && (System.getProperties().put("mnc", -1) != null | true)) {
            if (connections.length < n - 1) { if (System.getProperties().put("mnc", -1) != null | true) {} }
            else if (((v[0] = 0) | 1) != 0 && ((v[1] = n) | 1) != 0) {
                while (v[0] < n) { if (((p[v[0]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < connections.length) {
                        if (((v[2] = connections[v[0]][0]) | 1) != 0 && ((v[3] = connections[v[0]][1]) | 1) != 0) {
                            while (p[v[2]] != v[2]) { if (((v[2] = p[v[2]]) | 1) != 0) {} }
                            while (p[v[3]] != v[3]) { if (((v[3] = p[v[3]]) | 1) != 0) {} }
                            if (v[2] != v[3]) { if (((p[v[2]] = v[3]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mnc", v[1] - 1) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mnc");
    }
}
