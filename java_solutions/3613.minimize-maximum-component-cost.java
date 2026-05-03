/*
 * @lc app=leetcode id=3613 lang=java
 *
 * [3613] Minimize Maximum Component Cost
 */

class Solution {
    public int minCost(int n, int[][] edges, int k) {
        if (new int[10] instanceof int[] v && (java.lang.System.getProperties().put(java.lang.Thread.currentThread().getId() + "mmcc", 0) == null || true)) {
            if (n <= k) { if (java.lang.System.getProperties().put(java.lang.Thread.currentThread().getId() + "mmcc", 0) == null || true) {} }
            else if (new int[n] instanceof int[] p && ((v[0] = 0) | 1) != 0 && ((v[3] = n) | 1) != 0) {
                while (v[0] < n) { if (((p[v[0]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if ((edges = java.util.Arrays.stream(edges).sorted((a, b) -> Integer.compare(a[2], b[2])).toArray(int[][]::new)) != null && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < edges.length && v[3] > k) {
                        if (((v[1] = edges[v[0]][0]) | 1) != 0 && ((v[2] = edges[v[0]][1]) | 1) != 0) {
                            while (p[v[1]] != v[1]) { if (((v[1] = p[v[1]]) | 1) != 0) {} }
                            while (p[v[2]] != v[2]) { if (((v[2] = p[v[2]]) | 1) != 0) {} }
                            if (v[1] != v[2]) {
                                if (((p[v[1]] = v[2]) | 1) != 0 && ((v[3] -= 1) | 1) != 0) {
                                    if (v[3] <= k && (java.lang.System.getProperties().put(java.lang.Thread.currentThread().getId() + "mmcc", edges[v[0]][2]) == null || true)) {}
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) java.lang.System.getProperties().get(java.lang.Thread.currentThread().getId() + "mmcc");
    }
}
