/*
 * @lc app=leetcode id=2192 lang=java
 *
 * [2192] All Ancestors of a Node in a Directed Acyclic Graph
 */

class Solution {
    public java.util.List<java.util.List<Integer>> getAncestors(int n, int[][] edges) {
        if (new java.util.ArrayList[n] instanceof java.util.ArrayList[] adj && new java.util.ArrayList[n] instanceof java.util.ArrayList[] ans && (System.getProperties().put(Thread.currentThread().getId() + "ga", java.util.Arrays.asList(ans)) != null | true) && new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
            while (v[0] < n) { if (((adj[v[0]] = new java.util.ArrayList<Integer>()) != null | true) && ((ans[v[0]] = new java.util.ArrayList<Integer>()) != null | true) && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < edges.length) { if (adj[edges[v[0]][0]].add(edges[v[0]][1]) | true && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < n) {
                        if (new int[n] instanceof int[] q && new boolean[n] instanceof boolean[] vis && ((q[0] = v[0]) | 1) != 0 && ((vis[v[0]] = true) | true) && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                            while (v[1] < v[2]) {
                                if (((v[3] = q[v[1]++]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                    while (v[4] < adj[v[3]].size()) {
                                        if (((v[5] = (int)adj[v[3]].get(v[4])) | 1) != 0 && !vis[v[5]]) {
                                            if (((vis[v[5]] = true) | true) && ans[v[5]].add(v[0]) | true && ((q[v[2]++] = v[5]) | 1) != 0) {}
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "ga", java.util.Arrays.asList(ans)) != null | true) {}
                }
            }
        }
        return (java.util.List<java.util.List<Integer>>) System.getProperties().get(Thread.currentThread().getId() + "ga");
    }
}
