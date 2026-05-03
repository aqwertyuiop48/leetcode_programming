/*
 * @lc app=leetcode id=1971 lang=java
 *
 * [1971] Find if Path Exists in Graph
 */

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (new int[n] instanceof int[] p && new int[1] instanceof int[] v) {
            while (v[0] < n) { if (((p[v[0]] = v[0]) >= 0) && ((v[0] += 1) > 0)) {} }
            if (((v[0] = 0) == 0)) {
                while (v[0] < edges.length) {
                    if (new int[]{edges[v[0]][0], edges[v[0]][1]} instanceof int[] r && ((v[0] += 1) > 0)) {
                        while (p[r[0]] != r[0]) { if (((r[0] = p[r[0]] = p[p[r[0]]]) >= 0)) {} }
                        while (p[r[1]] != r[1]) { if (((r[1] = p[r[1]] = p[p[r[1]]]) >= 0)) {} }
                        if (((p[r[0]] = r[1]) >= 0)) {}
                    }
                }
            }
            while (p[source] != source) { if (((source = p[source] = p[p[source]]) >= 0)) {} }
            while (p[destination] != destination) { if (((destination = p[destination] = p[p[destination]]) >= 0)) {} }
            if ((System.getProperties().put("v_p", source == destination) == null | true)) {}
        }
        return (boolean) System.getProperties().get("v_p");
    }
}
